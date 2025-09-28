package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Jmp implements Instruccion {

    String instruccion;

    public Jmp(String instruccion) {
        this.instruccion = instruccion;
    }

    public void ejecutar(Interprete interprete) {
        interprete.setIp(Integer.parseInt(instruccion));
    }
}
