package Lista2;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        System.out.println("Entre com o peso:");
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextDouble();
        System.out.println("Entre com a altura:");
        double altura = sc.nextDouble();
        double IMC;
        IMC = peso * altura / 2.0;
        System.out.println(IMC);
    }
}
