public class Main {

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add(1);
        set.add(10001);
        set.add(1);
        set.remove(1);

        System.out.println(set.contains(1));

    }

    
}
