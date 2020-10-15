package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (Integer integer : inputList) {
            if (integer > 0 && integer %2 == 0) {
                result.add(integer);
            }
        }

        result.sort((x1,x2) -> x1 - x2);

        System.out.println("Input list:");
        System.out.println(inputList);

        System.out.println("================================");
        System.out.println("Filtered & sorted list:");
        System.out.println(result);
    }
}

