package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("mango");
        arrayList.add("gauva");
        arrayList.add("mango");

        Set<String> s =new HashSet<>();

        for(String i : arrayList)
        {if(s.add(i)==false)
         System.out.println(i);
        }
    }
}
