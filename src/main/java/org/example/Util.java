package org.example;

public class Util {

    /**
     * Instance variables
     */
    private String insertedString;

    /**
     * Constructor
     */
    public Util(String insertedString) {
        this.insertedString = insertedString;
    }

    /**
     * Method that returns True if the inserted string is a palindrome string
     * @param insertedString
     * @return a boolean
     */
    public static boolean isPalindrome(String insertedString) {
        int insertedStringLength = insertedString.length();
        insertedString = insertedString.toLowerCase();
        for(int i=0;i <= insertedStringLength/2;i++) {
            if (insertedString.charAt(i) == insertedString.charAt(insertedStringLength - i -1)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

}
