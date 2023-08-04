package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

public class DiasUtil {

    public static final String DIAS = " dias";
    public static final String DIA = " dia";

    @NonNull
    public static String formataEmTexto(int quantidadeDeDias) {
        if(quantidadeDeDias > 1){
            return quantidadeDeDias + DIAS;
        }
        return quantidadeDeDias + DIA;
    }
}