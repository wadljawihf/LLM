# encoding=utf-8
"""
requires openai == 1.25.0

references:
- https://github.com/openai/openai-python
- https://flowus.cn/share/bf106afc-6e3c-4b52-b7e4-bf23b3ec758

"""
{"steps":[
    {"explanation":"Start by isolating the term with the variable. Subtract 7 from both sides to do this.","output":"8x + 7 - 7 = -23 - 7"},
    {"explanation":"Simplify both sides. On the left side, 7 - 7 cancels out, and on the right side, -23 - 7 equals -30.","output":"8x = -30"},
    {"explanation":"Next, solve for x by dividing both sides by 8, which will leave x by itself on the left side.","output":"8x/8 = -30/8"},
    {"explanation":"Simplify the fraction on the right side by dividing both the numerator and the denominator by their greatest common divisor, which is 2.","output":"x = -15/4"}],
    "final_answer":"x = -15/4"}

from openai import OpenAI
from retry import retry
import httpx
import re
wrapper = None
class GPTAgent:
    def __init__(self) -> None:
        self.client = OpenAI(
            api_key=""
        )


    @retry(delay=0, tries=6, backoff=1, max_delay=120)
    def ask(self, content,examples=None,model="gpt-3.5-turbo-0125",temperature=0,previous_msg=[]):
        messages = []
        # messages.extend(previous_msg)

        if isinstance(previous_msg, list):
            for i, each_prompt in enumerate(previous_msg):
                if i % 2:
                    messages.append({"role": "user", "content": each_prompt})
                else:
                    messages.append({"role": "assistant", "content": each_prompt})
        # if isinstance(content,list):
        #     for i,each_prompt in enumerate(content):
        #         if i%2:
        #             messages.append({"role": "user", "content": content})
        #         else:
        #             messages.append({"role": "user", "content": content})
        if examples:
            '''
            https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb
              {"role": "user", "content": "Help me translate the following corporate jargon into plain English."},
            {"role": "assistant", "content": "Sure, I'd be happy to!"},
            '''
            for user_prompt, response in examples:
                messages.extend([
                    {"role": "user",
                     "content": user_prompt},
                    {"role": "assistant",
                     "content": str(response)}])
        messages.append({"role": "user", "content": content})
        # print(">>>>messages: ",messages)
        completion = self.client.chat.completions.create(
            model=model,
            messages=messages,
            temperature=temperature,
            # response_format={"type": "json_object"}
        )
        # print(completion)
        return completion.choices[0].message.content

    def get_response(self, prompt,examples=None,model="gpt-3.5-turbo-0125",temperature=0,previous_msg=[]):
        answer = self.ask(prompt,examples,model,temperature,previous_msg)
        return answer
        # if len(eslint_rules_simple) > 0:
        #     # question = "Given a rule:\n\n"
        #     # question += rule
        #     # question += "Can you find a corresponding rule in the following rule set?\n\n"
        #     # question += eslint_rules_simple
        #     answer = self.wrapper.ask(prompt)
        #     print(answer)

if __name__ == "__main__":
    ga = GPTAgent()
    ans = ga.get_response("Explain what is AI in one sentence.",temperature=0.2)
    print(ans)