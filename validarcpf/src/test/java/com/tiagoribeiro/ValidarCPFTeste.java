package com.tiagoribeiro;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ValidarCPFTeste {
    @Test
    public void testeValidarCPFTrue() {
        ValidarCPF cpf = new ValidarCPF();
        boolean resultado = cpf.validarCpf("12345678901");
        assertTrue(resultado);
    }

    @Test
    public void testeValidarCPFFalse() {
        ValidarCPF cpf = new ValidarCPF();
        boolean resultado = cpf.validarCpf("123456789");
        assertFalse(resultado);
    }

    @Test
    public void testeImprensaoTrue() {
        ValidarCPF cpf = new ValidarCPF();
        String resultado = cpf.imprimirResultado(true);
        assertEquals("Bem vindo(a)!", resultado);
    }

    @Test
    public void testeImprensaoFalse() {
        ValidarCPF cpf = new ValidarCPF();
        String resultado = cpf.imprimirResultado(false);
        assertEquals("Tente novamente mais tarde.", resultado);
    }
}
