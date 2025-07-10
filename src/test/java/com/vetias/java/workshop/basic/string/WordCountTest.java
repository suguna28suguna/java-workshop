package com.vetias.java.workshop.basic.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WordCountTest {
    @Test
    public void TestWordCount(){
        WordCount wordcount = new WordCount();
        int count = wordcount.count("this is a java program shows");
        Assertions.assertEquals(6, count);
    }
    @Test
    public void testAnotherString(){
        WordCount wordcount = new WordCount();
        int count = wordcount.count("java program ");
        Assertions.assertEquals(2, count);
    }
}
