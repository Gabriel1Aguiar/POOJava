package Respostas;

public class AntESucNumero {
    int numero;

    public AntESucNumero(int numero) {
        this.numero = numero;
    }

    public void AnteseEDepois(){
        System.out.println("Número: "+this.numero+"\nAntecessor: "+(this.numero -1)+"\nSucessor: "+(this.numero+1));
    }
}
