package multi;

public class MultiArray01 {

	public static void main(String[] args) {
		
		//다차원 배열
		int [][] ar = new int[3][2];
		/*
		ar[0][0] = 10;
		ar[0][1] = 20;
		
		ar[1][0] = 30;
		ar[1][1] = 40;
		
		ar[2][0] = 50;
		ar[2][1] = 60;
		*/
		
		int result = 0;
		for (int i = 0; i < ar.length; i++) { //
			for (int j = 0; j < ar[i].length; j++) { // 
				result += 10;
				ar[i][j] = result;
				System.out.println("ar["+i+"]["+j+"] = " + ar[i][j]);
			}//for j
			System.out.println();
		}//for i
		
		

	}

}
