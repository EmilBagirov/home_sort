package com.company;


import java.util.Arrays;

public class BubleSort implements ISort {
    Integer [] a;

    public Integer[] getA() {
        return a;
    }

    public void setA(Integer[] a) {
        this.a = a;
    }

    public BubleSort(Integer[] a) {
        this.a = a;
    }

    @Override
    public void sort() {
        int k = 1;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }

            }
            System.out.println("Step" + k + ": " + Arrays.toString(a));
            k++;
        }
        System.out.println();

    }
}
