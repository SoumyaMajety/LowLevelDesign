package ScheduleAppointment.Model;

public class ElectricSimulationTheraphy implements AddOnService{
    int duration;

    public ElectricSimulationTheraphy(int duration) {
        this.duration = duration;
    }

    @Override
    public void service() {
        System.out.println("Service registed for Electric Simulation Therapy for "+duration+" minutes");

    }
}
