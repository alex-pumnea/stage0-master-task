package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String numAsStr = Integer.toString(number);
        String reversedNumAsStr = new StringBuilder(numAsStr).reverse().toString();
        int result = Integer.parseInt(reversedNumAsStr);
    }

}
