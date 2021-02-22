import java.util.ArrayList;

public class Student {
    public long id;
    public String name;
    public int grade;
    public ArrayList<Integer> Grades;
    public double gradeAverage;


    public Student(long id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // returns the student's id
    public long getId(){
        return this.id;
        }

    // returns the student's name
    public String getName(){
        return this.name;

    }

    // adds the given grade to the grades list
    public void addGrade(int grade){


    }

    // returns the list of grades
    public void getGrades(){
        return;


    }

    // returns the average of the students grades
    public double getGradeAverage(){
        return gradeAverage;

    }


}
