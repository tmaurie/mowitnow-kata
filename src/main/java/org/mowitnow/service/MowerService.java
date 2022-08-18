package org.mowitnow.service;

import org.mowitnow.classes.Lawn;
import org.mowitnow.classes.LawnMower;
import org.mowitnow.utils.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MowerService {

    private final List<String> file;

    public MowerService(String filePath) throws IOException {
        file = FileReader.readFile(filePath);
    }

    public List<String> run() {
        List<String> result = new ArrayList<>();
        Lawn lawnMowerLawn = Lawn.initArea(file.get(0).split(" "));

        for (int i = 1; i < file.size(); i += 2) {

            LawnMower lawnMower = LawnMower.initMower(lawnMowerLawn, file.get(i));

            char[] instructions = FileReader.parseStringIntoCharArray(file.get(i + 1));
            for (char instruction : instructions) {
                if (lawnMowerLawn.isValid(lawnMower.getPosition())) {
                    lawnMower.move(instruction);
                }
            }
            result.add(lawnMower.toString());
        }
        return result;
    }


}
