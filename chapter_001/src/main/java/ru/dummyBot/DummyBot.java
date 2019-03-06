package ru.dummyBot;

/**
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Method answer
     * Answers questions.
     * @param question Question from client.
     * @return Answer.
     */
    public String  answerMethod(String question) {
        String answer = "";
        if ("Привет, Бот.".equals(question)) {
            answer = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            answer = "До скорой встречи.";
        } else {
            answer = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return answer;
    }

}