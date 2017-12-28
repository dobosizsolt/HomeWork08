package com.company;

import java.io.FileOutputStream;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1. feladat ellenőrzés
        // FileOperation.fileMaker("D:\\", "proba.txt");

        // 2. feladat ellenőrzés
        //FileOperation.fileMaker("D:\\", 3, "proba.txt");

        // 3. feladat ellenőrzés
        //FileOperation.fileMakerWithContent("Remélem most jó lesz!","D:\\", "proba.txt");

        // 4. feladat ellenőrzés
        //FileOperation.fileMakerWithContent("Remélem most jó lesz!",3,"D:\\", "proba.txt");

        // 5. feladat ellenőrzés
        FileOperation.printMatrixIntoFile(generateMatrix());
    }

    public static int[][] generateMatrix() {

        Random random = new Random();

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(5);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }
}
