package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("file1.txt"));
        int x = sc.nextInt();
    }
}
