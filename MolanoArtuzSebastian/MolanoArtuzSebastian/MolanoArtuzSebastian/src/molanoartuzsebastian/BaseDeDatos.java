package molanoartuzsebastian;

import java.util.ArrayList;

public class BaseDeDatos {
    private final ArrayList<Tabla> tablas;
    public BaseDeDatos(){
        tablas = new ArrayList<>();
    }
    public void addRegistro(Registro registro){
        boolean exist = false;
        for (Tabla t : this.tablas) {
            if (t.tipoDeDatosEsIgual(registro.geTipoDeDatos())) {
                exist = true;
                if (exist) {
                    t.addRegistro(registro);
                }
            }
        }
        if (!exist) {
            tablas.add(new Tabla(registro.geTipoDeDatos(),registro));
        }
    }
   public void printAll(){
       System.out.println("Número de tablas: "+ tablas.size());
       int n = 0;
       for (Tabla t : this.tablas) {
           System.out.println("******************************************************************************************************************************");
           System.out.println("Tabla "+ n++);
           t.imprimirTipoDeDatos();
           t.imprimirRegistros();
       }
   }
}
