package test;

import hello.ZerosToEnd.ZeroMover;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMoverTest {
    @Test
    public void move_zero() throws Exception {
        int[] arr = {1,0,2};
        int[] expected = {1,2,0};

        ZeroMover zeroMover = new ZeroMover();
        zeroMover.Move(arr);

        assertArrayEquals(arr,expected);
    }

    @Test
    public void move_2zeros() throws Exception {
        int[] arr = {1,2,0,0,3};
        int[] expected = {1,2,3,0,0};

        ZeroMover zeroMover = new ZeroMover();
        zeroMover.Move(arr);

        assertArrayEquals(arr,expected);
    }

    @Test
    public void move_zeros() throws Exception {
        int[] arr = {1,2,0,3,0};
        int[] expected = {1,2,3,0,0};

        ZeroMover zeroMover = new ZeroMover();
        zeroMover.Move(arr);

        assertArrayEquals(arr,expected);
    }

    @Test
    public void move_zeros_at_the_end() throws Exception {
        int[] arr = {1,2,0,3,0,0,0};
        int[] expected = {1,2,3,0,0,0,0};

        ZeroMover zeroMover = new ZeroMover();
        zeroMover.Move(arr);

        assertArrayEquals(arr,expected);
    }

}