import java.util.*;

public class Main {
    public static void main(String[] args) {

        Item[] itemArray = new Item[3];
        itemArray[0] = new Item("Мяка");
        itemArray[1] = new Item("Пыщь");
        itemArray[2] = new Item("Кусь");

        ArrayList<Item> arrayList = new ArrayList<>(Arrays.asList(itemArray));
        System.out.println("ArrayList");
        System.out.println(arrayList);

        LinkedList<Item> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(itemArray));
        System.out.println("LinkedList");
        System.out.println(linkedList);

        Iterator<Item> iterator = linkedList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Item> hashSet = new HashSet<>(Arrays.asList(itemArray));
        System.out.println("HashSet");
        System.out.println(hashSet);

        TreeSet<Item> treeSet = new TreeSet<>((itemA, itemB) -> itemB.toString().compareTo(itemA.toString()));

        treeSet.addAll(Arrays.asList(itemArray));


        System.out.println("TreeSet");
        System.out.println(treeSet);

    }
}