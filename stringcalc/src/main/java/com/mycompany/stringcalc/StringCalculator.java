/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringcalc;

/**
 *
 * @author poker07
 */
public class StringCalculator {

    /**
     * Adding the numbers in the given string can be separated with any char or
     * string.     
     * if no numbers in the string 0 will be given back
     * @param src - the string with numbers in it
     * @return sum of numbers in the string
     */
    public int add(String src) {
        if (src.isEmpty()) {
            return 0;
        }

        String[] numbers = src.split("[^0123456789]");
        int sum = 0;
        for (String number : numbers) {
            try {
                sum += Integer.valueOf(number);
            } catch (NumberFormatException e) {
                continue;
            }
        }

        return sum;

    }

}
