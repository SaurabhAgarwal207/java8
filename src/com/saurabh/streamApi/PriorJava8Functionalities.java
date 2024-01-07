package com.saurabh.streamApi;

import java.util.ArrayList;
import java.util.List;

public class PriorJava8Functionalities {
    public static void main(String[] args) {
        //how to remove duplicate from collection before java8
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("C");
        List<String> uniqueList = new ArrayList<String>();
        for(String s: list){
            if(!uniqueList.contains(s)){
                uniqueList.add(s);
            }
        }
        System.out.println(uniqueList);




    }
}
