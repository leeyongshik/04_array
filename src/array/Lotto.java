package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		
		int[] lotto = new int[6];
		
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		
		int money;
		
		
		System.out.print("현금 입력 : ");
		money = s.nextInt();
		System.out.println();
		

		for (int k=1; k <= money/1000; k++) {
				
			for(int i=0; i<lotto.length;i++) {
				lotto[i] = r.nextInt(45)+1;
				
				
				//중복 제거
				for (int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					} // if
				}// for j
			}// for i
			
			Arrays.sort(lotto);// 정렬 - 오름차순
			
			for( int i : lotto) {
			System.out.print(String.format("%5d", i)); // %-5d는 왼쪽 정렬
			}
			
			System.out.println();
			if(k % 5 == 0) System.out.println();
		}//for k

	}

}
/*
[문제] 로또
- 돈을 입력 받아서 난수가 자동으로 발생하는 프로그램 

[실행결과]
현금 입력 : 11500

16 19 20 28 33 42 
1 3 10 13 17 29 
1 3 21 22 30 43 
5 17 23 24 31 37 
5 15 26 30 37 44 

3 16 24 27 35 43 
2 7 9 22 41 42 
*/