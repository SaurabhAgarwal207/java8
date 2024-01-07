package com.saurabh.streamApi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsDemo {
    public static void main(String[] args) {
        //Remove duplicates from collection using stream api
        System.out.println("unique List");
        List<String> myList = new ArrayList<String>();
        myList.add("A");
        myList.add("B");
        myList.add("B");
        myList.add("C");
        myList.add("A");
        //myList.add(null);
        List<String> uniqueList = myList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
        System.out.println("Remove null");
        myList.stream().filter(x->x!=null).forEach(x-> System.out.print(x+" "));
        System.out.println("\nRemove Duplicates");
        myList.stream().distinct().forEach((a)->{
            System.out.print(a+" ");
        });
        System.out.println("\nRemove duplicate and null both");
        myList.stream().distinct().filter(x->x!=null).forEach(p-> System.out.print(p+" "));
        System.out.println("not null ,Sorted and to Lower case");
        myList.stream().filter(x->x!=null).map(x->x.toLowerCase()).sorted().forEach(x-> System.out.print(x+" "));
        System.out.println("\nLimit");
        myList.stream().limit(3).forEach(x-> System.out.print(x+" "));
        System.out.println("\nSkip");
        myList.stream().skip(2).forEach((x)->{
            System.out.print(x+" ");
        });
        System.out.println("\nReduce");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int sum=list.stream().reduce((a,b)->a+b).get();
        System.out.println(sum);
        System.out.println("Count");
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("Max element");
        int max=list.stream().max((v1,v2)->v1.compareTo(v2)).get();
        System.out.println("Max = "+max);
        System.out.println("Min element");
        int min=list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println("Min = "+min);
        System.out.println("Collect as another stream");
        List<Integer> list2=list.stream().collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("Find first");
        int first =list.stream().findFirst().get();
        System.out.println(first);
        System.out.println("Find Any");
        int findAny= list.stream().findAny().get();
        System.out.println("find Any = "+findAny);
        boolean anyMatch= myList.stream().anyMatch(x->x.startsWith("C"));
        System.out.println("Any match ="+anyMatch);
    }
}
