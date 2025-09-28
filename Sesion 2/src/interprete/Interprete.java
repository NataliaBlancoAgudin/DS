package interprete;

import instrucciones.*;
import java.util.ArrayList;
import java.util.List;

public class Interprete {

    private static List<Instruccion> instrucciones = new ArrayList<Instruccion>();
    private static int ip = 0;

    private static Memoria memoria;
    private static Pila pila;

    // $ Cargar programa --------------------------------
    public void cargaInstruccion(String linea) {
        if (linea.trim().length() == 0)
            return;

        instrucciones.add(CargaInstruccion.cargarInstruccion(linea));
    }

    // $ Motor de Ejecución --------------------------------
    public void ejecutaPrograma() {
        while (ip < instrucciones.size()) {
            Instruccion instruccion = instrucciones.get(ip);
            instruccion.ejecutar(this);
        }
    }

    public int getIp() { return ip; }
    public void setIp(int ip) { Interprete.ip = ip; }

    public Memoria getMemoria() { return memoria; }
    public Pila getPila() { return pila; }
}
