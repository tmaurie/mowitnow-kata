package org.mowitnow.service;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerServiceTest {

    private static final String INPUT_FILE_NAME = "src/main/resources/entryFile.txt";

    @Test
    public void run() throws IOException {
        MowerService mowerService = new MowerService(INPUT_FILE_NAME);

        assertEquals("1 3 N", mowerService.run().get(0));
        assertEquals("5 1 E", mowerService.run().get(1));
    }
}