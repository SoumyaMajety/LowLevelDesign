package ScheduleAppointment.Model;

public class AcousticWaveTheraphy implements AddOnService{

    int duration;
    public AcousticWaveTheraphy(int duration){
        this.duration = duration;
    }

    @Override
    public void service() {
        System.out.println("Service registed for Wave Therapy for "+duration+" minutes");

    }
}
