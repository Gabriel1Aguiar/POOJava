package Respostas;

public class idade {
    int anos;
    int meses;
    int dias;

    public idade(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public void transformaIdade(){
        int diasConvertidos = 0;
        int contAnos = this.anos;
        int contMeses = this.meses;

        while (contAnos>0){
            diasConvertidos += 365;
            contAnos -= 1;
        }
        while (contMeses>0){
            diasConvertidos += 30;
            contMeses -= 1;
        }
        System.out.println(this.anos+" anos,"+this.meses+" meses e "+this.dias+" dias = "+(diasConvertidos + this.dias)+" dias.");

    }

}
