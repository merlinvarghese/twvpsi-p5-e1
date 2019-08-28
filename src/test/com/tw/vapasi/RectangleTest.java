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
        Rectangle rectangle = new Rectangle(9, 2);
        assertEquals(18, rectangle.area());
    }

    @Test
    void shouldReturn4Point5With2Point5And1Point8() {
        Rectangle rectangle = new Rectangle(2.5, 1.8);
        assertEquals(4.5, rectangle.area());
    }

    @Test
    void shouldReturn12With4Point8And2Point5() {
        Rectangle rectangle = new Rectangle(4.8, 2.5);
        assertEquals(12, rectangle.area());
    }

    @Test
    void isPerimeter16With5And3(){
        Rectangle rectangle = new Rectangle(5, 3);
        assertEquals(16, rectangle.perimeter());
    }

    @Test
    void isPerimeter14With4And3(){
        Rectangle rectangle = new Rectangle(4, 3);
        assertEquals(14, rectangle.perimeter());
    }


}
