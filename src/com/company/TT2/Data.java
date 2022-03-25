//package com.company.TT2;
//
//public class Data {
//    // Helper definition for supported operators
//    private final Map<String, Integer> OPERATORS = new HashMap<>();
//    {
//        // Map<"token", precedence>
//        OPERATORS.put("*", 3);
//        OPERATORS.put("/", 3);
//        OPERATORS.put("%", 3);
//        OPERATORS.put("+", 4);
//        OPERATORS.put("-", 4);
//    }
//    private final Map<String, Integer> SEPARATORS = new HashMap<>();
//    {
//        // Map<"separator", not_used>
//        SEPARATORS.put(" ", 0);
//        SEPARATORS.put("(", 0);
//        SEPARATORS.put(")", 0);
//    }
//
//    private boolean isOperator(String token) {
//        // find the token in the hash map
//        return OPERATORS.containsKey(token);
//    }
//
//    // Test if token is an separator
//    private boolean isSeperator(String token) {
//        // find the token in the hash map
//        return SEPARATORS.containsKey(token);
//    }
//
//    // Compare precedence of operators.
//    private Boolean isPrecedent(String token1, String token2) {
//        // token 1 is precedent if it is greater than token 2
//        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
//    }
//}
