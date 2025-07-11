package com.vetias.java.workshop.basic.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.workshop.lamda.Square;


public class SquareTest {
    @Test
    public void testSquare(){
        Square square = (int x) -> x*x;
        Assertions.assertEquals(36,square.findSquare(6));
    }
}