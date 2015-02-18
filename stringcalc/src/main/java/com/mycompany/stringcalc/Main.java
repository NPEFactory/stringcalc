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
public class Main {

    public static void main(String[] args) {
        StringCalculator strcalc = new StringCalculator();

        try {

            System.out.println("strcalc.add(\"\") --> " + strcalc.add(""));
            System.out.println("strcalc.add(\"0\") --> " + strcalc.add("0"));
            System.out.println("strcalc.add(\"1\") --> " + strcalc.add("1"));
            System.out.println("strcalc.add(\"1,3\") --> " + strcalc.add("1,3"));
            System.out.println("strcalc.add(\"10,4\") --> " + strcalc.add("10,4"));
            System.out.println("strcalc.add(\"10,4,5,12,4\") --> " + strcalc.add("10,4,5,12,4"));

            System.out.println("strcalc.add(\"1;2\") --> " + strcalc.add("1;2"));
            System.out.println("strcalc.add(\"3\\n5\" ) --> " + strcalc.add("3\n5"));
            System.out.println("strcalc.add(\"4|2\") --> " + strcalc.add("4|2"));

            System.out.println("strcalc.add(\"1,-3,2,-5\") --> " + strcalc.add("1,-3,2,-5"));
        } catch (NumberFormatException e) {
            System.out.println("ex got! : "+e.getMessage());
        }

    }

}
