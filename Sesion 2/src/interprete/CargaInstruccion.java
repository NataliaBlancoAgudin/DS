package interprete;

import instrucciones.*;

public class CargaInstruccion {

    public static Instruccion cargarInstruccion(String linea) {
        String[] palabras = linea.split(" ");

        Instruccion instruccionToAdd = null;

        if (palabras[0].equals("push")) {
            instruccionToAdd = new Push(palabras[1]);
        } else if (palabras[0].equals("add")) {
            instruccionToAdd = new Add();
        } else if (palabras[0].equals("sub")) {
            instruccionToAdd = new Sub();
        } else if (palabras[0].equals("mul")) {
            instruccionToAdd = new Mul();
        } else if (palabras[0].equals("jmp")) {
            instruccionToAdd = new Jmp(palabras[1]);
        } else if (palabras[0].equals("jmpg")) {
            instruccionToAdd = new Jmpg(palabras[1]);
        } else if (palabras[0].equals("load")) {
            instruccionToAdd = new Load();
        } else if (palabras[0].equals("store")) {
            instruccionToAdd = new Store();
        } else if (palabras[0].equals("input")) {
            instruccionToAdd = new Input();
        } else if (palabras[0].equals("output")) {
            instruccionToAdd = new Output();
        }

        return instruccionToAdd;
    }
}
