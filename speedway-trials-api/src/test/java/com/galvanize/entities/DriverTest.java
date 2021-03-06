package com.galvanize.entities;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DriverTest {
    @Test
    void updateDriverTest(){
        Driver actual = new Driver();
        Driver expected = new Driver();
        expected.setId(1L);

        actual.update(expected);

        assertEquals(expected, actual);
    }
}
