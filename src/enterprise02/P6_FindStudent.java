package enterprise02;

public class P6_FindStudent {

    private int findNum;
    private String  nameList[] = {"Samet Tur","Badem Sur","Serkan Tas"};
    private String classroom [] = {"1A","2B","3C"};
    private int studentNum [] = {1001,2002,3003};
  
    public P6_FindStudent() {
    	
    }
    
//    public P6_FindStudent(int findNum) {
//    	this.findNum = findNum;
//    }
    
    public void findStudent(int Sn) {
    	
    	for (int i=0; i<classroom.length; i++) {
    		if(Sn==studentNum[i]) {
    			System.out.println("Name of the student =======> " + nameList[i]);
                System.out.println("Classroom of the student ==> " + classroom[i]);
                System.out.println("Number of the student =====> " + studentNum[i]);
    		}
    	}
    } 
}
