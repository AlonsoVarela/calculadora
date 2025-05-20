package edu.uvm;

public class ConversorBase5 {

    public String convertirABase5(int numero) {
        boolean esNegativo = numero < 0;
        int valorAbsoluto = Math.abs(numero);
        String resultado = Integer.toString(valorAbsoluto, 5);
        return esNegativo ? "-" + resultado : resultado;
    }
}