/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c,r,f,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Suhu dalam Celcius = ");
        //input suhu celcius
        c = input.nextInt();
        //rumus reamur
        r = c*4/5;
        //rumus fahrenheit
        f = (c*9/5)+32;
        //rumus kelvin
        k = c+273.15;
        
        System.out.println("Celcius     = "+ c);
        System.out.println("Reamur      = "+ r);
        System.out.println("Fahrenheit  = "+ f);
        System.out.println("Kelvin      = "+ k);
    }
    
}
