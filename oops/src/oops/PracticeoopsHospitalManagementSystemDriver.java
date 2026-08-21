package oops;

public class PracticeoopsHospitalManagementSystemDriver {

    public static void main(String[] args) {

       
        PracticeoopsHospitalManagementSystem hospital =
                new PracticeoopsHospitalManagementSystem();

        System.out.println("Doctor Details ");
        System.out.println("Hospital Name : " + hospital.HospitalName);
        System.out.println("GST Number    : " + hospital.HospitalGstNo);
        hospital.allCompleted();

        System.out.println();

        // Patient Object
        Patient patient = new Patient();

        System.out.println("Patient Details ");
        System.out.println("Patient Name    : " + patient.patientName);
        System.out.println("Patient Address : " + patient.patientAddress);
        System.out.println("Room Number     : " + patient.roomdNo);
        patient.allCompleted();

        System.out.println();

        // Doctor Object
        Doctor doctor = new Doctor();

        System.out.println("Doctor Details ");
        System.out.println("Doctor Name     : " + doctor.DoctorName);
        System.out.println("Mobile Number   : " + doctor.DoctoreMobileNo);
        System.out.println("Status          : " + doctor.status);
        doctor.allPassed();

        System.out.println();

        // Appointment Object
        Appointment appointment = new Appointment();

        System.out.println(" Appointment Details ");
        System.out.println("Appointment Status : " + appointment.appointmentStatus);
        System.out.println("Payment Status     : " + appointment.painStatus);
        System.out.println("Patient Name       : " + appointment.patientName);
        appointment.allCompleted();
    }

}
