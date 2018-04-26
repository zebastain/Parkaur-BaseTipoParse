package molanoartuzsebastian;

import java.util.ArrayList;

public class Registro {
    private final ArrayList<TipoDeDatos> tipoDeDatos;
    private final ArrayList datos;
    
    public Registro() {
        this.tipoDeDatos = new ArrayList<>();
        this.datos = new ArrayList();
    }
    public static Registro crearRegistro(Object... datos){
        Registro r = new Registro();
        for(Object o : datos){
            r.datos.add(o);
            r.tipoDeDatos.add(TipoDeDatos.retornarTipoDeDato(o));
        }
        return r;
    }
    public ArrayList<TipoDeDatos> geTipoDeDatos(){
        return tipoDeDatos;
    }
    public ArrayList getDatos(){
        return datos;
    }
    public void imprimirLosDatos(){
        for (Object o : datos) {
            System.out.print(o+", ");
            System.out.println();
        }
        
    }
    
    
    
    
}
