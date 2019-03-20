package ru.tracker;
import java.util.*;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item; 
    }

    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
               result = item;
               break;
            } 
        }
        return result;
    }

    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }

    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int i = 0; i < this.position; i++) {
            result[i] = this.items[i];
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] arr = findAll();
        int amountsame = 0;
        for (Item it : arr) {
            if (key.equals(it.getName())) {
                amountsame++;
            }
        }
        Item[] arrayresult = new Item[amountsame];
        int index = 0;
        for (Item it : arr) {
            if (key.equals(it.getName())) {
                arrayresult[index] = it;
                index++;
            }
        }
        return arrayresult;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (id.equals(items[i].getId())) {
                item.setId(id);
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (id.equals(items[i].getId())) {
                Item[] arraynew = new Item[items.length - 1];
                System.arraycopy(items, 0, arraynew, 0, i);
                System.arraycopy(items, i + 1, arraynew, i, items.length - i - 1);
                items = arraynew;
                result = true;
                break;
            }
        }
        return result;
    }
}