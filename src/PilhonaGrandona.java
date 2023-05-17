import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


public class PilhonaGrandona <T> {
    private List<T> pilhona = new ArrayList<T>();

    //empilhar
    public void push(T element) {
        pilhona.add(element);
    }

    //tamanho da pilha
    public int size() {
        return pilhona.size();
    }

    //desempilhado
    public T pop() {
        if (pilhona.isEmpty()) {
            throw new EmptyStackException();
        }
        return pilhona.remove(size() - 1);
    }

    //Pilha vazia
    public boolean isEmpty() {
        return pilhona.isEmpty();
    }

    //mostrar o topo da pilha
    public T top() {
        if (pilhona.isEmpty()) {
            throw new EmptyStackException();
        }
        return pilhona.get(size() - 1);
    }

    @Override
    public String toString() {
        if (size() == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        int lastIndex = pilhona.size() - 1;

        for (int i = lastIndex; i >= 0; i--) {
            builder.append(pilhona.get(i));

            if (i > 0) {
                builder.append(", ");
            }
        }

        builder.append("]");
        return builder.toString();
    }
}