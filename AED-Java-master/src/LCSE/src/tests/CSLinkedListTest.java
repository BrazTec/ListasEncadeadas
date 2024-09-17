package LCSE.src.tests;

import LCSE.src.listaCircularSimplesmenteEncadeada.CSLinkedList;
import LCSE.src.listaCircularSimplesmenteEncadeada.EmptyCSLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CSLinkedListTest {

    @Test
    void testAddHead() {
        CSLinkedList c = new CSLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addHead("BOS");
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.addHead("ATL");
        assertEquals("[ATL, BOS]", c.toString(), "Deve imprimir [ATL, BOS]");

        c.addHead("MSP");
        assertEquals("[MSP, ATL, BOS]", c.toString(), "Deve imprimir [MSP, ATL, BOS]");

        c.addHead("LAX");
        assertEquals("[LAX, MSP, ATL, BOS]", c.toString(), "Deve imprimir [LAX, MSP, ATL, BOS]");
    }

    @Test
    void testAddTail() {
        CSLinkedList c = new CSLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addTail("MSP");
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.addTail("ATL");
        assertEquals("[MSP, ATL]", c.toString(), "Deve imprimir [MSP, ATL]");

        c.addTail("BOS");
        assertEquals("[MSP, ATL, BOS]", c.toString(), "Deve imprimir [MSP, ATL, BOS]");

        c.addTail("MIA");
        assertEquals("[MSP, ATL, BOS, MIA]", c.toString(), "Deve imprimir [MSP, ATL, BOS, MIA]");
    }

    @Test
    void testRemoveFirst() {
        CSLinkedList c = new CSLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addTail("MSP");
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.addTail("BOS");
        assertEquals("[MSP, BOS]", c.toString(), "Deve imprimir [MSP, BOS]");

        c.removeFirst();
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.removeFirst();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        assertThrows(EmptyCSLinkedList.class, () -> {
            c.removeFirst();
        });
    }

    @Test
    void testRemoveLast() {
        CSLinkedList c = new CSLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addTail("MSP");
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.addTail("BOS");
        assertEquals("[MSP, BOS]", c.toString(), "Deve imprimir [MSP, BOS]");

        c.removeLast();
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.removeLast();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        assertThrows(EmptyCSLinkedList.class, () -> {
            c.removeLast();
        });
    }
}
