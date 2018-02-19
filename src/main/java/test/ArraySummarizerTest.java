package test;

import hello.ArraySummarizer.ArraySummarizer;
import hello.Summarizer.Summarizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ArraySummarizerTest {
    @Test
    public void summarize_null_array() throws Exception {
        int[] arr = null;
        int expected= 0;
        ArraySummarizer arraySummarizer = new ArraySummarizer();
        int actual = arraySummarizer.Summarize(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void summarize_empty_array() throws Exception {
        int[] arr = new int[0];
        int expected= 0;
        ArraySummarizer arraySummarizer = new ArraySummarizer();
        int actual = arraySummarizer.Summarize(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void summarize_array() throws Exception {
        int x=1;
        int y=1;
        int[] arr = new int[2];
        arr[0]=x;
        arr[1]=y;
        int expected= 2;
        ArraySummarizer arraySummarizer = new ArraySummarizer();
        int actual = arraySummarizer.Summarize(arr);
        assertEquals(expected,actual);
    }

}