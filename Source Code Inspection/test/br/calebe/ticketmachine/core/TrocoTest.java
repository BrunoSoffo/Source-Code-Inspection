package br.calebe.ticketmachine.core;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class TrocoTest {

    private Troco troco;

    @Before
    public void setUp() {
        troco = new Troco(137);
    }

    @Test
    public void testGetIterator() {
        Iterator < PapelMoeda > iterator = troco.getIterator();
        assertEquals(new PapelMoeda(100, 1), iterator.next());
        assertEquals(new PapelMoeda(20, 1), iterator.next());
        assertEquals(new PapelMoeda(10, 1), iterator.next());
        assertEquals(new PapelMoeda(5, 1), iterator.next());
        assertEquals(new PapelMoeda(2, 1), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorRemove() {
        Iterator < PapelMoeda > iterator = troco.getIterator();
        iterator.next();
        iterator.remove();
        assertEquals(new PapelMoeda(20, 1), iterator.next());
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.remove();
        assertFalse(iterator.hasNext());
    }
}