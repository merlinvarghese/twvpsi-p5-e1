package com.tw.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void expectArea4WithInput2() {
        Square square = new Square(2);
        assertEquals(4, square.area());
    }
}
