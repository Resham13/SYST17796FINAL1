/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author resha
 */
public class Final {

    public static void main(String[] args) {
        calculateNet(0,0,0);
    }
  
    public static double calculateNet(double hours, double rate, double tax){
        double gross = hours * rate;
        double net = gross - tax;
        return net;
    }
    
}
