package LCDE.src.listaCircularDuplamenteEncadeada;

public class CDLinkedList {

    protected NodeLCDE tail;
    protected long size;  // Número de nós na lista

    // Construtor que cria uma lista vazia
    public CDLinkedList() {
        tail = null;
        size = 0;
    }

    // Adiciona um elemento no início da lista
    public void addHead(String element) {
        if (size == 0) {
            NodeLCDE newNode = new NodeLCDE(element, null, null);
            newNode.setNext(newNode);  // Nó aponta para si mesmo
            newNode.setPrev(newNode);  // Nó também aponta para si mesmo
            tail = newNode;
        } else {
            NodeLCDE head = tail.getNext();
            NodeLCDE newNode = new NodeLCDE(element, tail, head);
            head.setPrev(newNode);
            tail.setNext(newNode);
        }
        size++;
    }

    // Adiciona um elemento no final da lista
    public void addTail(String element) {
        addHead(element);
        tail = tail.getNext();  // Move o tail para o novo nó
    }

    // Remove o primeiro elemento da lista
    public void removeFirst() {
        if (size == 0) {
            throw new EmptyCDLinkedList("A lista está vazia");
        }

        if (size == 1) {
            tail = null;
        } else {
            NodeLCDE head = tail.getNext();
            NodeLCDE newHead = head.getNext();
            tail.setNext(newHead);
            newHead.setPrev(tail);
        }
        size--;
    }

    // Remove o último elemento da lista
    public void removeLast() {
        if (size == 0) {
            throw new EmptyCDLinkedList("A lista está vazia");
        }

        if (size == 1) {
            tail = null;
        } else {
            NodeLCDE newTail = tail.getPrev();
            newTail.setNext(tail.getNext());  // O novo tail aponta para o head
            tail.getNext().setPrev(newTail);  // O head aponta para o novo tail
            tail = newTail;
        }
        size--;
    }
    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        NodeLCDE current = tail.getNext();
        do {
            sb.append(current.getElement());
            current = current.getNext();
            if (current != tail.getNext()) {
                sb.append(", ");
            }
        } while (current != tail.getNext());
        sb.append("]");
        return sb.toString();
    }

    public long getSize() {
        return size;
    }
}