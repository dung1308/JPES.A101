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
public class RectangleExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double width,height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height:");
        //height = sc.nextDouble();
        //width = sc.nextDouble();
        height = 8.5;
        width = 5.5;
        System.out.println("Area is 5.5 * 8.5 = "+(width*height));
        System.out.println("Perimeter is 2 * (5.5 + 8.5) = "+(2*(width+height)));
    }
    
}
