package com.tiagoribeiro;

public class ValidarCPF {
    public boolean validarCpf(String a) {

        if (a.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    public String imprimirResultado(boolean a) {

        if (a == true) {
            return "Bem vindo(a)!";
        } else {
            return "Tente novamente mais tarde.";
        }
    }
}
