package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Output implements Instruccion {

    public void ejecutar(Interprete interprete) {
        System.out.println(interprete.getPila().pop());
        interprete.setIp(interprete.getIp() + 1);
    }
}
