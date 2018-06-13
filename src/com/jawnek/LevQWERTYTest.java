package com.jawnek;

import org.junit.Test;

import static org.junit.Assert.*;

public class LevQWERTYTest {

    @Test
    public void levQWERTYtest() {
        assertEquals(1.5, LevQWERTY.levQWERTY("kot", "kita"), 0.0);
        assertEquals(2.0, LevQWERTY.levQWERTY("drab", "dal"), 0.0);
        assertEquals(1.0, LevQWERTY.levQWERTY("kurczak", "kutczal"), 0.0);
        assertEquals(0.5, LevQWERTY.levQWERTY("gierka", "gierks"), 0.0);
        assertEquals(6.0, LevQWERTY.levQWERTY("bilard", "kregle"), 0.0);
        assertEquals(4.0, LevQWERTY.levQWERTY("krzysiek", "krzysztof"), 0.0);
    }
}