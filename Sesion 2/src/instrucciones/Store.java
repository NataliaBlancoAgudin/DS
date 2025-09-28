package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Store implements Instruccion {

    public void ejecutar(Interprete interprete) {
        int valor = interprete.getPila().pop();
        int direccion = interprete.getPila().pop();
        interprete.getMemoria().setDir(direccion,valor);
        interprete.setIp(interprete.getIp() + 1);
    }
}
