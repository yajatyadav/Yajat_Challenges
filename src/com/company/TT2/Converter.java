//package com.company.TT2;
//
//public class Converter {
//
//    // Takes tokens and converts to Reverse Polish Notation (RPN), this is one where the operator follows its operands.
//    private void tokensToReversePolishNotation () {
//        // contains final list of tokens in RPN
//        this.reverse_polish = new ArrayList<>();
//
//        // stack is used to reorder for appropriate grouping and precedence
//        Stack tokenStack = new Stack();
//        for (String token : tokens) {
//            switch (token) {
//                // If left bracket push token on to stack
//                case "(":
//                    tokenStack.push(token);
//                    break;
//                case ")":
//                    while (tokenStack.peek() != null && !tokenStack.peek().equals("("))
//                    {
//                        reverse_polish.add( (String)tokenStack.pop() );
//                    }
//                    tokenStack.pop();
//                    break;
//                case "+":
//                case "-":
//                case "*":
//                case "/":
//                case "%":
//                    // While stack
//                    // not empty AND stack top element
//                    // and is an operator
//                    while (tokenStack.peek() != null && isOperator((String) tokenStack.peek()))
//                    {
//                        if ( isPrecedent(token, (String) tokenStack.peek() )) {
//                            reverse_polish.add((String)tokenStack.pop());
//                            continue;
//                        }
//                        break;
//                    }
//                    // Push the new operator on the stack
//                    tokenStack.push(token);
//                    break;
//                default:    // Default should be a number, there could be test here
//                    this.reverse_polish.add(token);
//            }
//        }
//        // Empty remaining tokens
//        while (tokenStack.peek() != null) {
//            reverse_polish.add((String)tokenStack.pop());
//        }
//
//    }
//}
