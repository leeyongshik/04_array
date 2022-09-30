package array;

import java.util.Random;

public class Array05 {

	public static void main(String[] args) {
		Random r = new Random();
		
		char[] ar = new char[50];
		int[] ar2 = new int[26];
		
		for (int i=0; i<ar.length;i++) {
			ar[i] = (char)(r.nextInt(26)+65);
			System.out.print(ar[i]+" ");
			if (i%10 == 0) System.out.println();
		}//for
		
		for (int i =0; i < ar.length; i++) {
			for (int j = 0 ; j<ar2.length; j++) {
				if(ar[i] == j+65) ar2[j]++;
			}//for j
		}//for i
		
		for(int i=0; i<ar2.length;i++) {
			System.out.println((char)(i+65) + " : "+ ar2[i]);
		}
		
		
		
		
		
		
		
		
		/*
		char[] ar; //배열 선언 
		ar = new char[50];//생성 
		
		int[] ar2; //배열 선언 
		ar2 = new int[26];//생성
		
		
		
		for(int i=0; i <= 50 ;i++) {
			char a = (char)(r.nextInt(26) + 65);
			ar[i]= a;
			
			if (i % 10 == 0) System.out.println();
			System.out.print(a+ " ");
			}
		
		for(char b ='A'; b <= 'Z'; b++) {
			for(int i=0;i<=25;i++) {
			ar2[i] = b;
			System.out.println(b);
			}
		}
		*/	
		
		
	}

}

/*
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
*/