/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler3;
import java.util.Scanner;
/**
 *
 * @author Fernando Baladi
 */
public class ProjectEuler3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num=0, aux, aux2=0;
        System.out.println("Ingresa un número.");
        num = sc.nextLong();
        for (long i = 1; i < (num/2); i++) {
            aux=1;
            if (num%i==0){
                for (long j = 2; j < i; j++) {
                    if (i%j==0) {
                        aux=0;
                    }
                }
                if (aux==1) {
                    aux2 =i;
                    System.out.println(aux2);
                }
            }
            
        }
        System.out.println("El mayor primo es: " + aux2);
    }
    
}
