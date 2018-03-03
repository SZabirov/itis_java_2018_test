package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new FileInputStream("file1.txt"));
        int x = sc1.nextInt();
        Scanner sc2 = new Scanner(new FileInputStream("file2.txt"));
        int x2 = sc2.nextInt();
    }
}
