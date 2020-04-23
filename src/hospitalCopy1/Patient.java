package hospitalCopy1;
public class Patient {

	private String name;
	private int patientId;
	private Case patientCase;

	public String 	getName			() 					{return name;}
	public void 	setName(String name) 				{this.name = name;}
	public int 		getPatientId	() 					{return patientId;}
	public void 	setPatientId(int patientId) 		{this.patientId = patientId;}
	public  Case	getPatientCase	() 					{return patientCase;}
	public void 	setPatientCase(Case patientCase) 	{this.patientCase = patientCase;}

}
