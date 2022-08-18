package org.mowitnow.service;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerServiceTest {

    @Test
    public void run() throws IOException {
        MowerService mowerService = new MowerService();

        assertEquals("(1, 3) NORTH", mowerService.run().get(0));
        assertEquals("(5, 1) EAST", mowerService.run().get(1));
    }
}