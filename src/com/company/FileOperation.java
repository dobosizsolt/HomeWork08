package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

    public static void fileMaker(String path, String fileName) {
        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream(path + fileName);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void fileMaker(String path, int fileQuantity, String fileName) {

        String[] splFileName = new String[2];
        splFileName = fileName.split("\\.");
        FileOutputStream fout = null;

        try {
            for (int i = 1; i <= fileQuantity; i++) {
                String modifiedFileName = splFileName[0] + i + "." + splFileName[1];
                fout = new FileOutputStream(path + modifiedFileName);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void fileMakerWithContent(String text, String path, String fileName) {
        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream(path + fileName);
            fout.write(text.getBytes());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void fileMakerWithContent(String text, int fileQuantity, String path, String fileName) {

        String[] splFileName = new String[2];
        splFileName = fileName.split("\\.");
        FileOutputStream fout = null;

        try {
            for (int i = 1; i <= fileQuantity; i++) {
                String modifiedFileName = splFileName[0] + i + "." + splFileName[1];
                fout = new FileOutputStream(path + modifiedFileName);
                fout.write(text.getBytes());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void printMatrixIntoFile(int[][] mtx) {
        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("D:\\matrix.txt");
            for (int i = 0; i < mtx.length; i++) {
                for (int j = 0; j < mtx[i].length; j++) {
                    String matrix = String.valueOf(mtx[i][j]);
                    fout.write(matrix.getBytes());
                    fout.write("\t".getBytes());
                }
                fout.write("\r\n".getBytes());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
