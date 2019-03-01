package Lista1;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        System.out.println("Entre com o salario:");
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        System.out.println("Entre com o percentual de reajuste :");
        double reajuste = sc.nextDouble();
        double total;
        total = salario * reajuste;
        System.out.println(total+salario);
    }
}
