package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue <T> {
    private List<T> items = new ArrayList<>();

    public void push(T e) {
        items.add(e);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public T pop() throws EmptyQueueException {
        try {
            return items.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyQueueException();
        }
    }

    public T top() throws EmptyQueueException {
        try {
            return items.get(0);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyQueueException();
        }
    }

    public void empty() {
        items.clear();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
