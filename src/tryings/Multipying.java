package tryings;

public class Multipying {

	public static void main(String[] args) {
		System.out.println("Multiplication Table");
        System.out.println("_________________________");
        for(int i=1;i<10;i++) {
            System.out.print(i+"  |");
            for(int j=1;j<10;j++) {
                
                System.out.print(i*j+" ");
            }
            System.out.println();
        }


	}

}
