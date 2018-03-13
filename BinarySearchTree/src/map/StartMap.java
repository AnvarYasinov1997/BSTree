package map;

public class StartMap {

    public static void main(String[] args) {
        BSTree<Integer, String> map = new BSTree<>();
        map.add(0, "Value1");
        map.add(1, "Value2");
        System.out.println(map.get(0));
        map.remove(1);
        map.containsKey(0);
        map.containsKey(1);
    }
}
