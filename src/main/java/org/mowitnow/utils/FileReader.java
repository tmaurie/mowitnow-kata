package org.mowitnow.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public static final String INPUT_FILE = "src/main/resources/entryFile.txt";

    /**
     * Reads the file and returns the content as a char array.
     *
     * @return the content of the file as a char array.
     * @throws IOException if the file cannot be read.
     */
    public static List<String> readFile(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }


    public static char[] parseStringIntoCharArray(String s) {
        return s.toCharArray();
    }

}
