# Yajat Challenges for Trimester 2

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


# Data Structurs Work

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
