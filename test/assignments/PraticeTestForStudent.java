package assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PraticeTestForStudent {
    //    StudentGradesReport;
//    @BeforeEach
//    public void  startWith(){}
    @Test
    public void testForSumPerStudent() {
        int[][] grades = {{90, 20, 40},
                {40, 40, 20}};
        StudentGradesReport report = new StudentGradesReport(grades);
        assertEquals(150, report.getSumForStudent(0));
        assertEquals(100, report.getSumForStudent(1));
    }

    @Test
    public void testForStudentAverage() {
        int[][] grades = {{10, 10, 10},
                {40, 40, 20}};
        StudentGradesReport report = new StudentGradesReport(grades);
        assertEquals(10.0, report.getAverage(0));
        assertEquals(33.0, report.getAverage(1));
    }

    @Test
    public void testStudentPosition() {
        int[][] grades = {{10, 10, 10},{40,40,20}};
        StudentGradesReport report = new StudentGradesReport(grades);
        int result = report.getStudentPosition(0);
        assertEquals(2,result);


    }
}