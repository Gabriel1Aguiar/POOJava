package Respostas;

public class salarioMinimo {
    double salario;

    public salarioMinimo(double salario) {
        this.salario = salario;
    }

    public void calcSalarios(){
        int qtdeSalarios = 0;
        double salarioMinimo = 1320.00;
        while (this.salario >= salarioMinimo){
            qtdeSalarios += 1;
            this.salario -= salarioMinimo;
        }

        System.out.println("O usuário tem "+qtdeSalarios+" salário(s) mínimo(s)");
    }
}
