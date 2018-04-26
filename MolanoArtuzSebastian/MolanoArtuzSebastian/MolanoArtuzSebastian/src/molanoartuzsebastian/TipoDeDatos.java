/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molanoartuzsebastian;

/**
 *
 * @author NELCYTAMARA
 */
public enum TipoDeDatos {
    BOOLEAN,
    INTEGER,
    LONG,
    DOUBLE,
    FLOAT,
    STRING,
    OTRO;
    public static TipoDeDatos retornarTipoDeDato(Object o){
        if (o instanceof Integer) {
            return TipoDeDatos.INTEGER;
        }
        else if (o instanceof Boolean) {
            return TipoDeDatos.BOOLEAN;
        }
        else if (o instanceof Double) {
            return TipoDeDatos.DOUBLE;
        }
        else if (o instanceof Float) {
            return TipoDeDatos.FLOAT;
        }
        else if (o instanceof String) {
            return TipoDeDatos.STRING;
        }
        else if (o instanceof Long) {
            return TipoDeDatos.LONG;
        }
        else{
            return TipoDeDatos.OTRO;
        }
    }
    
}
