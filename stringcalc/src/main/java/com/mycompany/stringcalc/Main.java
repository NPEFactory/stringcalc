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
        
        System.out.println("strcalc.add(\"\") --> "+strcalc.add(""));
        System.out.println("strcalc.add(\"0\") --> "+strcalc.add("0"));
        System.out.println("strcalc.add(\"1\") --> "+strcalc.add("1"));
        System.out.println("strcalc.add(\"1,3\") --> "+strcalc.add("1,3"));
        System.out.println("strcalc.add(\"10,4\") --> "+strcalc.add("10,4"));
        
    }
    
}
