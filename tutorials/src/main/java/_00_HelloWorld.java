import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI;

public class _00_HelloWorld {

    public static void main(String[] args) {

        ChatModel model = OpenAiChatModel.builder()
                .baseUrl("https://token-plan-cn.xiaomimimo.com/v1")
                .apiKey(ApiKeys.OPENAI_API_KEY)
                .modelName("mimo-v2.5-pro")
                .build();

        String answer = model.chat("Say Hello World");

        System.out.println(answer);
    }
}
