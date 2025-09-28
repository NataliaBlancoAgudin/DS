package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Add implements Instruccion {

    @Override
    public void ejecutar(Interprete interprete) {
        interprete.getPila().push(interprete.getPila().pop() + interprete.getPila().pop());
        interprete.setIp(interprete.getIp() + 1);
    }
}
