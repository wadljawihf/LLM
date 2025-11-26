from __future__ import annotations

import os
from typing import Optional, Literal, Tuple
from tenacity import retry, stop_after_attempt, wait_exponential

# pip install openai tenacity
from openai import OpenAI


class DeepseekWrapper:
    def __init__(self, api_key: Optional[str] = None, base_url: str = "https://api.deepseek.com"):
        api_key = api_key or os.getenv("DEEPSEEK_API_KEY")
        api_key = "sk-af3acc3ab71149c88cc65a98b77cb453"
        if not api_key:
            raise ValueError("DeepSeek API key not provided. Set DEEPSEEK_API_KEY or pass api_key.")
        self.client = OpenAI(api_key=api_key, base_url=base_url)

    @retry(stop=stop_after_attempt(6), wait=wait_exponential(multiplier=1, max=120))
    def ask(
        self,
        prompt: str,
        model: Literal["deepseek-chat", "deepseek-reasoner"] = "deepseek-chat",
        temperature: float = 0.0,
        thinking_budget: int = 0,
        max_output_tokens: Optional[int] = None,
        return_reasoning: bool = False,
        messages: Optional[list[dict]] = None,
        **extra_kwargs,
    ) -> str | Tuple[str, Optional[str]]:
        if messages is None:
            msg = [{"role": "user", "content": prompt}]
        else:
            msg = messages


        req_kwargs = dict(
            model=model,
            messages=msg,
        )
        if max_output_tokens is not None:
            req_kwargs["max_tokens"] = max_output_tokens

        if model == "deepseek-chat" and temperature is not None:
            req_kwargs["temperature"] = float(temperature)


        req_kwargs.update(extra_kwargs)

        resp = self.client.chat.completions.create(**req_kwargs)
        choice = resp.choices[0].message

        answer = (choice.content or "").strip()
        reasoning = getattr(choice, "reasoning_content", None)

        if model == "deepseek-reasoner" and return_reasoning:
            return answer, (reasoning or "")
        return answer

    def get_response(self, prompt: str, **kwargs):
        return self.ask(prompt, **kwargs)



if __name__ == "__main__":

    ds = DeepseekWrapper()

    ans = ds.get_response("Explain what is AI in one sentence.", temperature=0.2, model="deepseek-chat")
    print("chat:", ans)

    ans2, cot = ds.get_response(
        "9.11 and 9.8 which is bigger? Give me the answer strictly.",
        model="deepseek-reasoner",
        return_reasoning=True,
        max_output_tokens=512,
    )
    print("reasoner_answer:", ans2)
    print("reasoner_cot:", cot[:200], "...")
