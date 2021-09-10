/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.assignment1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LogicalExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        if(a!=b) System.out.println(a+" != "+b);
        if(a<b) System.out.println(a+" < "+b);
        if (a<=b) System.out.println(a+" <= "+b);
        
    }
    
}
