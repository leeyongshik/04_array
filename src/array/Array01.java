package array;

public class Array01 {

	public static void main(String[] args) {
		
		int[] ar; //배열 선언 
		ar = new int[5];//생성 
		ar[0] = 25;
		ar[1] = 78;
		ar[2] = 30;
		ar[3] = 43;
		ar[4] = 52;
		
		System.out.println("배열명 ar = " + ar);
		System.out.println("배열 크기 = " + ar.length);
		System.out.println();
		
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}//for
		System.out.println();
		
		
		System.out.println("거꾸로 출력");
		for (int i = ar.length-1; i >= 0; i--) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}//for
		System.out.println();
		
		
		System.out.println("짝수 데이터만 출력");
		for (int i=0; i<ar.length; i++) {
			if(ar[i] % 2 ==0) System.out.println("ar[" + i + "] = " + ar[i]);
		}//for
		System.out.println();
		
		
		System.out.println("확장 for 문");
		//ar.length 라고 안써도 배열의 크기만큼 for 문이 반복한다.
		for ( int data : ar) {
			System.out.println(data);
			
			
		}
		
	}

}
