package com.walking.intensive.chapter2.task9;

import org.junit.jupiter.api.Test;

import static com.walking.intensive.chapter2.task9.Task9.getPascalTriangle;

class Task9Test {

    @Test
    void getPascalTriangleTest() {
        String pascalTriangle = getPascalTriangle(25);
        System.out.println(pascalTriangle);
    }
}