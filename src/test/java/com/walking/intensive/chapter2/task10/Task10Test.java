package com.walking.intensive.chapter2.task10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter2.task10.Task10.isPalindrome;
import static org.junit.jupiter.params.provider.Arguments.of;

class Task10Test {

    @ParameterizedTest
    @MethodSource("testData")
    void isPalindromeTest(boolean expected, String input) {
        boolean actual = isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> testData() {
        return Stream.of(
                of(true, "Ежу хуже"),
                of(true, "Утоп в поту"),
                of(true, "Мат и тут и там"),
                of(true, "Кот, сука, за кусток"),
                of(true, "А вот и харя рахитова"),
                of(true, "Муза, ранясь шилом опыта, ты помолишься на разум"),
                of(true, "Дорог Рим город или дорог Миргород?!"),
                of(true, "Палиндромина - ни морд, ни лап"),
                of(false, "Муза, ранясь шилом опыта, ты помолишься на разумы"),
                of(false, "A"),
                of(false, "В русской литературе достоверно известно")
        );
    }
}