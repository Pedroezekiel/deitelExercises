package tddClass;

public class ArrayList {
    int counter;
    int[] elements = new int [10];
    public  void add(int element) {
        if (element >= elements.length) {
            elements = new int[elements.length + 10];
        }                                               g
        elements[counter] = element;
            counter++;

    }

    public int Size() {
        return counter;
    }

    public void add(int index, int items) {
        if (items >= elements.length) {
            elements = new int[elements.length + 10];
        }
            elements[counter] = items;
            counter++;                }




    public int get(int index) {
        return elements[index];
    }

    public void remove(int index) {
        elements[index] = counter -- ;

        }

}

