package com.company.TT3;

import java.util.ArrayList;

public class BubbleSort extends Sorts{


    public String getlabel(){
        return "bubble";
    }



    public BubbleSort(int size) {
        super(size);
    }

    public void sort(ArrayList<Integer> array){
        for(int i = 0; i < array.size() - 1; i++){
            for ( int j = 0; j < array.size() - i - 1; j++){
                comparison_counter++;
                if(array.get(j) > array.get(j + 1)){
                    swap_counter++;
                    Integer temp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, temp);


                }
            }
        }
    }




    }

