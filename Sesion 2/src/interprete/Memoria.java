package interprete;

public class Memoria {

    private static int[] memoria = new int[1024];

    public int getDir(int dir){
        return memoria[dir];
    }

    public void setDir(int dir, int valor){
        memoria[dir] = valor;
    }
}
