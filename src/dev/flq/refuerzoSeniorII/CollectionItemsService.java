package dev.flq.refuerzoSeniorII;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionItemsService {

    private String name;
    private List<ItemCollection> items = new ArrayList<>();

    public CollectionItemsService(String name) {
        this.name =  name;
    }

    public List<ItemCollection> getItems() {
        return items;
    }

    public void addItem(ItemCollection item) {
        if (Objects.isNull(item)) {
            System.out.println("Its null");
            return;
        }

        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public boolean removeItem(ItemCollection item) {
        return items.remove(item);
    }

    public void printItems() {
        System.out.println(getItems());
    }
}
