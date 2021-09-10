/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.assignment1;
import java.lang.Math.*;
/**
 *
 * @author ASUS
 */
public class CircleExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius = 7.5;
        double peri = 2*Math.PI*radius;
        double area = Math.PI*(radius*radius);
        System.out.println("Perimeter is = "+peri);
        System.out.println("Area is = "+area);
    }
    
}
