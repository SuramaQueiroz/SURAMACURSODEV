package Lista3;

import java.util.Scanner;

public class B {

    public static void main (String[] args) {
        System.out.println("Entre com a quantidade de peças produzidas:");
        Scanner sc = new Scanner(System.in);
        int pecasP = sc.nextInt();
        System.out.println("informe a quantidade de peças defeituosas");
        double defeitos=sc.nextDouble();
        double porcento;
        double porcento2;
        double total;
        porcento = pecasP-defeitos;
        porcento2= pecasP-porcento;
         total=porcento2*0.100;


        if (total >10) {
            System.out.println("precisa ter manutençao");
        } else {
            System.out.println("maquina funcionando");
        }
    }
}
