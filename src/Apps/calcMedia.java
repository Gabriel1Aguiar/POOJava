package Apps;

public class calcMedia {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 9;
        int nota3 = 7;
        int nota4 = 4;
        int nota5 = 5;
        int nota6 = 6;

        int mediaArit = (nota1 + nota2 + nota3)/3;
        int mediaSimples = (nota4 + nota5 + nota6)/3;

        double somaMedias = mediaArit + mediaSimples;
        double mediaDasMedias = somaMedias / 2;

        System.out.println("Media Aritmética: "+mediaArit+"\nMédia: "+mediaSimples+"\nSoma das médias: "+somaMedias+"\nMédia das médias: "+mediaDasMedias);

    }

}
