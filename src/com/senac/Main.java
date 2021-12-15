package com.senac;

public class Main {

    public static void main(String[] args) {


        int horasNoDia = 8;
        int horasNoMes = 22;


        double salarioJuniorPorhora = 25.00;
        double salarioPlenoPorhora = 45.00;
        double salarioSeniorPorhora = 60.00;

        double salarioJunior = salarioJuniorPorhora * horasNoDia * horasNoMes;
        double salarioPleno = salarioPlenoPorhora * horasNoDia * horasNoMes;
        double salarioSenior = salarioSeniorPorhora * horasNoDia * horasNoMes;

        System.out.println("junior ganhar " + salarioJunior + " reais");
        System.out.println("pleno ganhar " + salarioPleno + " reais");
        System.out.println("senior ganhar " + salarioSenior + " reais");

    }
}
