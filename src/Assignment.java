import java.time.LocalDate;

public class Assignment extends Test {
    private LocalDate Assignment_startDate;
    private LocalDate Assignment_Deadline;
    String courseCode;
    public Assignment() {}

    public Assignment() {
    }

    public Assignment(LocalDate Assignment_startDate, LocalDate Assignment_Deadline) {
        this.Assignment_startDate = Assignment_startDate;
        this.Assignment_Deadline = Assignment_Deadline;

    public Assignment(LocalDate Assignment_startDate, LocalDate Assignment_Deadline)
    {
        this.Assignment_startDate = Assignment_startDate;
        this.Assignment_Deadline = Assignment_Deadline;
    }

<<<<<<< Updated upstream
    public Assignment(int id, String Title, int max_score, String date, String Assignment_startDate, String assignment_Deadline,String courseCode) {
        super(id, Title, max_score, date);
        this.Assignment_startDate = LocalDate.parse(Assignment_startDate);
        this.Assignment_Deadline = LocalDate.parse(assignment_Deadline);
        this.courseCode=courseCode;
=======
    public Assignment(int id, String Title, int max_score, String date, String Assignment_startDate, String assignment_Deadline) {
        super(id, Title, max_score, date);
        this.Assignment_startDate = LocalDate.parse(Assignment_startDate);
        this.Assignment_Deadline = LocalDate.parse(assignment_Deadline);
>>>>>>> Stashed changes
    }

    public void setAssignment_startDate(LocalDate assignment_startDate) {
        Assignment_startDate = assignment_startDate;
    }

    public LocalDate getAssignment_startDate() {
        return Assignment_startDate;
    }

<<<<<<< Updated upstream
    public void set_Assignment_deadline(LocalDate assignment_Deadline) {
        Assignment_Deadline = assignment_Deadline;
=======
    public void set_Assignment_deadline(String assignment_Deadline) {
        Assignment_Deadline = LocalDate.parse(assignment_Deadline);
>>>>>>> Stashed changes
    }

    public LocalDate getAssignment_Deadline() {
        return Assignment_Deadline;
    }
<<<<<<< Updated upstream
    public String toString()
    {
       return  getID()+","+getTitle()+","+getMax_score()+","+Assignment_startDate+","+Assignment_Deadline+","+courseCode;
    }
=======
    public void setMax_score(int max_score) {
        while (true) {
            System.out.println("Enter a grade for this assignment that doesn't exceed 20 marks ");
            if( max_score<= 20 ) {
                setMax_score(max_score);
                break;
            }
            else if (max_score > 20 ) {
                System.out.println("Invalid Grade Please try again ! ");
            }

        }
    }


>>>>>>> Stashed changes
}