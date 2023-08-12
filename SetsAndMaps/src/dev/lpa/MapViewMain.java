package dev.lpa;

import java.util.*;

public class MapViewMain {

    public static void main(String[] args) {

        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));

        Set<String> keyView = contacts.keySet();
        System.out.println(keyView);

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);

        if (contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I go way back, so of course I have info");
        }

        keyView.remove("Daffy Duck");
        System.out.println(keyView);
        System.out.println();
        contacts.forEach((k, v) -> System.out.println("Key=" + k + ", value= " + v));

        copyOfKeys.remove("Linus Van Pelt");
        System.out.println(copyOfKeys);
        System.out.println();
        contacts.forEach((k, v) -> System.out.println("Key=" + k + ", value= " + v));

        keyView.retainAll(List.of("Linus Van Pelt", "Charlie Brown",
                "Robin Hood", "Mickey Mouse"));
        System.out.println(keyView);
        System.out.println();
        contacts.forEach((k, v) -> System.out.println("Key=" + k + ", value= " + v));

        keyView.clear();
        System.out.println();
        System.out.println("clearing the key view, contacts map which uses hash Map --" + keyView + contacts);

//        keyView.add("Daffy Duck"); // we cannot do that because we are just adding a {key} which just a part of a data needed
//        System.out.println(contacts);

        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        System.out.println(keyView);

        System.out.println();
        var values = contacts.values();
        values.forEach(System.out::println);

        System.out.println();

        values.retainAll(ContactData.getData("email"));
        System.out.println(keyView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println();
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getFirstLast));
        list.forEach(c -> System.out.println(c.getFirstLast() + ": " + c));

        System.out.println();
        Contact first = list.get(0);
        contacts.put(first.getFirstLast(), first);
        values.forEach(System.out::println);

        System.out.println();

        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if(set.size() < contacts.keySet().size()) {
            System.out.println("Duplicate values are present");
        }

        var nodeSet = contacts.entrySet();
        for (var node : nodeSet) {
            if (!node.getKey().equals(node.getValue().getName())) {
                System.out.println("key doesn't match name: " + node.getKey() + ": " +
                        node.getValue());
            }
        }
    }
}
