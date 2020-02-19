/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tabuada;
import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Tabuada {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número qualquer: ");
        int numero = scanner.nextInt();
        
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
}
