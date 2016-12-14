/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2_10;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float dinero, billete100, billete20, billete5, moneda1;
    Scanner obx=new Scanner(System.in);
    System.out.println("Introducir diñeiro :");
    dinero=obx.nextFloat();
    billete100=dinero/100;
    dinero=dinero-billete100*100;
    billete20=dinero/20;
    dinero=dinero-billete20*20;
    billete5 = dinero/5;
    dinero= dinero-billete5*5;
    moneda1 = dinero/1;
    dinero= dinero-(moneda1*1);
    System.out.println("billetes de 100 =" +billete100);
    System.out.println("billetes de 20 =" +billete20);     
    System.out.println("billetes de 5 =" +billete5);
    System.out.println("monedas de 1=" +moneda1);
    }
    
}
