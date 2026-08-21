package oops9Interface;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital= new AppoloHospital();
		 hospital.doctorNumbers();
		 hospital.nursesNumber();
         hospital.roomsNo();
         Hospital h2 = new  MainBranchAppoloHospital ();
         h2.doctorNumbers();
         h2.nursesNumber();
         h2.nursesNumber();
         
         
	}

}
