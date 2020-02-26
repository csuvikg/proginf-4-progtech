package gyak3.src.gyak3.bag_arraylist;

import java.util.Objects;

class BagItem {

    private final String item;
    private int num;

    public BagItem(String Item, int num) {
        this.item = Item;
        this.num = num;
    }

    public void addNum(int num) {
        this.num += num;
    }

    public String getItem() {
        return item;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof BagItem)) {
            return false;
        }
        BagItem bi = (BagItem) o;
        return Objects.equals(this.item, bi.item) && Objects.equals(this.num, bi.num);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.item);
        hash = 53 * hash + this.num;
        return hash;
    }

    @Override
    public String toString() {
        return item + "=" + num;
    }
}
