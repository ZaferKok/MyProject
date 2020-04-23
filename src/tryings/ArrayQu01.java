package tryings;

public class ArrayQu01 {

	public static void main(String[] args) {
		int[] a = {3, 5, 7, 8};
        int[] b = {5, 4, 6, 8};
        int v = 9;
        for(int i : a){
            for(int j : b){
                if(i + j == v){       // 4 PLUS 5 is equal to the target
                    System.out.println(i + " PLUS " + j + " is equal to the target value");
                }
            }
        
        }

	}

}
