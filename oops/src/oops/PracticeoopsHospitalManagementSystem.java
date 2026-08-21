package oops;

public class PracticeoopsHospitalManagementSystem {
	String HospitalName = "Appolo";
	int HospitalGstNo = 87678;
    public void allCompleted() {
    	System.out.println("your are ready to leave the hospital");
    }
}
class Patient extends PracticeoopsHospitalManagementSystem{
	String patientName = "Ajit";
	String patientAddress = "BTM Layout";
	String patient = "";
	String roomdNo = "7678";
	public void allCompleted() {
		System.out.println("patient is now fit to leave ");
	}
}

class Doctor extends PracticeoopsHospitalManagementSystem{
	String DoctorName = "Sumit";
	int DoctoreMobileNo = 7768764;
	String status = "active";
	public void allPassed() {
		System.out.println("available ");
	}
	
}

class Appointment extends Patient{
	String appointmentStatus = "persent";
	String painStatus = "paid";
}

