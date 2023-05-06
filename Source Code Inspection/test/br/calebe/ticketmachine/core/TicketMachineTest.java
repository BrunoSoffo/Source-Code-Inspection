/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.calebe.ticketmachine.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unifbsoffo
 */
public class TicketMachineTest {
    
    private TicketMachine tm;

    @Before
    public void inicializarTicketMachine() {
        tm = new TicketMachine(10);
    }

    @Test
    public void testarInsercaoDePapelMoedaValido() throws PapelMoedaInvalidaException {
        tm.inserir(10);
        assertEquals(10, tm.getSaldo());
    }

    @Test
    public void testarInsercaoDePapelMoedaInvalido() {
        try {
            tm.inserir(7);
            fail("Deveria ter lançado uma exceção de papel moeda inválido");
        } catch (PapelMoedaInvalidaException e) {
            assertEquals(0, tm.getSaldo());
        }
    }

    @Test
    public void testarImpressaoComSaldoInsuficiente() {
        try {
            tm.imprimir();
            fail("Deveria ter lançado uma exceção de saldo insuficiente");
        } catch (SaldoInsuficienteException) {
            assertEquals(0, tm.getSaldo());
        }
    }

    @Test
    public void testarImpressaoComSaldoSuficiente() throws PapelMoedaInvalidaException, SaldoInsuficienteException {
        tm.inserir(10);
        tm.inserir(20);
        assertEquals("*** R$ 30,00 ****\n", tm.imprimir());
        assertEquals(30, tm.getSaldo());
    }
    
}
