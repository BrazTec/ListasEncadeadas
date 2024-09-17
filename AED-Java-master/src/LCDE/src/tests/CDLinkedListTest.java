package LCDE.src.tests;

import LCDE.src.listaCircularDuplamenteEncadeada.CDLinkedList;
import LCDE.src.listaCircularDuplamenteEncadeada.EmptyCDLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CDLinkedListTest {

    @Test
    void testAddHead() {
        CDLinkedList c = new CDLinkedList();
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
        CDLinkedList c = new CDLinkedList();
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
        CDLinkedList c = new CDLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addTail("MSP");
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.addTail("BOS");
        assertEquals("[MSP, BOS]", c.toString(), "Deve imprimir [MSP, BOS]");

        c.removeFirst();
        assertEquals("[BOS]", c.toString(), "Deve imprimir [BOS]");

        c.removeFirst();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        assertThrows(EmptyCDLinkedList.class, () -> {
            c.removeFirst();
        });
    }

    @Test
    void testRemoveLast() {
        CDLinkedList c = new CDLinkedList();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        c.addTail("MSP");
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.addTail("BOS");
        assertEquals("[MSP, BOS]", c.toString(), "Deve imprimir [MSP, BOS]");

        c.removeLast();
        assertEquals("[MSP]", c.toString(), "Deve imprimir [MSP]");

        c.removeLast();
        assertEquals("[]", c.toString(), "Deve imprimir []");

        assertThrows(EmptyCDLinkedList.class, () -> {
            c.removeLast();
        });
    }
}
