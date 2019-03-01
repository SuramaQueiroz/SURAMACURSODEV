package Lista1;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        System.out.println("Entre com comprimento:");
        Scanner sc = new Scanner(System.in);
        double comprimento = sc.nextDouble();
        System.out.println("Entre com a largura:");
        double largura = sc.nextDouble();
        double area;
        area = comprimento * largura;
        System.out.println(area + "m²");
    }
}

