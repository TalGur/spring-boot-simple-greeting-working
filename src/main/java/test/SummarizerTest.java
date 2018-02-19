package test;

import hello.Summarizer.Summarizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class SummarizerTest {
    @Test
    public void sum() throws Exception {
        int x=1;
        int y=1;
        int expected= 2;
        Summarizer summarizer = new Summarizer();
        int actual = summarizer.Sum(x,y);
        assertEquals(expected,actual);
    }

}