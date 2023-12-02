package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/company/input.txt");
        Scanner sc = new Scanner(file);

        List<Integer> numbers = new ArrayList<>();

        while (sc.hasNext()) {
          String nextToken = sc.nextLine();
          numbers.add(Integer.parseInt(nextToken));
        }
        sc.close();

        int numberOfUps = 0;

        for (int i = 0; i < numbers.size() - 3; i ++) {
            if (numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2) < (numbers.get(i + 1) + numbers.get(i + 2) + numbers.get(i + 3))) {
                numberOfUps++ ;
            }
        }

        System.out.println(numberOfUps);

    }
}
