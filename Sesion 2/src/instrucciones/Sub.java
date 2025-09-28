package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

public class Sub implements Instruccion {

    public void ejecutar(Interprete interprete) {
        int b = interprete.getPila().pop();
        int a = interprete.getPila().pop();
        interprete.getPila().push(a - b);
        interprete.setIp(interprete.getIp() + 1);
    }
}
