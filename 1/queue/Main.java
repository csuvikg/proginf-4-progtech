package queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.push(6);
        System.out.println(q);
        q.push(5);
        System.out.println(q);
        q.top();
        System.out.println(q);
        q.pop();
        System.out.println(q);
        q.isEmpty();
        q.push(5);
        System.out.println(q);
        q.empty();
        q.isEmpty();
        System.out.println(q);
    }
}
