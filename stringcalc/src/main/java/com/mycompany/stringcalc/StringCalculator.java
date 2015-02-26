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
     * string. if no numbers in the string 0 will be given back
     *
     * @param src - the string with numbers in it
     * @return sum of numbers in the string
     */
    public int add(String src) throws NumberFormatException{
        String num = "0123456789";

        if (src.isEmpty()) {
            return 0;
        }

        String[] numbers = src.split("[^-" + num + "]");
        String negs = "";
        int sum = 0, i;

        for (String number : numbers) {
            try {
                i = Integer.valueOf(number);
                if (i < 0) {
                    negs += String.valueOf(i) + ", ";
                }
                sum += Integer.valueOf(number);
            } catch (NumberFormatException e) {
                System.out.println("number: " + number + " !! errr");
                continue;
            }
        }

        if (!negs.equals("")) {
            throw new NumberFormatException(negs);
        }

        return sum;
    }

}
