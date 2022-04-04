package com.company.TT3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSort extends Sorts{

    public MergeSort(int size) {
        super(size);
    }

    public String getlabel(){
        return "Merge";
    }

    public void sort(ArrayList<Integer> a){
        divide(0, a.size()-1, a);

    }

    public void divide(int start, int end, ArrayList<Integer> original) {

        if(start<end && (end-start)>=1){
            int x = (end + start) / 2;
            divide(start, x, original);
            divide(x+1, end,original);
            merge(start, x, end, original);
        }
    }

    public void merge(int start, int mid, int end, ArrayList<Integer> unsorted){
        ArrayList<Integer> merged = new ArrayList<Integer>();
        int leftIndex = start;
        int rightIndex = mid+1;

        while(leftIndex<=mid && rightIndex<=end){
            comparison_counter++;
            if(unsorted.get(leftIndex)<=unsorted.get(rightIndex)){
                merged.add(unsorted.get(leftIndex));
                leftIndex++;
            }else{
                merged.add(unsorted.get(rightIndex));
                rightIndex++;
            }
        }

        //Either of below while loop will execute
        while(leftIndex<=mid){
            merged.add(unsorted.get(leftIndex));
            leftIndex++;
        }

        while(rightIndex<=end){
            merged.add(unsorted.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = start;
        //Setting sorted array to original one
        while(i<merged.size()){
            unsorted.set(j, merged.get(i++));
            j++;
        }
    }
}
