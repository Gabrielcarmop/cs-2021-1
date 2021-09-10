package com.company;
import java.util.Scanner;

public class Divisao {

    private static Scanner sc = new Scanner(System.in);

    public static int divide(int dividendo, int divisor) throws ArithmeticException {
        return dividendo/divisor;
    }

    public static void main (String args[]) {


        try {
            System.out.println("Informe o valor do dividendo: ");
            int dividendo = sc.nextInt();
            System.out.println("Informe o valor do divisor: ");
            int divisor = sc.nextInt();
            System.out.println(divide(dividendo, divisor));
        }catch (ArithmeticException e){
            System.out.println("Não existe divisão por 0");
            e.printStackTrace();
        }
    }

}