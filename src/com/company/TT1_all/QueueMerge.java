package com.company.TT1_all;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMerge {
    public static PriorityQueue<Integer> merge(Queue<Integer> first, Queue<Integer> second){
        PriorityQueue<Integer> mergedQueue = new PriorityQueue<Integer>();

        //if both Queues are not empty
        while(!first.isEmpty() && !second.isEmpty()){
            //uses peek() function to look at values in the Queues
            Integer one = first.peek();
            Integer two = second.peek();


            if(one < two){
                mergedQueue.add(first.poll());
            }
            //if second queue has a value smaller than 1st queue
            else{
                mergedQueue.add(second.poll());
            }
        }

        //if the first queue has values but second queue is empty
        while (!first.isEmpty() && second.isEmpty()){
            mergedQueue.add(first.poll());
        }

        //first is empty and second has values
        while(!second.isEmpty() && first.isEmpty()){
            mergedQueue.add(second.poll());
        }

        return mergedQueue;
    }


    public static void main(String[] args){

        //creating queue1
        Queue qNums1 = new PriorityQueue<Integer>();
        qNums1.add(1);
        qNums1.add(4);
        qNums1.add(5);
        qNums1.add(8);
        //printing queue1
        System.out.println("first queue: " + qNums1);

        //creating queue2
        Queue qNums2 = new PriorityQueue<Integer>();
        qNums2.add(2);
        qNums2.add(3);
        qNums2.add(6);
        qNums2.add(7);
        System.out.println("second queue: " + qNums2);


        //merging Queues
        PriorityQueue merged = QueueMerge.merge(qNums1, qNums2);

        //print values in the merged Queue
        System.out.print("Merged Queue: ");
        for (Object data : merged)
            System.out.print(data + " -> ");
        System.out.print("nil");


    }
}
