/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriel;

import java.util.Scanner;

/**
 *
 * @author nabaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       1! = 1;
//       n! = n*(n-1)! for n> 1;

  int n;
    int fact=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = input.nextInt();
    for (int i=1;i<=n; i++){
        fact=fact*i;
        System.out.println(fact);
    }

    System.out.println("Factorial: "+fact);
    }
    
}
