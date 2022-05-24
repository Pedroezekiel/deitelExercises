package assignments;

public class StudentGradesReport {

    private int[][] grades = new int[4][5];

    public StudentGradesReport(int[][] grades) {this.grades = grades;}

    public int getSumForStudent(int index) {
        int sum = 0;
        for (int counter = 0; counter < grades[index].length; counter += 1) {
            sum += grades[index][counter];
        }
        return sum;
    }

    public int getAverage(int index) {return getSumForStudent(index)/grades[index].length;}

    public int getStudentPosition(int index) {
        int [ ] arrayOfStudentSum = new int[grades.length];
        //get the sum
        for(int counter = 0; counter < grades.length; counter++){
            arrayOfStudentSum[counter]  = getSumForStudent(counter);  ;
        }






        //store the sum in an array
        //short in descending order
        //
        return 0;
    }
}