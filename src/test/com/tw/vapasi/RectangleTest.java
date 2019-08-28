package com.tw.vapasi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void shouldReturn8With2And4() {
        Rectangle rectangle = new Rectangle(4, 2);
        assertEquals(8, rectangle.area());
    }

    @Test
    void shouldReturn18With2And9() {
        Rectangle rectangle = new Rectangle(2, 9);
        assertEquals(18, rectangle.area());
    }

    @Test
    void shouldReturn4Point5With2Point5And1Point8() {
        Rectangle rectangle = new Rectangle(2.5, 1.8);
        assertEquals(4.5, rectangle.area());
    }

    @Test
    void shouldReturn12With4Point8And2Point5() {
        Rectangle rectangle = new Rectangle(2.5f, 1.8f);
        assertEquals(12, rectangle.area());
    }
}
