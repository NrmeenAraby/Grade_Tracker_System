
import java.util.ArrayList;
import java.io.*;
public class Course {
    private   String courseCode;
    public  String courseTitle;
    public  int credits;  //>>convert it to string while we deal with files
    public String department;
    public  String description;
    public boolean[][] attendance = new boolean[10][2];
    public Instructor assignedInstructor = new Instructor();
    //public StudentGrades grades = new StudentGrades();
    public ArrayList<Assignment> assignedAssignment = new ArrayList<>();
    public ArrayList<Quiz>assignedQuiz =  new ArrayList<>();
    public Assignment assignedAssignment = new Assignment();
    public Quiz assignedQuiz = new Quiz();
    private double mean;
    private double StandardDeviation; //if used

   // public Assignment assignedAssignment = new Assignment();
   // public Quiz assignedQuiz = new Quiz();
    public MidtermExam assignedMidterm = new MidtermExam();
    public FinalExam assignedfinal = new FinalExam();
    public ArrayList<Student>enrolledStudents=new ArrayList<Student>();
    public String []sessionDates=new String[2];
    Course () {}
    Course (String courseCode,String courseTitle,int credits,String department,String description,Instructor assignedInstructor,
    Assignment assignedAssignment,Quiz assignedQuiz,MidtermExam assignedMidterm,FinalExam assignedfinal)
    {
        this.courseCode=courseCode;
        this.courseTitle=courseTitle;
        this.credits=credits;
        this.department=department;
        this.description=description;
        this.assignedInstructor=assignedInstructor;
        this.assignedAssignment.add(assignedAssignment);
        this.assignedQuiz.add(assignedQuiz);
        this.assignedfinal=assignedfinal;
        this.assignedMidterm=assignedMidterm;
        no_of_courses++;
    }
    public void setGrade(StudentGrades grade)
    {
        this.grade=grade;
    }
    public StudentGrades getGrade()
    {
        return grade;
    }
    public Course(String courseCode,String courseTitle)
    {
        this.courseCode=courseCode;
        this.courseTitle=courseTitle;
        no_of_courses++;
    }
    public void setCourseCode(String courseCode)
    {
        this.courseCode=courseCode;
    }
    public String getCourseCode(String courseCode)
    {
        return  courseCode;
    }
    public void enrollStudent(Student student) //>>student sends me the student and its index
    {
         enrolledStudents.add(student);
    }
    public  void dropStudent(int studentIdx) //>>student sends me that index
    {
        try {
            enrolledStudents.remove(studentIdx);
            }
        catch (IndexOutOfBoundsException IOBex)
        {
            System.out.println(IOBex.getMessage());
        }
    }
    public void addAssignedAssignment(Assignment assignedAssignment) //>>instructor sends me that assignment
    {
        this.assignedAssignment.add(assignedAssignment);
    }
    public void addAssignedQuiz(Quiz assignedQuiz) //>>instructor sends me that quiz
    {
       this.assignedQuiz.add(assignedQuiz);
    }
    public void addAssignedMidterm(MidtermExam assignedMidterm) //>>instructor sends me that Mid
    {
        this.assignedMidterm=assignedMidterm;
    }
    public void addAssignedFinal(FinalExam assignedfinal) //>>instructor sends me that finalExam
    {
       this.assignedfinal=assignedfinal;
    }

    public void setGrades(StudentGrades grade)    //>>Main will send it to me    //array or just a variable?
    {
        // grades.add(grade);
    }

    public double CalcMean(){
        double sum=0;
        for (Student student:enrolledStudents) {
            for (int i=0;i<student.getNoOfCourses();i++) {
                if(student.Student_courses.get(i).courseCode.equals(this.courseCode)){
                    sum+=student.Student_Grades.get(i).CalcTotalGrade();
                }
            }
        }
        mean=sum/enrolledStudents.size();
        return mean;
    }

    public double CalcStandardDeviation(){
        double sum=0;
        for (Student student:enrolledStudents) {
            for (int i=0;i<student.getNoOfCourses();i++) {
                if(student.Student_courses.get(i).courseCode.equals(this.courseCode)){
                    sum+=Math.pow(student.Student_Grades.get(i).CalcTotalGrade()-mean,2);
                }
            }
        }
        sum/=enrolledStudents.size()-1;
        StandardDeviation=Math.sqrt(sum);
        return StandardDeviation;
    }
}

