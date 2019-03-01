package Lista2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        System.out.println("km percorrido:");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        System.out.println("combustivel usado:");
        double combustivel = sc.nextDouble();
        double total;
        total = km / combustivel;
        System.out.println(total + "km/l");
    }
}
