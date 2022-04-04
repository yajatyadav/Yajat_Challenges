package com.company.TT3;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Sorts {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;
    public int comparison_counter = 0;
    public int swap_counter = 0;

    public int getComparison_counter(){
        return comparison_counter;
    }

    public int getSwap_counter(){
        return swap_counter;
    }




    public Sorts(int size) {
        comparison_counter = 0;
        swap_counter = 0;
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
//        System.out.println(this.getlabel());
//        System.out.println(data);
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        sort(data);


//        data.sort(Comparator.naturalOrder());
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
        System.out.println(this.getlabel());

        System.out.println(data);
//        System.out.println(getComparison_counter());
//        System.out.println(getSwap_counter());
//        System.out.println(getTimeElapsed());
//        System.out.println("\n");
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public String getlabel(){
        return "test";
    }

    public void sort(ArrayList<Integer> s){

    };


    public void tester(){
        int sum=0, time=0, TIMES=12, SIZE=5000;
//        Sorts x = new
    }



    public static void main(String[] args) {

        int sum=0, time=0, TIMES=12, SIZE=5000;
        int totalswap = 0, totalcomp = 0;



//for loop to test BubbleSort
        for(int i=0; i< TIMES; i++) {
            Sorts s = new BubbleSort(SIZE);

            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
//                 System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            System.out.println("Try " + i);
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            System.out.println("Comparisons made: " + s.getComparison_counter());
            System.out.println("Swaps  made: " + s.getSwap_counter());
            System.out.println("\n");
            time += s.getTimeElapsed();
            totalswap += s.getSwap_counter();
            totalcomp += s.getComparison_counter();
        }


        System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
        System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
        System.out.println("Average swaps made: " +  totalswap/ TIMES);
        System.out.println("\n \n \n");
        time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;

// for loop to test for SelectionSort
        for(int i=0; i< TIMES; i++) {
            Sorts s = new SelectionSort(SIZE);

            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
//                 System.out.println(s.getData());
                sum += s.getData().get(j);
            }

            System.out.println("Try " + i);
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            System.out.println("Comparisons made: " + s.getComparison_counter());
            System.out.println("Swaps  made: " + s.getSwap_counter());
            System.out.println("\n");
            time += s.getTimeElapsed();
            totalswap += s.getSwap_counter();
            totalcomp += s.getComparison_counter();
        }


        System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
        System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
        System.out.println("Average swaps made: " +  totalswap/ TIMES);
        System.out.println("\n \n \n");
        time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;

        // for loop to test for MergeSort
        for(int i=0; i< TIMES; i++) {
            Sorts s = new MergeSort(SIZE);

            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
//                 System.out.println(s.getData());
                sum += s.getData().get(j);
            }

            System.out.println("Try " + i);
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            System.out.println("Comparisons made: " + s.getComparison_counter());
            System.out.println("Swaps  made: " + s.getSwap_counter());
            System.out.println("\n");
            time += s.getTimeElapsed();
            totalswap += s.getSwap_counter();
            totalcomp += s.getComparison_counter();
        }


        System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
        System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
        System.out.println("Average swaps made: " +  totalswap/ TIMES);
        System.out.println("\n \n \n");
        time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;

        // for loop to test for InsertionSort
        for(int i=0; i< TIMES; i++) {
            Sorts s = new InsertionSort(SIZE);

            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
//                 System.out.println(s.getData());
                sum += s.getData().get(j);
            }

            System.out.println("Try " + i);
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            System.out.println("Comparisons made: " + s.getComparison_counter());
            System.out.println("Swaps  made: " + s.getSwap_counter());
            System.out.println("\n");
            time += s.getTimeElapsed();
            totalswap += s.getSwap_counter();
            totalcomp += s.getComparison_counter();
        }


        System.out.println("Overall Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
        System.out.println("Average comparisons made: " +  totalcomp/ TIMES);
        System.out.println("Average swaps made: " +  totalswap/ TIMES);
        System.out.println("\n \n \n");
        time = 0; sum = 0; totalcomp = 0 ; totalswap = 0;




    }



//    MergeSort merge_test = new MergeSort(5000);



}
