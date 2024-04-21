package ScheduleAppointment.Model;

public class Doctor extends Person{
    public Specialisation getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialisation specialization) {
        this.specialization = specialization;
    }

    Specialisation specialization;
    public Doctor(int id, String name,Specialisation specialisation){
        super(id,name);
        this.specialization = specialisation;
    }
}
