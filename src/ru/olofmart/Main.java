package ru.olofmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();
        Integer tmpNumber = 0;

        for (Integer number : intList) {
            if (number > 0 && number % 2 == 0) {
                resultList.add(number);
                }
            }

        Collections.sort(resultList);

        for (Integer number : resultList) {
            System.out.print(number + " ");
        }


    }
}
