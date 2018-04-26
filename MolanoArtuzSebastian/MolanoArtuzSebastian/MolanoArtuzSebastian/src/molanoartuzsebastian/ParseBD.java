package molanoartuzsebastian;
public class ParseBD {
    public static void main(String[] args) {
        // TODO code application logic here
        BaseDeDatos bd = new BaseDeDatos();
        bd.addRegistro(Registro.crearRegistro(new Boolean(true), new Integer(4), "Hola mundo"));
        bd.addRegistro(Registro.crearRegistro(new Boolean(false), new Integer(3), "Hola mama"));
        bd.addRegistro(Registro.crearRegistro(new Boolean(true), new Float(4), "Hola mundo"));
        bd.addRegistro(Registro.crearRegistro(new Boolean(true), new Double(4), "Hola mundo"));
        bd.addRegistro(Registro.crearRegistro(new Boolean(false), new Double(5), "Hola mundo"));
        bd.addRegistro(Registro.crearRegistro(new Boolean(false), new Double(5)));
        bd.addRegistro(Registro.crearRegistro(new Boolean(false), new Double(5), "Hola mundo", new Double(12.4)));
        bd.printAll();
    }
    
}
