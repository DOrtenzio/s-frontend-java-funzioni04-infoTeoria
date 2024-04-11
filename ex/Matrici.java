package ex;

public class Matrici {
    public static boolean isSimmetricaDiagMaggiore (int [][] m){
        boolean isEquals=true;
        for (int i = 0; i < m[0].length; i++) {
            for (int p = 0; p < m.length; p++) {
                if (m[p][i]!=m[i][p]){
                    isEquals=false;
                    break;
                }
            }
        }
        return isEquals;
    }
}
