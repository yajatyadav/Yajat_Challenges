{% include navigation.html %}
# Sorts
- This week I learned how to use a variety of sort algorithms
- I also implemented sorting in my custom implementation of a queue

## Bubble Sort
- simplest sorting algorithm
- repeatedly swaps adjacent elements if in wrong order
- Time complexity of O(n^2) because two for loops go through entire array
``` java
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
  ```
  
  ## Selection Sort
  - in the unsorted section, the minimum element is found and put at the beginning
  - two subarrays: one which is already sorted, remaning array which is unsorted
  - Time complexity; O(n^2) because there are two nested for loops
  
  ``` java
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
        
  ```
  
  ## Insertion Sort 
  - array is split into sorted and unsorted part
  - one at a time, values form unsorted part are put in the correct location of the sorted array
  - Time complexity is O(n^2) because there is 1 for loop and 1 while loop 

``` java
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
    
  ```
  
  ## Merge Sort
  - a Divide and Conquer Algorithm
  - array is repeatedly divided, sorted, and then later merged
  - useful 

``` java
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
    
    ```
  
