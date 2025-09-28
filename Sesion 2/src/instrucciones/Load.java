package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Load implements Instruccion {

    public void ejecutar(Interprete interprete) {
        int direccion = interprete.getPila().pop();
        interprete.getPila().push(interprete.getMemoria().getDir(direccion));
        interprete.setIp(interprete.getIp() + 1);
    }
}
