package tddClass;

public class Stack {
    private int number_of_elements;
    private int[] elements=new  int[5];

    public boolean isEmpty() {
        return number_of_elements == 0;
    }

    public void push(int element) {
        elements[number_of_elements] = element;
        number_of_elements++;

    }

    public int pop(){number_of_elements--;
        return elements[number_of_elements];
    }

    public int peek() {
        return elements[number_of_elements - 1];
    }
}
