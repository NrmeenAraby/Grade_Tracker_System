import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
static ArrayList<Course>courses=new ArrayList<>();
static ArrayList<Instructor>instructors=new ArrayList<>();
static ArrayList<Student>students=new ArrayList<>();
static ArrayList<FinalExam>finalExams=new ArrayList<>();
static ArrayList<MidtermExam>midtermExams=new ArrayList<>();
static ArrayList<Assignment>assignments=new ArrayList<>();
static ArrayList<Quiz>quizzes=new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Files.readStudents();

     int studentId = 0, instructorId = 0;
        System.out.println("Already have an account?");
        System.out.println("1- Yes");
        System.out.println("2- No\n");
        int account = input.nextInt();

        if (account == 1) {

            Form.LogIn(students,instructors);

        } else if (account == 2) {
            int who;
            do {
                System.out.println("Register as : ");
                System.out.println("1- Instructor");
                System.out.println("2- Student");
                who = input.nextInt();
                if(who==1||who==2)
                    break;
                System.out.println("Invalid Choice!Try Again.");
            }while (true);
            Form.Registration(who,students,instructors,studentId,instructorId);
            if (who==1){
                instructors.get(instructorId).forSignIn();
                instructorId++;
            }else {
                for (Student student:students) {
                    System.out.println(student.getID());
                    System.out.println(student.getUsername());

                }
             //   Form.LogIn(students,instructors);
                Student.Student_AfterLogin(studentId,students,courses);
                        studentId++;
            }

        } else {
            System.out.println("Invalid Choice!Try Again.");
        }
      /*  Course course = new Course();
        course.courseTitle = "OOP";
        course.setCourseCode("5465");
        Course course1 = new Course();
        course1.courseTitle = "Logic";
        course1.setCourseCode("5786");
        courses.add(course);
        courses.add(course1);
        Student student1 = new Student();
        student1.RegisterForCourse(courses);
        studentsArray.add(student1);
        Student student2 = new Student();
        student1.RegisterForCourse(courses);
        studentsArray.add(student2);
        Student student3 = new Student();
        student1.RegisterForCourse(courses);
        studentsArray.add(student3);
        Instructor instructor = new Instructor("Sara","Darwish","Genady","CS");
        Admin a=new Admin();
        a.assignCoursesToInstructors("5465",0);
        instructor.forSignIn();
        student1.ViewGrades();
        student2.ViewGrades();
        student3.ViewGrades();*/


        //test case for Instructor skip
        /*String n=input.next(),l=input.next(),off=input.next(),dep=input.next();
        int num=input.nextInt();
        Instructor instructor= new Instructor(n,l,off,dep,num);
        instructorMenu(instructor);*/
        Files.writeStudents();
    }
    public static void instructorMenu(Instructor instructor){
        System.out.println("1-Show your information\n2-Edit your information");
        System.out.println("3-View students\n4-Assign Assessment");
        System.out.println("5-Take attendance\n6-Input students Grades");
        System.out.println("7-Make report for attendance specific student");
        System.out.println("8-Make report for attendance all students");
        System.out.println("Enter your choice");
        int choice = input.nextInt();
        selectInstrMenu(choice,instructor);
    }
    public static void selectInstrMenu(int x,Instructor instructor){
        switch (x){
            case 1:
                instructor.display();
                break;
            case 2:
                instructor.editInfo();
                instructor.display();
                break;
            case 3:
                instructor.viewEnrolledStudents();
                break;
            case 4:
                instructor.setAssessmentsToCourse();
                break;
            case 5:
                instructor.trackAttendance();
                break;
            case 6:
                instructor.inputGrades();
                break;
            case 7:
                System.out.println("Enter student ID");
                int studentID=input.nextInt();
                instructor.generateAttRepForIndStud(studentID);
                break;
            case 8:
                instructor.generateAttrepforallstud();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }


}