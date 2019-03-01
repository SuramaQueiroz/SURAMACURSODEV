package Lista3;

import java.util.Scanner;

public class A {
    public static void main (String[] args){
        System.out.println("Entre com a quantidade de folhas:");
        Scanner sc = new Scanner(System.in);

        int totalFolha = sc.nextInt();
        double resultado;

        if (totalFolha <100) {
            resultado = totalFolha * 0.25;
            System.out.println(resultado);
        }else{
            resultado = totalFolha*0.20;
            System.out.println(resultado);
        }
    }
}
