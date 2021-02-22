import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;





public class StudentTest {
    private Student student1;

    @Before
    public void setUp(){
        student1 = new Student(1234567890, "Student1");
        student1.addGrade(91);
        student1.addGrade(90);
        student1.addGrade(89);
        assertEquals(java.util.Optional.of(90), student1.getGrades().get(0));
        assertEquals(java.util.Optional.of(100), student1.getGrades().get(1));
    }

    @Test
    public void testName(){
        assertEquals("Student1", student1.getName());
        assertNotEquals("Student", student1.getName());

    }

    @Test
    public void testID(){
        assertEquals(1234567890, student1.getId());
        assertNotEquals(1234567891, student1.getId());
    }

    @Test
    public void testGrades(){
        ArrayList<Integer> testGrade = new ArrayList<>();
        testGrade.add(91);
        testGrade.add(90);
        testGrade.add(89);
        assertEquals(testGrade, student1.getGrades());
    }

    @Test
    public void testGradeAverage(){
        assertEquals(90, student1.getGradeAverage(),0);
    }

    @Test
    public void testIfStudentObjCanBeCreated(){
        Student fer = new Student(2l, "fer");
        Student david = null;
        assertNull(david);
        assertNotNull(fer);
    }

    @Test
    public void testIfFieldWork(){
        Student fer = new Student(1L, "fer");
        assertEquals(1,fer.getId());
        assertEquals("fer", fer.getName());
        assertNotNull(fer.getGrades());

        Student david = new Student(2L, "david" );
        assertNotEquals("fer", david.getName());
    }




        @Test
        public void testCreateStudent(){
            Student ron = new Student(1L, "ron");
            Student clark = null;
            assertNull(clark);
            assertNotNull(ron);
        }

        @Test
        public void testStudentFields(){
            Student ron = new Student(1L, "ron");
            assertSame(1L, ron.getId());
            assertSame("ron", ron.getName());
            assertSame(0, ron.getGrades().size());
        }


        @Test
        public void testAddGrade(){
            Student ron  = new Student(1L, "ron");
            ron.addGrade(100);
            assertSame(100,ron.getGrades().get(0));
            ron.addGrade(80);
            assertSame(80, ron.getGrades().get(1));
        }

        @Test
        public void testAverageGrade(){
            Student ron = new Student(1L, "ron");
            ron.addGrade(100);
            ron.addGrade(80);
            assertEquals(90, ron.getGradeAverage(), 0);
        }
    }





