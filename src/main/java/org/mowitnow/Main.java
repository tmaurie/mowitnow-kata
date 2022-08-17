package org.mowitnow;

import org.mowitnow.service.MowerService;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        MowerService mowerService = new MowerService();
        System.out.println(mowerService.run());
    }


}