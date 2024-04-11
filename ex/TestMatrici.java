package ex;
import java.util.Scanner;

public class TestMatrici {
    //Main
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        //Test 1
        // Creazione della matrice quadrata
        System.out.println("Inserisci il numero di righe e colonne");
        int righe=in.nextInt();
        int [][] m=new int[righe][righe];
        //Inserimento
        for (int i=0;i<righe;i++){
            for (int j=0;j<righe;j++){
                System.out.println("Inserire elemento "+i+" "+j+": ");
                m[i][j]=in.nextInt();
            }
        }
        //Stampa del risultato
        if(Matrici.isSimmetricaDiagMaggiore(m))
            System.out.println("La matrice m è simmetrica rispetto la diagonale maggiore");
        else
            System.out.println("La matrice  m non è simmetrica rispetto la diagonale");

        //Test 2
        int [][] m3={
                {0,7,3,8},
                {7,0,4,11},
                {3,4,0,13},
                {8,11,13,0}
        };
        if(Matrici.isSimmetricaDiagMaggiore(m3))
            System.out.println("La matrice m3 è simmetrica rispetto la diagonale maggiore");
        else
            System.out.println("La matrice m3 non è simmetrica rispetto la diagonale");
    }

}