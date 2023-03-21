package Respostas;

public class pecasCarro {
    int ipi;
    int codPeca1;
    double valorPeca1;
    int qtdePeca1;
    int codPeca2;
    double valorPeca2;
    int qtdePeca2;

    public pecasCarro(int ipi, int codPeca1, int valorPeca1, int qtdePeca1, int codPeca2, int valorPeca2, int qtdePeca2) {
        this.ipi = ipi;
        this.codPeca1 = codPeca1;
        this.valorPeca1 = valorPeca1;
        this.qtdePeca1 = qtdePeca1;
        this.codPeca2 = codPeca2;
        this.valorPeca2 = valorPeca2;
        this.qtdePeca2 = qtdePeca2;
    }

    public void valorTotalIpi(){
        double valorTotalPeca1 = this.valorPeca1*this.qtdePeca1;
        double valorTotalPeca2 = this.valorPeca2*this.qtdePeca2;
        double ipiConvertido = (this.ipi*0.01)+1;
        double valorTotal = (valorTotalPeca1 + valorTotalPeca2)*ipiConvertido;

        System.out.println("Valor com reajuste = "+ valorTotal);
    }
}
