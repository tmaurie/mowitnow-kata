package org.mowitnow.utils;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mowitnow.utils.FileReader.INPUT_FILE;

public class FileReaderTest {

    @Test
    public void readFile() {
        try {
            List<String> lines = FileReader.readFile(INPUT_FILE);
            assertEquals(5, lines.size());
            assertEquals("5 5", lines.get(0));
            assertEquals("1 2 N", lines.get(1));
            assertEquals("GAGAGAGAA", lines.get(2));
            assertEquals("3 3 E", lines.get(3));
            assertEquals("AADAADADDA", lines.get(4));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}