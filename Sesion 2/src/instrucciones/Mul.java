package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Mul implements Instruccion {

    public void ejecutar(Interprete interprete) {
        interprete.getPila().push(interprete.getPila().pop() * interprete.getPila().pop());
        interprete.setIp(interprete.getIp() + 1);
    }
}
