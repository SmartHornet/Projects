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

        arrayList.forEach(item -> item.setNumber(item.getNumber()*2));
        System.out.println("arrayList.forEach");
        System.out.println(arrayList);

        arrayList.removeIf(item -> item.getNumber() == 4);
        System.out.println("arrayList.removeIf");
        System.out.println(arrayList);

        arrayList.replaceAll(item -> new Item(item.getStr()));
        System.out.println("arrayList.replaceAll");
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


        System.out.println("HashMap");
        HashMap<String, Item> hashMap = new HashMap<>();
        for(Item i: itemArray){
            hashMap.put(i.getStr(),i);
        }

        Set<Map.Entry<String, Item>> temp =  hashMap.entrySet();
        for(Map.Entry<String, Item> i: temp){
            System.out.println(i);
        }

        


    }
}