{% include navigation.html %}

# Yajat Challenges for Trimester 2

[Review Ticket 2 (Crossover Grading by Nick)](https://github.com/yajatyadav/Yajat_Challenges/issues/3)

[Review Ticket 1 (Crossover Grading by Kevin)](https://github.com/yajatyadav/Yajat_Challenges/issues/2)

[Review Ticket 0 (Crossover Grading by Charlie)](https://github.com/yajatyadav/Yajat_Challenges/issues/1#issuecomment-1067075425)

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

Tech Talk 1: 
- Link to code: https://github.com/yajatyadav/Yajat_Challenges/tree/master/src/com/company/TT1_all
- T is the iterator variable. Iterators are used to retrieve elements one by one. Every class that implements Iterable interface appropriately, can be used in the enhanced For loop (for-each loop). The need to implement the Iterator interface arises while designing custom data structures.
- a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list.
- Advantages over arrays 
1) Dynamic size 
2) Ease of insertion/deletion

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
# Challenge 2
- Link to Repl: https://replit.com/@YajatYadav/Yajattri2challenges#Main.java
- Link to Code: https://github.com/yajatyadav/Yajat_Challenges/blob/master/src/com/company/TT2/Calculator.java
**Tech Talk 2 Notes**
- compute rmath: strings converted to Reverse Polish Notation using Shunting-yard algorithm to deal with order of operations

``` java
Calculator allMath3 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100 + 5 ^ 2");
        System.out.println("All Math3\n" + allMath3);


        Calculator sqrt = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100 + 5 ^ 2 + sqrt (2*12.5) + 2");
        System.out.println("All Math3\n" + sqrt);
 ```
        
- driver for testing- constructor with different stringss, operators with varying precedence

``` java
for (int i = 0; i < this.expression.length(); i++) {
            Character c = this.expression.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokens.add(this.expression.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokens.add(c.toString())
   ```
- tokenization: string parsed and separated into tokens. these include numbers, operators, and separators

``` java
for(int i = 0; i < this.reverse_polish.size(); i++)
        {
            // If the token is a number
            if (isNumeric(this.reverse_polish.get(i))){
                calculation.push(this.reverse_polish.get(i));

                // Push number to stack
            }
            // else
            else{

                if(this.reverse_polish.get(i).equals("sqrt")){
                    calculation.push(Math.pow(Double.parseDouble(calculation.pop().toString()),0.5));
                }
                else{
                    Double first = Double.parseDouble(calculation.pop().toString());
                    Double second = Double.parseDouble(calculation.pop().toString());
                    switch(this.reverse_polish.get(i)){
                        case "+":
                            calculation.push(second + first);
                            break;
                        case "-":
                            calculation.push(second - first);
                            break;
                        case "*":
                            calculation.push(second * first);
                            break;
                        case "/":
                            calculation.push(second / first);
                            break;
                        case "%":
                            calculation.push(second % first);
                            break;
                        case "^" :
                            calculation.push(Math.pow(second, first));

                    }
                }
   ```
   
- going from rpn to final answer:
  - if element is a number, push to the stack
  - if element is an operator, pop the first two numbers off the stack, perform the computation, and push back onto the stack
  - I also learned how to use switch-case statements to check from multiple conditions (operators in this case)

- I learned how to add operators and set their precedence
``` java
OPERATORS.put("^", 2);
        OPERATORS.put("sqrt", 2);
 ```
 
