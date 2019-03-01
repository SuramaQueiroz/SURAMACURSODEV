package Lista2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        System.out.println("Entre com comprimento:");
        Scanner sc = new Scanner(System.in);
        double comprimento = sc.nextDouble();
        System.out.println("Entre com a largura:");
        double largura = sc.nextDouble();
        System.out.println("o valor do carpete");
        double carp = sc.nextDouble();
        double mQuadrdos;
        double total;
        mQuadrdos = comprimento * largura;
        total = carp * mQuadrdos;
        System.out.println(total+"R$");
    }
}
