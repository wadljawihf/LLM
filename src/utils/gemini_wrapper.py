# pip install google-genai retrying

from retrying import retry
from google import genai
from google.genai import types


from tenacity import retry, stop_after_attempt, wait_exponential
from google import genai
from google.genai import types
API_KEY = ""
class GeminiWrapper:
    def __init__(self):
        self.client = genai.Client(api_key=API_KEY) if API_KEY else genai.Client()

    @retry(stop=stop_after_attempt(6), wait=wait_exponential(multiplier=1, max=120))
    def ask(self, prompt: str, model: str = "gemini-2.5-flash",
            temperature: float = 0, thinking_budget: int = 0,
            max_output_tokens: int | None = None) -> str:
        resp = self.client.models.generate_content(
            model=model,
            contents=prompt,
            config=types.GenerateContentConfig(
                temperature=temperature,
                max_output_tokens=max_output_tokens,
                thinking_config=types.ThinkingConfig(thinking_budget=thinking_budget)
            ),
        )
        return resp.text

    def get_response(self, prompt: str, **kwargs) -> str:
        return self.ask(prompt, **kwargs)

if __name__ == "__main__":

    gw = GeminiWrapper()
    ans = gw.get_response("Explain what is AI in one sentence.", temperature=0.2)
    print(ans)
