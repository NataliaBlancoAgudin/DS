package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Push implements Instruccion {

    String instruccion;

    public Push(String instruccion) {
        this.instruccion = instruccion;
    }

    public void ejecutar(Interprete i) {
        i.getPila().push(Integer.parseInt(instruccion));
        i.setIp(i.getIp() + 1);
    }
}
