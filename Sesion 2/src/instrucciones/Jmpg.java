package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Jmpg implements Instruccion {

    String instruccion;

    public Jmpg(String instruccion) {
        this.instruccion = instruccion;
    }

    public void ejecutar(Interprete interprete) {
        int b = interprete.getPila().pop();
        int a = interprete.getPila().pop();
        if (a > b)
            interprete.setIp(Integer.parseInt(instruccion));
        else
            interprete.setIp(interprete.getIp() + 1);
    }
}
