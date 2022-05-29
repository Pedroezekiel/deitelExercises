package tddClass;

public class Queue {
    int counter;
    int [] elements = new int[5];
    public void addQueue(int element) {
        elements[counter] = element;
        counter++;


    }

    public int set_size() {
        return counter;
    }

    public void remove() {
        for (int element : elements) {
            element = counter--;

        }


    }
}
