import java.util.ArrayList;

public class StudentGrades{
<<<<<<< Updated upstream
    public ArrayList<Double>assignmentGrade=new ArrayList<>();
    public ArrayList<Double>quizGrade=new ArrayList<>();
    private  double midTermGrade;
    private  double finalGrade;
    private double attendanceGrade;
    public StudentGrades(){}
    public StudentGrades(double assignmentGrade, double quizGrade, double midTermGrade, double finalGrade, double attendanceGrade){
//            this.assignmentGrade=assignmentGrade; //20
//            this.quizGrade=quizGrade;             //10
        this.midTermGrade=midTermGrade;       //15
        this.finalGrade=finalGrade;           //50
        this.attendanceGrade=attendanceGrade; //5
    }
    public void setAssignmentGrade(int index,double assgrade) {
        assignmentGrade.add(index,assgrade);
    }
    public void setQuizGrade(int index, double quizgrade) {
        quizGrade .add(index,quizgrade);
    }
    public void setMidTermGrade(double midTermGrade) {
        this.midTermGrade = midTermGrade;
    }
    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    public void setAttendanceGrade(double attendanceGrade) {
        this.attendanceGrade = attendanceGrade;
    }
    public double getAssignmentGrade() {
        double totalassignment=0;
        for(double grade:assignmentGrade){
            totalassignment+=grade;
        }
        return totalassignment;
    }
    public double getQuizGrade() {
        double totalquiz=0;
        for(double grade:quizGrade){
            totalquiz+=grade;
        }
        return totalquiz;
    }
    public double getMidTermGrade() {
        return midTermGrade;
    }
    public double getFinalGrade() {
        return finalGrade;
    }
    public double getAttendanceGrade() {
        return attendanceGrade;
    }
    public double CalcTotalGrade(){
        double totalMark=(this.getAssignmentGrade() + this.getQuizGrade() + midTermGrade + finalGrade + attendanceGrade);
        return totalMark;
    }
    public double Calcscale(){//esraa
        double scale;
        double totalMark=this.CalcTotalGrade();
        if(totalMark<=100 && totalMark>=93){
            scale=4.0;
        } else if (totalMark<93 && totalMark>=89) {
            scale=3.7;
        } else if (totalMark<89 && totalMark>=84) {
            scale=3.3;
        } else if (totalMark<84 && totalMark>=80 ) {
            scale=3.0;
        } else if (totalMark<80 && totalMark>=76 ) {
            scale=2.7;
        } else if (totalMark<76 && totalMark>=73) {
            scale=2.3;
        } else if (totalMark<73 && totalMark>=70) {
            scale=2.0;
        } else if (totalMark<70 && totalMark>=67) {
            scale=1.7;
        } else if (totalMark<67 && totalMark>=64) {
            scale=1.3;
        } else if (totalMark<64 && totalMark>=60) {
            scale=1.0;
        }else{
            scale=0.0;
        }
        return scale;
    }
    public String CalcLetterGrade(double totalMark){
        String letterGrade;
        if(totalMark>=89 && totalMark<=100) {
            letterGrade = "A";
        }
        else if(totalMark>=76 && totalMark<=88){
            letterGrade = "B";
        }
        else if(totalMark>=67 && totalMark<=75) {
            letterGrade = "C";
        }
        else if(totalMark>=60 && totalMark<=67) {
            letterGrade = "D";
        }
        else{
            letterGrade = "F";
        }
        return letterGrade;
    }
    public void DisplayReport(String studentName , int id, ArrayList<Student>students){
        for(int i=0;i<students.get(id).getNoOfCourses();i++) {
            double courseGrade = CalcTotalGrade();
            double courseScale = Calcscale();
            String courseLetterGrade = CalcLetterGrade(courseGrade);
            System.out.println((i+1)+"- Course : " + students.get(id).Student_courses.get(i).courseTitle);
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + id);
            System.out.println("Midterm: " + students.get(id).Student_Grades.get(i).getMidTermGrade());
            System.out.println("Assignment: " + students.get(id).Student_Grades.get(i).getAssignmentGrade());
            System.out.println("Quiz: " + students.get(id).Student_Grades.get(i).getQuizGrade());
            System.out.println("Attendance:" + students.get(id).Student_Grades.get(i).getAttendanceGrade());
            System.out.println("Final:" + students.get(id).Student_Grades.get(i).getFinalGrade());
            System.out.println("Total Grade: " + courseGrade);
            System.out.println("Points: " + courseScale);
            System.out.println("Letter Grade: " + courseLetterGrade);
        }
    }
}//class
=======

        public ArrayList<Double>assignmentGrade=new ArrayList<>();
        public ArrayList<Double>quizGrade=new ArrayList<>();
        private  double midTermGrade;
        private  double finalGrade;
        private double attendanceGrade;
        public StudentGrades(){}
        public StudentGrades(double assignmentGrade, double quizGrade, double midTermGrade, double finalGrade, double attendanceGrade){
//            this.assignmentGrade=assignmentGrade; //20
//            this.quizGrade=quizGrade;             //10
            this.midTermGrade=midTermGrade;       //15
            this.finalGrade=finalGrade;           //50
            this.attendanceGrade=attendanceGrade; //5
        }
        public void setAssignmentGrade(int index,double assgrade) {
            assignmentGrade.add(index,assgrade);
        }
        public void setQuizGrade(int index, double quizgrade) {
            quizGrade .add(index,quizgrade);

    public ArrayList<Double>assignmentGrade=new ArrayList<>();
    public ArrayList<Double>quizGrade=new ArrayList<>();
    private  double midTermGrade;
    private  double finalGrade;
    private double attendanceGrade;
    public StudentGrades(){}
    public StudentGrades(double assignmentGrade, double quizGrade, double midTermGrade, double finalGrade, double attendanceGrade){
//            this.assignmentGrade=assignmentGrade; //20
//            this.quizGrade=quizGrade;             //10
        this.midTermGrade=midTermGrade;       //15
        this.finalGrade=finalGrade;           //50
        this.attendanceGrade=attendanceGrade; //5
    }
    public void setAssignmentGrade(int index,double assgrade) {
        assignmentGrade.add(index,assgrade);
    }
    public void setQuizGrade(int index, double quizgrade) {
        quizGrade .add(index,quizgrade);
    }
    public void setMidTermGrade(double midTermGrade) {
        this.midTermGrade = midTermGrade;
    }
    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    public void setAttendanceGrade(double attendanceGrade) {
        this.attendanceGrade = attendanceGrade;
    }
    public double getAssignmentGrade() {
        double totalassignment=0;
        for(double grade:assignmentGrade){
            totalassignment+=grade;
        }
        return totalassignment;
    }
    public double getQuizGrade() {
        double totalquiz=0;
        for(double grade:quizGrade){
            totalquiz+=grade;
        }
        return totalquiz;
    }
    public double getMidTermGrade() {
        return midTermGrade;
    }
    public double getFinalGrade() {
        return finalGrade;
    }
    public double getAttendanceGrade() {
        return attendanceGrade;
    }
    public double CalcTotalGrade(){
        double totalMark=(this.getAssignmentGrade() + this.getQuizGrade() + midTermGrade + finalGrade + attendanceGrade);
        return totalMark;
    }
    public double Calcscale(){//esraa
        double scale;
        double totalMark=this.CalcTotalGrade();
        if(totalMark<=100 && totalMark>=93){
            scale=4.0;
        } else if (totalMark<93 && totalMark>=89) {
            scale=3.7;
        } else if (totalMark<89 && totalMark>=84) {
            scale=3.3;
        } else if (totalMark<84 && totalMark>=80 ) {
            scale=3.0;
        } else if (totalMark<80 && totalMark>=76 ) {
            scale=2.7;
        } else if (totalMark<76 && totalMark>=73) {
            scale=2.3;
        } else if (totalMark<73 && totalMark>=70) {
            scale=2.0;
        } else if (totalMark<70 && totalMark>=67) {
            scale=1.7;
        } else if (totalMark<67 && totalMark>=64) {
            scale=1.3;
        } else if (totalMark<64 && totalMark>=60) {
            scale=1.0;
        }else{
            scale=0.0;
>>>>>>> 4923b19cc71ba6bd8a74dcac151c8c757558087e
        }
        return scale;
    }
    public String CalcLetterGrade(double totalMark){
        String letterGrade;
        if(totalMark>=89 && totalMark<=100) {
            letterGrade = "A";
        }
        else if(totalMark>=76 && totalMark<=88){
            letterGrade = "B";
        }
        else if(totalMark>=67 && totalMark<=75) {
            letterGrade = "C";
        }
<<<<<<< HEAD
        public double getAssignmentGrade() {
            double totalassignment=0;
            for(double grade:assignmentGrade){
                totalassignment+=grade;
            }
            return totalassignment;
        }
        public double getQuizGrade() {
            double totalquiz=0;
            for(double grade:quizGrade){
                totalquiz+=grade;
            }
            return totalquiz;
=======
        else if(totalMark>=60 && totalMark<=67) {
            letterGrade = "D";
        }
        else{
            letterGrade = "F";
>>>>>>> 4923b19cc71ba6bd8a74dcac151c8c757558087e
        }
        return letterGrade;
    }
    public void DisplayReport(String studentName , int id, ArrayList<Student>students){
        for(int i=0;i<students.get(id).getNoOfCourses();i++) {
            double courseGrade = CalcTotalGrade();
            double courseScale = Calcscale();
            String courseLetterGrade = CalcLetterGrade(courseGrade);
            System.out.println((i+1)+"- Course : " + students.get(id).Student_courses.get(i).courseTitle);
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + id);
            System.out.println("Midterm: " + students.get(id).Student_Grades.get(i).getMidTermGrade());
            System.out.println("Assignment: " + students.get(id).Student_Grades.get(i).getAssignmentGrade());
            System.out.println("Quiz: " + students.get(id).Student_Grades.get(i).getQuizGrade());
            System.out.println("Attendance:" + students.get(id).Student_Grades.get(i).getAttendanceGrade());
            System.out.println("Final:" + students.get(id).Student_Grades.get(i).getFinalGrade());
            System.out.println("Total Grade: " + courseGrade);
            System.out.println("Points: " + courseScale);
            System.out.println("Letter Grade: " + courseLetterGrade);
        }
<<<<<<< HEAD
        public double getFinalGrade() {
            return finalGrade;
        }
        public double getAttendanceGrade() {
            return attendanceGrade;
        }
        public double CalcTotalGrade(){
            double totalMark=(this.getAssignmentGrade() + this.getQuizGrade() + midTermGrade + finalGrade + attendanceGrade);
            return totalMark;
        }
        public double Calcscale(){//esraa
            double scale;
            double totalMark=this.CalcTotalGrade();
            if(totalMark<=100 && totalMark>=93){
                scale=4.0;
            } else if (totalMark<93 && totalMark>=89) {
                scale=3.7;
            } else if (totalMark<89 && totalMark>=84) {
                scale=3.3;
            } else if (totalMark<84 && totalMark>=80 ) {
                scale=3.0;
            } else if (totalMark<80 && totalMark>=76 ) {
                scale=2.7;
            } else if (totalMark<76 && totalMark>=73) {
                scale=2.3;
            } else if (totalMark<73 && totalMark>=70) {
                scale=2.0;
            } else if (totalMark<70 && totalMark>=67) {
                scale=1.7;
            } else if (totalMark<67 && totalMark>=64) {
                scale=1.3;
            } else if (totalMark<64 && totalMark>=60) {
                scale=1.0;
            }else{
                scale=0.0;
            }
            return scale;
        }
        public String CalcLetterGrade(double totalMark){
            String letterGrade;
            if(totalMark>=89 && totalMark<=100) {
                letterGrade = "A";
            }
            else if(totalMark>=76 && totalMark<=88){
                letterGrade = "B";
            }
            else if(totalMark>=67 && totalMark<=75) {
                letterGrade = "C";
            }
            else if(totalMark>=60 && totalMark<=67) {
                letterGrade = "D";
            }
            else{
                letterGrade = "F";
            }
            return letterGrade;
        }
        public void DisplayReport(String studentName , int id, ArrayList<Student>students){
            for(int i=0;i<students.get(id).getNoOfCourses();i++) {
                double courseGrade = CalcTotalGrade();
                double courseScale = Calcscale();
                String courseLetterGrade = CalcLetterGrade(courseGrade);
                System.out.println((i+1)+"- Course : " + students.get(id).Student_courses.get(i).courseTitle);
                System.out.println("Student Name: " + studentName);
                System.out.println("Student ID: " + id);
                System.out.println("Midterm: " + students.get(id).Student_Grades.get(i).getMidTermGrade());
                System.out.println("Assignment: " + students.get(id).Student_Grades.get(i).getAssignmentGrade());
                System.out.println("Quiz: " + students.get(id).Student_Grades.get(i).getQuizGrade());
                System.out.println("Attendance:" + students.get(id).Student_Grades.get(i).getAttendanceGrade());
                System.out.println("Final:" + students.get(id).Student_Grades.get(i).getFinalGrade());
                System.out.println("Total Grade: " + courseGrade);
                System.out.println("Points: " + courseScale);
                System.out.println("Letter Grade: " + courseLetterGrade);
            }
        }
    }//class



=======
    }
}//class
>>>>>>> 4923b19cc71ba6bd8a74dcac151c8c757558087e
>>>>>>> Stashed changes
