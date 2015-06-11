package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        randValues(list);
        Integer [] array = list.toArray(new Integer [list.size()]);

        BubleSort bS = new BubleSort(array);
        bS.sort();
        System.out.println("Buble Sorting completed. \n Result: "+ Arrays.toString(array));

        System.out.println("\n ------------------------------------------------------------------------------ \n");
        System.out.println("Starting selection sort process...\n");

        SelectionSort sS = new SelectionSort(array);
        sS.sort();
        System.out.println("Selection Sorting completed. \n Result: "+ Arrays.toString(array));
    }

    public static void randValues (List<Integer> list) {
        Random rand = new Random();
        for (int i=0; i<5; i++) {
            int val = rand.nextInt(100);
            if (val !=0) {
                list.add(val);
            }
        }
        System.out.println("Random values were generated: "+list+"\n\n Starting buble sort process...");
    }

}
