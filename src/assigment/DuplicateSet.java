package assigment;

public class DuplicateSet {
    public static void main(String[] args) {
        DuplicateSet.sum();

    }

    static void sum() {
        int[][] sets = {{2, 2, 3, 4, 5},
                {5, 6, 2, 3, 9}};
        for (int i = 0; i < sets.length; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.println(j);
            }
        }
    }
}