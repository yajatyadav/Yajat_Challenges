# Yajat Challenges for Trimester 2

# [Review Ticket (Crossover Grading by Charlie)](https://github.com/yajatyadav/Yajat_Challenges/issues/1#issuecomment-1067075425)

# Navigating Notes and Plans for Each Tech Talk
- For each tech talk, I will keep notes in a running journal
- I will also preview each tech talk by reading through it once so that I am prepared to ask any questions I might have
- I will record the progress of PBL, the tech talks, and the individual challenges on my Github Page.

# Test Prep Plans and Participation
- for test prep, I will follow our 10-man group's operational officer's direction in completing MC, FRQ, and other review materials
- In addition, I will prep for the AP exam by going throuh AP classroom's unit videos, quizzes, as well as full-length MCs and FRQs
- I will also prepare by taking the concepts I learned, such as using arrays and recursion, and implement hem in PBL
- Concepts I will focus on:
  - Recursion
  - Iteration
  - 2D Arrays
  - Late-binding
  - Polymorphism
  - Constructing a class: constructors, getters, setters
  - Inheritance: super() constructor, overriding


# Data Structures Work

Tech Talk 0:
- Link to Repl: https://replit.com/@YajatYadav/Yajattri2challenges#Main.java
- Link to code on Github:https://github.com/yajatyadav/Yajat_Challenges/tree/master/src/com/company 

In the first challenge, I learned how to use try-catch to handle different types of exceptions. I used a String array to create a dynamic menu. I handled two exceptions to ensure that the user enters a number and that it is within bounds, as seen below: 
``` java
try {
            System.out.println(menu_items[Integer.parseInt(input)-1]);
        } catch (NumberFormatException e) {
            System.out.println("Make sure to enter a number as your choice!");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Please enter a choice between 1 and " + menu_items.length);
        }
```

In the second challenge (IntByReference), I created a swapper method. Since each integer is a member of an object, i used getter and setter methods to compare the two variables and assign new values to them. I used a temp variable to perform the switch between the two values. I also overrode the toString() method to display the integer value instead of the object's memory address.

``` java
public int getvalue(){
        return value;
    }

    public void setvalue(int a){
        value = a;
    }

    public void swapToLowHighOrder(IntByReference num){
        if (num.getvalue() < value){
            int temp = num.getvalue();
            num.setvalue(value);
            value = temp;
        }
    }

    public String toString(){
        return Integer.toString(value);
    }
```

In the third challenge, I practiced creating a custom toString() method to display a formatted string. My toString method consisted of two for loops: one traversed a 2D array forward (left-to-right, top-to-bottom) and one did so backwards (right-to-left, bottom-to-top). I also used methods to convert int to hexadecmial and used conditionals to format the numpad correctly. 

``` java
for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < 0){output += "  ";}
                else{output += Integer.toHexString(matrix[i][j]) + " ";}
            }
            output += "\n";
    }
        output += "\n\n";

        for (int a = matrix.length-1; a >= 0; a--){
            for (int b = matrix[a].length-1; b >= 0; b--){
                if(matrix[a][b]<0){output += "  ";}
                else{output += Integer.toHexString(matrix[a][b]) + " ";}
            }
            output += "\n";
        }

        return output;
    }
    
 ```
