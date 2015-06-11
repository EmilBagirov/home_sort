package com.company;

public class SelectionSort implements ISort {
    Integer[] a;

    public SelectionSort(Integer[] a) {
        this.a = a;
    }

    public Integer[] getA() {
        return a;
    }

    public void setA(Integer[] a) {
        this.a = a;
    }

    @Override
    public void sort() {
        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[index])
                    index = j;

            int smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;
        }
    }
}
