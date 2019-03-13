package ru.dummybot;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBotTest {
    /**
     * Test answerMethod().
     */
    @Test
    public void whenClientGreetsThenBotAnswers() {
    DummyBot bot = new DummyBot();
    String rezult = bot.answerMethod("Привет, Бот.");
    assertThat(rezult, is("Привет, умник."));
}

    @Test
    public void whenClientByeThenBotBye() {
        DummyBot bot = new DummyBot();
        String result = bot.answerMethod("Пока.");
        assertThat(result, is("До скорой встречи."));
    }

    @Test
    public void whenClientSaysUnknownPhraseThenBotSays() {
        DummyBot bot = new DummyBot();
        String result = bot.answerMethod("Я разговариваю с человеком или с машиной? ");
        assertThat(result, is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}