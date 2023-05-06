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
public class PapelMoedaTest {
    
    @Test
    public void testGetValor() {
        PapelMoeda papelMoeda = new PapelMoeda(5, 10);
        assertEquals(5, papelMoeda.getValor());
    }

    @Test
    public void testGetQuantidade() {
        PapelMoeda papelMoeda = new PapelMoeda(5, 10);
        assertEquals(10, papelMoeda.getQuantidade());
    }
    
    
}
