//package map;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class MultiSet<T> {
//    private Map<T, Integer> elements;
//
//    public MultiSet() {
//        elements = new HashMap<>();
//    }
//
//    public void add(T key, int n) {
//        int multiplicity = n;
//        if (elements.containsKey(key)) {
//            multiplicity += elements.get(key);
//        }
//        elements.put(key, multiplicity);
//    }
//
//    public T remove(T key, int n) {
//        if (elements.containsKey(key)) {
//            int multiplicity = elements.get(key);
//            if (elements.get(index).remove(n) < 1) {
//                return elements.remove(index).getKey();
//            }
//        }
//
//        return null;
//    }
//
//    public void empty() {
//        elements.clear();
//    }
//
//    public int getMultiplicity(T key) {
//        Element element = new Element(key);
//        int index = elements.indexOf(element);
//
//        return index != -1 ? elements.get(index).getMultiplicity() : 0;
//    }
//
//    public MultiSet<T> union(MultiSet<T> other) {
//        MultiSet<T> union = new MultiSet<>();
//        // todo: finish me
//        return union;
//    }
//}
