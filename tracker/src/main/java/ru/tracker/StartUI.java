package ru.tracker;

import java.util.Date;

public class StartUI {
    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";

    private final Input input;
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Choose item of menu : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findItemById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void findItemByName() {
        System.out.println("------------ Start searching --------------");
        String name = this.input.ask("Enter name of searching requests : ");
        Item[] items = this.tracker.findByName(name);
        for (Item it : items) {
            System.out.println(it);
        }
        System.out.println("------------ Finish searching --------------");
    }

    private void findItemById() {
        System.out.println("------------ Start searching --------------");
        String id = this.input.ask("Enter Id of searching request : ");
        Item item = this.tracker.findById(id);
        if (item == null) {
            System.out.println("There is no such request!");
        } else {
            System.out.println(item);
        }
        System.out.println("------------ Finish searching --------------");
    }

    private void deleteItem() {
        System.out.println("------------ Deliting request --------------");
        String id = this.input.ask("Enter Id of deliting request : ");
        boolean result = this.tracker.delete(id);
        if (result) {
            System.out.println("Deliting was successful");
        } else {
            System.out.println("Deliting was not successful! Try again!");
        }
        System.out.println("------------ Finish deliting --------------");
    }

    private void editItem() {
        System.out.println("------------ Editing old request --------------");
        String id = this.input.ask("Enter Id of changing request : ");
        String name = this.input.ask("Enter name of request :");
        String desc = this.input.ask("Enter description of request :");
        Item old = tracker.findById(id);
        Item item = new Item(name, desc, old.getTime());
        boolean result = this.tracker.replace(id, item);
        if (result) {
            System.out.println("Editing was successful");
        } else {
            System.out.println("Editing was not successful! Try again!");
        }
        System.out.println("------------ Finish editing --------------");
    }

    private void showAllItems() {
        Item[] items = this.tracker.findAll();
        System.out.println("------------ Start showing --------------");
        if (items.length == 0) {
            System.out.println("\nThere is no anyone request. Add your!\n");
        } else {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
        }
        System.out.println("------------ Finish showing --------------");
    }

    private void createItem() {
        System.out.println("------------ Adding new request --------------");
        String name = this.input.ask("Enter name of request : ");
        String desc = this.input.ask("Enter description of request : ");
        Date time = new Date();
        Item item = new Item(name, desc, time);
        this.tracker.add(item);
        System.out.println("------------ New request has getId : " + item.getId() + "-----------");
    }

    private void showMenu() {
        System.out.println("Menu.\n0. Add new Item\n1. Show all items\n2. Edit item");
        System.out.println("3. Delete item\n4. Find item by Id\n5. Find items by name");
        System.out.println("6. Exit Program");

    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}