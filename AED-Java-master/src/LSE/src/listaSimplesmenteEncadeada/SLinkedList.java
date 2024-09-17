package LSE.src.listaSimplesmenteEncadeada;

// Lista simplesmente encadeada
public class SLinkedList {

    protected Node head; // nodo cabeça da lista
    protected Node tail; // nodo cauda da lista

    protected long size; // número de nodos da lista

    // Construtor default que cria uma lista vazia
    public SLinkedList() {
        head = tail = null;
        size = 0;
    }

    // Adiciona um elemento no início da lista
    public void addHead(String element) {
        Node newNode = new Node(element, head);
        head = newNode;
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    // Adiciona um elemento no final da lista
    public void addTail(String element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    // Remove o primeiro elemento da lista
    public void removeFirst() {
        if (size == 0) {
            throw new EmptySLinkedList("A lista está vazia");
        }
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    // Retorna uma representação em string da lista
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public long getSize() {
        return size;
    }
}
