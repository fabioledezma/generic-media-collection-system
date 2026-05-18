package dev.flq.refuerzoSeniorIV;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MediaCollection<T> {

    private String name;
    private List<T> items = new ArrayList<>();

    public MediaCollection(String name) {
        this.name = name;
    }

    public void addItems(T item) {

        Objects.requireNonNull(item);

        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public boolean removeItem(T item) {
        return items.remove(item);
    }

    private List<T> getitems () {
        return items;
    }

    public void printItems() {
        System.out.println(getitems());
    }
}
