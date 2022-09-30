package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		int size = scan.nextInt();
		
		int[] ar; //배열 선언 
		ar = new int[size];//생성 
		
		int sum = 0;
		int max;
		int min;
		//max = min = ar[0]; 사용 가
		
		for(int i=0; i < size;i++) {
			System.out.print("ar["+ i + "] 입력  : ");
			ar[i] = scan.nextInt();
			sum+=ar[i];	
		}
		
		max = min = ar[0];
		for(int j=1; j<size;j++) {
			if (ar[j] > max) max = ar[j];
			if (ar[j] < min) min = ar[j];
		}
		
		for(int data :ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);

	}

}
/*

*/