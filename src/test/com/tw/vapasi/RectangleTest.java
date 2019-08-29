package com.tw.vapasi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Nested
    class RectangleTestOnly {
        @Test
        void expectArea8With4And2() {
            Rectangle rectangle = Rectangle.createRectangle(4, 2);
            assertEquals(8, rectangle.area());
        }

        @Test
        void expectArea18With9And2() {
            Rectangle rectangle = Rectangle.createRectangle(9, 2);
            assertEquals(18, rectangle.area());
        }

        @Test
        void expectArea4Point5With2Point5And1Point8() {
            Rectangle rectangle = Rectangle.createRectangle(2.5, 1.8);
            assertEquals(4.5, rectangle.area());
        }

        @Test
        void expectArea12With4Point8And2Point5() {
            Rectangle rectangle = Rectangle.createRectangle(4.8, 2.5);
            assertEquals(12, rectangle.area());
        }

        @Test
        void expectPerimeter16With5And3() {
            Rectangle rectangle = Rectangle.createRectangle(5, 3);
            assertEquals(16, rectangle.perimeter());
        }

        @Test
        void expectPerimeter15With4And3Point5() {
            Rectangle rectangle = Rectangle.createRectangle(4, 3.5);
            assertEquals(15, rectangle.perimeter());
        }

        @Test
        void expectPerimeter18Point6With5Point5And3Point8() {
            Rectangle rectangle = Rectangle.createRectangle(5.5, 3.8);
            assertEquals(18.6, rectangle.perimeter());
        }
    }

    @Nested
    class SquareTestOnly {
        @Test
        void expectArea4WithInput2() {
            Rectangle square = Rectangle.createSquare(2);
            assertEquals(4, square.area());
        }

        @Test
        void expectArea4Point84WithInput2Point2() {
            Rectangle square = Rectangle.createSquare(2.2);
            assertEquals(4.84, square.area(), 0.001);
        }
    }
}
