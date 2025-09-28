package instrucciones;

import interprete.Instruccion;
import interprete.Interprete;

import java.util.Scanner;

public class Input implements Instruccion {

    private static Scanner console = new Scanner(System.in);

    @Override
    public void ejecutar(Interprete interprete) {
        System.out.println("Escriba un entero:");
        interprete.getPila().push(console.nextInt());
        interprete.setIp(interprete.getIp() + 1);
    }
}
