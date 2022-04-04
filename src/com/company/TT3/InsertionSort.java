package com.company.TT3;

import java.util.ArrayList;

public class InsertionSort extends Sorts{

    public String getlabel(){
        return "Insertion";

    }

    public InsertionSort(int size) {
        super(size);
    }

    public void sort(ArrayList<Integer> array){
        for (int j = 1; j < array.size(); j++){
            int current = array.get(j);
            int i = j-1;

            while((i>-1) && (array.get(i) > current)){
                comparison_counter = comparison_counter + 2;
                swap_counter++;
                array.set(i+1, array.get(i));
                i--;
            }
            array.set(i+1, current);
        }
    }

}
