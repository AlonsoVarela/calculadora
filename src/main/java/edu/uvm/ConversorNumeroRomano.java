package edu.uvm;

public class ConversorNumeroRomano {
    public String convertirARomano(int numero) {
        if (numero == 0 || numero >= 4000 || numero <= -4000) {
            throw new IllegalArgumentException("Número fuera del rango permitido");
        }

        int n = Math.abs(numero);
        StringBuilder resultado = new StringBuilder();

        String[] simbolos = {
            "M", "CM", "D", "CD", "C", "XC", "L",
            "XL", "X", "IX", "V", "IV", "I"
        };
        int[] valores = {
            1000, 900, 500, 400, 100, 90, 50,
            40, 10, 9, 5, 4, 1
        };

        for (int i = 0; i < valores.length; i++) {
            while (n >= valores[i]) {
                resultado.append(simbolos[i]);
                n -= valores[i];
            }
        }

        return numero < 0 ? "-" + resultado.toString() : resultado.toString();
    }
}
