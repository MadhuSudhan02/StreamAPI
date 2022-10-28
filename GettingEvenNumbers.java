package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GettingEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList (1,2,3,44,45,68) ;
        //without stream API
//        List<Integer> listeven = new ArrayList<>() ;
//        for (Integer i : list) {
//            if(i%2==0) {
//                listeven.add(i) ;
//            }
//        }
//        System.out.println("arraylist" + list);
//        System.out.println("evenlist" + listeven);

        //with stream API

        Stream<Integer> stream1 = list.stream() ;
        List<Integer> newlist=stream1.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(newlist);
    }
}
