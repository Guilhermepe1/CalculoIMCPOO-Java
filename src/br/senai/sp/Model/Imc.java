package br.senai.sp.Model;

public class Imc {
    /** Declara variaveis */
    public String estado;

    /** Instancia User */
    User usuario = new User();

    /** Instancia Input */
    Input coleta = new Input();

    /** Executa as funcoes */
    public void Executa(){

        System.out.println("-/-/-/-/-/-/-/-/-/-/ BEM-VINDO -/-/-/-/-/-/-/-/-/");
        coleta.Coleta(usuario);
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.printf("%s com base nos dados que você informou:\n", usuario.nome);
        CalcularImc();
        Situacao();
    }

    /** Calcula o IMC */
    public void CalcularImc(){

        usuario.imc = usuario.peso / (usuario.altura*usuario.altura);
        System.out.printf("O calculo do seu IMC é %.1f", usuario.imc);
    }

    /** Verifica o estado do usuario de acordo com o IMC */
    public void Situacao(){
        if (usuario.imc<18.5) {
            estado = "Muito magro";
        } else if (usuario.imc>=18.5&&usuario.imc<=24.9) {
            estado = "Normal";
        } else if (usuario.imc>=25&&usuario.imc<=29.9) {
            estado = "Sobrepeso";
        } else if (usuario.imc>=30&&usuario.imc<=34.9) {
            estado = "Obeso grau I";
        } else if (usuario.imc>=35&&usuario.imc<=39.9) {
            estado = "Obeso grau II";
        } else if (usuario.imc>=40) {
            estado = "Obeso grau III ou Mórbido";
        }

        /* Printa o estado */
        System.out.printf("\nO seu estado corporal é %s", estado);
    }

}
