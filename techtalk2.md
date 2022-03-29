{% include navigation.html %}

# Tech Talk 2
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
 
