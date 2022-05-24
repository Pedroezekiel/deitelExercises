package assigment;

public class sets {
    public static void main(String[] args) {
        distinctSet();
    }
    public static void distinctSet(){
        int[] set1 = {3,1,7,9};
        int[] set2 = {2,4,1,9,3};
        int sum =0;

        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set2.length; j++) {
                if(set1[i] ==set2[j]){
                    sum +=   set1[i]+set1[i];
                }
                
            }
        }
    }
}
