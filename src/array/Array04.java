package array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		
		boolean[] ar; //배열 선언 
		ar = new boolean[5];//생성 
		
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("주차장 관리 프로그램");
			System.out.println("**************");
			System.out.println("   1. 입차");
			System.out.println("   2. 출차");
			System.out.println("   3. 리스트");
			System.out.println("   4. 종료");
			System.out.println("**************");
			System.out.print("  메뉴 : ");
			int menu = s.nextInt();
			System.out.println();
			
			if(menu<1 || menu>4) {
				System.out.println("1~4번까지만 입력하세요.");
				System.out.println();
				continue;
			}
			
				if (menu == 3) 
					for (int i=0; i < ar.length; i++){
						System.out.println((i+1)+"위치 : "+ar[i]);
					}
				
				else if (menu == 1) {
					System.out.print("위치 입력 : ");
					int in = s.nextInt();
					if(ar[in-1] == true) System.out.println("이미 주차 되어있습니다.");
					else System.out.println(in + "위치에 입차");
					ar[in-1]=true;
				}
				
				else if (menu == 2) {
					System.out.print("위치 입력 : ");
					int out = s.nextInt();
					if(ar[out-1] == false) System.out.println("주차되어 있지 않습니다.");
					else System.out.println(out + "위치에 출차");
					ar[out-1]=false;
				}
				
				else if (menu == 4) {
					System.out.println("프로그램 종료합니다.");break;
				}
				
				else System.out.println("잘못입력하셨습니다.");
				System.out.println();
				System.out.println();
		}
		
		
	}

}
/*
주차장 관리 프로그램
**************
   1. 입차      
   2. 출차      
   3. 리스트 
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/