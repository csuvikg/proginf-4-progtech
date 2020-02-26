package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MultiSet<T> {
    private List<Element> elements;

    public MultiSet() {
        elements = new ArrayList<>();
    }

    public void add(T key, int n) {
        Element element = new Element(key);
        int index = elements.indexOf(element);

        if (index != -1) {
            elements.get(index).add(n);
        } else {
            elements.add(element);
        }
    }

    public T remove(T key, int n) {
        Element element = new Element(key);
        int index = elements.indexOf(element);

        if (index != -1) {
            if (elements.get(index).remove(n) < 1) {
                return elements.remove(index).getKey();
            }
        }

        return null;
    }

    public void empty() {
        elements.clear();
    }

    public int getMultiplicity(T key) {
        Element element = new Element(key);
        int index = elements.indexOf(element);

        return index != -1 ? elements.get(index).getMultiplicity() : 0;
    }

    public MultiSet<T> union(MultiSet<T> other) {
        MultiSet<T> union = new MultiSet<>();
        // todo: finish me
        return union;
    }

    class Element {
        private T key;
        private int multiplicity;

        Element(T key) {
            this.key = key;
            multiplicity = 1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element element = (Element) o;
            return key.equals(element.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }

        int add(int n) {
            multiplicity += n;
            return multiplicity;
        }

        int remove(int n) {
            multiplicity -= n;
            return multiplicity;
        }

        int getMultiplicity() {
            return multiplicity;
        }

        T getKey() {
            return key;
        }
    }
}
