package c_POO_EXCEPSIONES._01_PruebaExcepsiones;

import java.util.Scanner;

public class PruebaExcepciones {
    public static void main(String[] args) {
        //ArithmeticException
        /*
        int num1 =5, num2 = 0;
        int resultado = num1/num2;
        System.out.println("El resultado es : "+resultado);
        */
        
        //java.util.InputMismatchException
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = entrada.nextInt();
        System.out.println(numero);
}
}
