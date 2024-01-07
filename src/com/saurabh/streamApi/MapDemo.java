package com.saurabh.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"aaa");
        map.put(4,"bbb");
        map.put(3,"ccc");
        map.put(2,"ddd");
        map.put(5,"bbb");
        System.out.println("Keys :");
        System.out.println("Getting Keys "+map.keySet());
        System.out.println("Keys as stream");
        map.keySet().stream().forEach(x-> System.out.print(x+" "));
        System.out.println("\n==============");
        System.out.println("Values :");
        System.out.println(map.values());
        System.out.println("Values as Streams");
        map.values().stream().forEach(x-> System.out.print(x+" "));
        System.out.println("\n===================");
        System.out.println("Key and Value pairs :");
        System.out.println(map.entrySet());
        System.out.println("Key and Value pairs as stream :");
        map.entrySet().stream().forEach((x)->{
            System.out.print(x.getKey()+" ---> "+x.getValue()+"  ");
        });
        System.out.println("\n===================");
        System.out.println("sorting based on key descending");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(x-> System.out.print(x+" "));
        System.out.println("\n============");
        System.out.println("Sorting by value ascending");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x-> System.out.print(x+" "));
        System.out.println("\n============");
        System.out.println("Converting keyset to List");
        List<Integer> keySetList = map.keySet().stream().collect(Collectors.toList());
        System.out.print(keySetList+" ");
        System.out.println("\n============");
        System.out.println("Converting values to List");
        List<String> valueSetList = map.values().stream().collect(Collectors.toList());
        System.out.print(valueSetList+" ");
        System.out.println("\n============");


    }
}
