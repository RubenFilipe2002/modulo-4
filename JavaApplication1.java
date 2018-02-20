
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    
     public static void main(String[] args) {
        int N;
        double med =0;
        Scanner LerS= new Scanner (System.in);
        System.out.print("Quantos elementos tem o vetor ?");
        N = LerS.nextInt();
        double [] A = new double [N];
        for (int  I=0;I<=N-1;I++)
        {
            System.out.printf("elemento %d = ", I+1);
        A [I] = LerS.nextDouble(); }
        for (int I=0; I<=N-1;I++)
        med+=A[I];
        med=med/N;
        System.out.print(String.format ("Media Aritemetica = %5.2f",med)); 
        
        
        
        }
        
        
         
      
    }