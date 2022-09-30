package multi;

public class MultiArray04 {

	public static void main(String[] args) {
		//가변길이
		int[][] ar = new int[3][];
		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[4];
		
		//입력 
		int result=0;
		for (int i=0 ; i <ar.length;i++) {
			for(int j=0; j < ar[i].length; j++) {
				result +=10;
				ar[i][j] = result;
			}//for j
		}//for i
		
		//출력
		for (int i = 0; i<ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("ar["+i+"]["+j+"] = " + ar[i][j]);
			}//for j
			System.out.println();
		}//for i
		
	}

}
