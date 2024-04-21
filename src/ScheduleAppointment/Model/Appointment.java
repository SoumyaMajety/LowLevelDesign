package ScheduleAppointment.Model;


import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class Appointment {
    static int id;
    Patient patient;
    Doctor doctor;

    LocalDateTime time;
    Location location;
    AddOnService addOnService;

    public AddOnService getAddOnService() {
        return addOnService;
    }

    public void setAddOnService(AddOnService addOnService) {
        this.addOnService = addOnService;
    }

    public static AppointmentHelper getInstance() {

        return new AppointmentHelper();
    }

    public Appointment(AppointmentHelper ah) {
        id++;
        this.patient = ah.patient;
        this.doctor = ah.doctor;
        this.time = ah.time;
        this.location = ah.location;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public static class AppointmentHelper {

        Patient patient;
        Doctor doctor;

        LocalDateTime time;
        Location location;
        AddOnService addOnService;

        public AddOnService getAddOnService() {
            return addOnService;
        }

        public AppointmentHelper setAddOnService(AddOnService addOnService) {
            this.addOnService = addOnService;
            return this;
        }

        public Patient getPatient() {
            return patient;
        }

        public AppointmentHelper setPatient(Patient patient) {
            this.patient = patient;
            return this;
        }

        public Doctor getDoctor() {
            return doctor;
        }

        public AppointmentHelper setDoctor(Doctor doctor) {
            this.doctor = doctor;
            return this;
        }

        public LocalDateTime getTime() {
            return time;
        }

        public AppointmentHelper setTime(LocalDateTime time) {
            this.time = time;
            return this;
        }

        public Location getLocation() {
            return location;
        }

        public AppointmentHelper setLocation(Location location) {
            this.location = location;
            return this;
        }

        public void validate() {

            if (LocalDateTime.now().isBefore(time)) {
                throw new IllegalArgumentException("Appointment time should not be in past");
            }

            if (addOnService == null) {
                throw new IllegalArgumentException("Please select atleast one Service");
            }
        }

        public Appointment build() {
            validate();
            return new Appointment(this);
        }
    }
}
