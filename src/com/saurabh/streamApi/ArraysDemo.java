package com.saurabh.streamApi;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArraysDemo {
    public static void main(String[] args) {
        //array length
        System.out.println("Array length");
        int arr[]={1,4,3,2,5,2};
        long count = Arrays.stream(arr).count();
        System.out.println(count);
        //array iteration
        System.out.println("Array Iteration");
        Arrays.stream(arr).forEach((x)->{
            System.out.print(x+" ");
        });
        System.out.println();
        System.out.println("Array sorting");
        Arrays.stream(arr).sorted().forEach((x)->{
            System.out.print(x+" ");
        });
        System.out.println();
        System.out.println("Removing Duplicates");
        Arrays.stream(arr).distinct().forEach((x)->{
            System.out.print(x+" ");
        });
        System.out.println();
        System.out.println("Array Sum");
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = "+sum);
        System.out.println("Array Average");
        double average = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Average = "+average);
        System.out.println("Min and Max element");
        int min =Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min : "+min+" and Max : "+max);
        System.out.println("Even Numbers");
        Arrays.stream(arr).filter(x->x%2==0).forEach((x)->{
            System.out.print(x+" ");
        });
        System.out.println();
        System.out.println("How to check if stream is parallel or sequential");
        boolean flag = Arrays.stream(arr).isParallel();
        System.out.println("Is parallel :"+flag);
        System.out.println("Parallel Stream");
        Arrays.stream(arr).parallel().forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println("Distinct even");
        Arrays.stream(arr).distinct().filter(x-> x%2==0).forEach(x-> System.out.print(x+" "));

    }

}
