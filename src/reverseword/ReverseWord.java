/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseword;
import java.util.Scanner;
/**
 *
 * @author mehta
 */
public class ReverseWord {

    /**
     * A class to take input from user
     * and printing reverse of the word 
     * using an array
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please Enter a Word");
        String word=sc.nextLine();
        
        char[] c=new char[word.length()];
        
        for(int i=0;i<word.length();i++)
        {
            c[i]=word.charAt(i);
        }
     //write loop to print the characters in reverse
     for(int i=c.length-1;i>=0;i--)
     {
         System.out.println(c[i]);
     }
}
}
