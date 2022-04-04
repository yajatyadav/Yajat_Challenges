package com.company.TT3;

import java.util.ArrayList;

public class SelectionSort extends Sorts {


    public SelectionSort(int size) {
        super(size);
    }


    public String getlabel(){
        return "selection";
    }

    public void sort(ArrayList<Integer> a) {
        int n = a.size();

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                comparison_counter++;
                if (a.get(j) < a.get(min_index)) {
                    min_index = j;
                }
            }
            swap_counter++;
            int temp = a.get(min_index);
            a.set(min_index, a.get(i));
            a.set(i, temp);

            }

        }
    }

