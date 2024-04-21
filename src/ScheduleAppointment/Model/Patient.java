package ScheduleAppointment.Model;

public class Patient extends Person{

    String issue;

    public Patient(int id, String name,String issue){
        super(id,name);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
