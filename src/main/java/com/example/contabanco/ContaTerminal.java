package com.example.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero=sc.nextInt();
        System.out.println("Digite o número da Agência: ");
        String agencia=sc.nextLine();
        sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente=sc.nextLine();
        System.out.println("Digite seu saldo: ");
        double saldo=sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",nomeCliente, agencia, numero, saldo);

        sc.close();
    }

}