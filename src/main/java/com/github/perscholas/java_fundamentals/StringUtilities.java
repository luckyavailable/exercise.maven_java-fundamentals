package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return ((String) ("Hello World"));
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return ((String) ((firstSegment) + (secondSegment)));
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return ((String) ((firstSegment) + (secondSegment)));
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        return input.substring(0, 3);

    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        return input.substring(input.length() - 3, input.length());
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        int a = inputValue.compareTo(comparableValue);
        if (a == 0)
            return (true);
        else
            return (false);


    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {

        int len = inputValue.length();
        char ch = 'A';
        int position;
        if (len % 2 == 0) {
            position = len / 2 - 1;
            len = 2;
        } else {
            position = len / 2;
            len = 1;
        }

        for (int i = 0; i < len; i++) {
            ch = inputValue.charAt(i);
        }
        return (ch);

    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {

        String arr[] = spaceDelimitedString.split(" ");
        String firstWord = arr[0];

        return firstWord;

    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString) {
        String arr[] = spaceDelimitedString.split(" ");
        String secondWord = arr[1];
        return secondWord;
    }
       /*  * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {

        // convert String to character array
        // by using toCharArray
        char[] try1 = stringToReverse.toCharArray();
        char[] try2 = new char[try1.length];

        for (int i = try1.length - 1; i >= 0; i--) {
            try2[i] = try1[i];
        }
        return String.valueOf((try2));
    }
}