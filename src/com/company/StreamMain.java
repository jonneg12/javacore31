package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> result = inputList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted((x1, x2) -> x1 - x2)
                .collect(Collectors.toList());

        System.out.println("Input list:");
        System.out.println(inputList);

        System.out.println("================================");
        System.out.println("Filtered & sorted list:");
        System.out.println(result);
    }
}
