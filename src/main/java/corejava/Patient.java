package corejava;

public class Patient implements Comparable<Patient> {
	private int patientId;
	private String patientName;
	private double patientFee;

	public Patient(int patientId, String patientName, double patientFee) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientFee = patientFee;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public double getPatientFee() {
		return patientFee;
	}

	public void setPatientFee(double patientFee) {
		this.patientFee = patientFee;
	}

	public int compareTo(Patient p) {
		if(patientFee == p.patientFee)
		return 0;
		else if(patientFee > p.patientFee)

			return 1;
		else

			return -1;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientFee=" + patientFee + "]";
	}

	
	
	
}
