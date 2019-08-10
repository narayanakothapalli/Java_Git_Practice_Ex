package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOne {

    public static void main(String args[]){


        List<Integer> l1=new ArrayList<>();
        l1.add(0);
        l1.add(5);
        l1.add(10);
        l1.add(15);
        l1.add(20);
        l1.add(25);
        l1.add(30);

        List<Integer> finList=l1.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println(finList);



    }
}
