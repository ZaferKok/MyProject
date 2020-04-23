package hospitalCopy1;
public class HospitalRunner {

	private static Hospital hpt1 = new Hospital();
	
	public static void main(String[] args) {
		Doctor dct = new Doctor();
		String actualCaseFirst = "Allergies";
        String title2 = doctorTitle(actualCaseFirst);
        hpt1.setDoctor(findDoctor(title2));
        System.out.println("Doctor name: " + hpt1.getDoctor().getName());
        System.out.println("Doctor title: " + hpt1.getDoctor().getTitle());
        hpt1.setDoctor(dct);
        dct.setTitle("Veba");
        System.out.println("Second Doctor title : " + hpt1.getDoctor().getTitle());
        hpt1.setPatient(findPatient(actualCaseFirst));
        System.out.println("Patient name: " + hpt1.getPatient().getName());
        System.out.println("Patient id " + hpt1.getPatient().getPatientId());
        System.out.println("Patient actual case: " + hpt1.getPatient().getPatientCase().getActualCase());
        System.out.println("Patient situation emergency: " + hpt1.getPatient().getPatientCase().isEmergency());
    }
    // custom method
    public static String doctorTitle(String actualCase) {
        String result = "";
        if (actualCase.equals("Allergies")) {
            return result = hpt1.titles[0];
        } else if (actualCase.equals("Diabetes")) {
            return result = "Endocrinologists";
        } else if (actualCase.equals("Heart diseases")) {
            return result = "Cardiologist";
        } else if (actualCase.equals("Migraine")) {
            return result = "Generalist";
        } else if (actualCase.equals("Corona")) {
            return result = "Pediatrician";
        } else if (actualCase.equals("Allergies")) {
            return result = "Generalist";
        } else if (actualCase.equals("Headaches")) {
            return result = "Neurologist";
        } else {
            return result = "Wrong title";
        }
    }
    public static Doctor findDoctor(String actualCase) {
        Doctor doctor = new Doctor();
        for (int i = 0; i < hpt1.titles.length; i++) {
            if (hpt1.titles[i].equals(actualCase)) {
                doctor.setName(hpt1.doctorNames[i]);
                doctor.setTitle(actualCase);
            }
        }
        return doctor;
    }
    public static Case findPatientCase(String actualCase) {
        Case patientCase = new Case();
        switch (actualCase) {
        case "Allergies":
            patientCase.setActualCase(actualCase);
            patientCase.setEmergency(false);
            break;
        case "Diabetes":
            patientCase.setActualCase(actualCase);
            patientCase.setEmergency(false);
            break;
        case "Heart diseases":
            patientCase.setActualCase(actualCase);
            patientCase.setEmergency(true);
            break;
        case "Migraine":
            patientCase.setActualCase(actualCase);
            patientCase.setEmergency(true);
            break;
        case "Corona":
            patientCase.setEmergency(true);
            patientCase.setActualCase(actualCase);
            break;
        case "Cold":
            patientCase.setActualCase(actualCase);
            patientCase.setEmergency(false);
            break;
        case "Headaches":
            patientCase.setActualCase(actualCase);
            patientCase.setEmergency(true);
            break;
        default:
        }
        return patientCase;
    }
    
    public static Patient findPatient(String fare) {
        Patient patient = new Patient();
        for (int i = 0; i < hpt1.titles.length; i++) {
            if (hpt1.cases[i].equals(fare)) {
                patient.setName(hpt1.patientNames[i]);
                patient.setPatientId(hpt1.patientIds[i]);
                patient.setPatientCase(findPatientCase(fare));
              
            }
        }
        return patient;
    }

}
//public static Case findPatientCase(String actualCase){
//    Case patientCase = new Case();
//    switch (actualCase){
//        case "Allergies":
//        case "Diabetes":
//        case "Cold":
//            patientCase.setActualCase(actualCase);
//            patientCase.setEmergency(false);
//            break;
//        case "Heart diseases":
//        case "Migraine":
//        case "Corona":
//        case "Headaches":
//            patientCase.setActualCase(actualCase);
//            patientCase.setEmergency(true);
//            break;
//        default:
//            System.out.println("Not a valid case");
//    }
//    return patientCase;
//}
