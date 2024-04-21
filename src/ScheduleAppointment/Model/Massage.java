package ScheduleAppointment.Model;

public class Massage implements AddOnService {
    Massage_Type massageType;
    int duration;

    public Massage(int duration, Massage_Type massageType){
        this.duration = duration;
        this.massageType= massageType;
    }
    public void service(){
        System.out.println("Service register for "+massageType+" massage for"+duration+" minutes");
    }

}
