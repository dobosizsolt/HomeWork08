package com.company;

import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        // 1. feladat ellenőrzés
       // FileOperation.fileMaker("D:\\", "proba.txt");

        // 2. feladat ellenőrzés
        //FileOperation.fileMaker("D:\\", 3, "proba.txt");

        // 3. feladat ellenőrzés
        FileOperation.fileMakerWithContent("Remélem most jó lesz!","D:\\", "proba.txt");
    }
}
