package br.senai.sp.Model;

import java.util.Scanner;

public class Input {

    /** Instancia Scanner */
    Scanner scanner = new Scanner(System.in);

    /** Coleta dados do usuario */
    public void Coleta(User usuario){
        System.out.println("Qual seu nome: ");
        usuario.nome = scanner.nextLine();
        System.out.println("Digite o peso: ");
        usuario.peso = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        usuario.altura = scanner.nextDouble();

    }
}
