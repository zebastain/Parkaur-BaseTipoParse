package molanoartuzsebastian;

import java.util.ArrayList;

public class Tabla {
    private final ArrayList<TipoDeDatos> tipoDeDatos;
    private final ArrayList<Registro> registros;
    //********************CONSTRUCTORES***********************
    public Tabla(){
        tipoDeDatos = new ArrayList<>();
        registros = new ArrayList();
    }
    public Tabla(ArrayList<TipoDeDatos> tipoDeDatos){
        this.registros = new ArrayList();
        this.tipoDeDatos = tipoDeDatos;
    }
    public Tabla(ArrayList<TipoDeDatos> tipoDeDatos, Registro registro) {
        this(tipoDeDatos);
        registros.add(registro);
    }
    //ESTA FUNCIÓN DETERMINA SI LOS TIPOS DE DATOS QUE ENTRAN MANTIENEN LA MISMA ESTRUCTURA QUE LA TABLA
    public boolean tipoDeDatosEsIgual(ArrayList<TipoDeDatos> tipoDeDatos){
        return tipoDeDatos.equals(this.tipoDeDatos);
    }
    //AGREGAR Y IMPRIMIR REGISTROS
    public void addRegistro(Registro registro){
        registros.add(registro);
    }
    public void imprimirRegistros(){
        System.out.println("Registros: ");
        for (Registro registro : registros) {
            registro.imprimirLosDatos();
        }
    }
    public void imprimirTipoDeDatos(){
        for(TipoDeDatos t : tipoDeDatos){
            System.out.print(t+", ");
        }
        System.out.println("");
    }
}
