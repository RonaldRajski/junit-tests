import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;


@Before
public void setup() {
    emptyCohort = new Cohort();
    cohortWithOne = new Cohort();
    cohortWithMany = new Cohort();

    Student ron = new Student(1, "Ron rajski");
    ron.addGrade(65);
    ron.addGrade(76);

    Student wade = new Student(2, "Wade Wilson");
    wade.addGrade(110);
    wade.addGrade(100);
    wade.addGrade(90);

    Student bruce = new Student(3, "Bruce Wayne");
    bruce.addGrade(70);
    bruce.addGrade(80);
    bruce.addGrade(90);


    cohortWithOne.addStudent(ron
    );
    cohortWithMany.addStudent(ron);
    cohortWithMany.addStudent(wade);
}

//    Cohort can add a student to a list of students
    @Test
            public void testAddStudentWorks(){
        cohortWithMany.addStudent(new Student(3, "Diana Prince"));

//        Test by getting a specific student's name

    assertEquals("Wade Wilson", cohortWithMany.getStudents().get(1).getName());

//        cohortWithMany.addStudent(new Student(5, "Vivian Canales"));
//        // Or we can test if addStudent worked by checking the size of the list
//        assertEquals(5, cohortWithMany.getStudents().size());

    }

    //A Cohort instance can get the current List of students.
    @Test
    public void testIfGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());

        assertEquals(1, cohortWithMany.getStudents().get(0).getId());
        assertEquals(2, cohortWithMany.getStudents().get(1).getId());
    }

    //A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0);
        assertEquals(90.0, cohortWithOne.getCohortAverage(), 0);
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }





}




