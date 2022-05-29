package tddClass;

public class Set {
    int count;
    int[] items = new int[5];
    public void add_item(int key, int value) {
        items[count] = value;
        count++;

    }

    public int getSize() {
        return count;
    }
}
