import java.util.ArrayList;

public class Bage {
    private class Item {
        private String name;
        private int Quntity;

       public Item(String name ,int Quntity) {
            this.name = name;
            this.Quntity = Quntity;
        }

        public String getName() {
            return name;
        }

        public int getQuntity() {
            return Quntity;
        }

        public void incrementQuntity() {
            Quntity++;
        }
    }

    private ArrayList<Item> items;

    Bage() {
        items = new ArrayList<>();
    }

    public void add(String itemName) {
        for (Item item : items) {
            if (item.name.equals(itemName)) {
                item.Quntity++;
                return;
            }
        }
        items.add(new Item(itemName,1));
    }

    public int count(String itemName) {

        for (Item item : items) {
            if (item.name.equals(itemName)) {
                return item.Quntity;

            }
        }
        return 0;
    }
}