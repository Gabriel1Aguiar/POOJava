package Respostas;

public class saldo {
    double saldo;

    public saldo(double saldo) {
        this.saldo = saldo;
    }

    public void reajusteSaldo(){
        double saldoReajuste = this.saldo + (this.saldo * 0.01);
        System.out.println("Saldo: "+this.saldo+"\nSaldo com reajuste: "+saldoReajuste);
    }
}
