package com.bridgelabz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GreaterNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,34,56,76,87) ;
        List<Integer> greater =list.stream().filter(i -> i>50).collect(Collectors.toList()) ;
        System.out.println(greater);
    }
}
