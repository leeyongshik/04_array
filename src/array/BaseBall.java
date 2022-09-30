package array;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] com = new int[3];
      int[] user = new int[3];
      String yn;
      String str;
      int strike, ball;
      
      while(true) {
         System.out.print("게임을 실행하시겠습니까(Y/N) : ");
         yn = scan.next();
         
         if(yn.equals("Y") || yn.equals("y") || yn.equals("N") || yn.equals("n")) break;
      }//while
      System.out.println();
      
      if(yn.equals("Y") || yn.equals("y")) {
         System.out.println("게임을 시작합니다");
         
         //난수발생
         for(int i=0; i<com.length; i++) {
            com[i] = (int)(Math.random()*9 + 1);
            
            //중복체크
            for(int j=0; j<i; j++ ) {
               if(com[i] == com[j]) { 
                  i--;
                  break;
               }
            }//for j
         }//for i
         
         System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
         
         //사용자 입력
         while(true) {
            System.out.print("숫자 입력 : ");
            str = scan.next();
            
            for(int i=0; i<user.length; i++) {
               user[i] = str.charAt(i) - 48;
            }//for i
            //System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
            
            //비교
            strike = ball = 0;
            for(int i=0; i<com.length; i++) {
               for(int j=0; j<user.length; j++) {
                  if(com[i] == user[j]) {
                     if(i == j) strike++;
                     else ball++;
                  }
               }
            }//for i
            
            System.out.println(strike+"스트라이크 "+ball+"볼");
            
            if(strike == 3) break;
            
         }//while
         
      }//if
      
      System.out.println("프로그램을 종료합니다.");

   }

}

/*
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		String yn;
		String str;
		int strike=0, ball=0;
		
		while(true) {
			System.out.print("게임을 실행 하시겠습니까(Y/N) : ");
			yn = s.next();
			
			if(yn.equals("Y")||yn.equals("y")||yn.equals("N")||yn.equals("n")) break; // while 문 빠져나가는 조건
		}//while
		
		System.out.println();
		if(yn.equals("Y")||yn.equals("y")) {
			System.out.println("게임을 시작합니다.");
			
			//난수 발생
			for(int i=0; i<com.length;i++) {
				com[i] = r.nextInt(9)+1;
				for (int j=0; j < i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}//if
				}//for j
			}// for i
			
			//개인 확인용 
			for (int data : com) {
				System.out.print(data+ " ");
			}
			System.out.println();
			
			
			//사용자 입력
			while(true) {
				System.out.print("숫자 입력 : ");
				str = s.next();
				
				for (int i=0;i<user.length;i++) {
					user[i] = str.charAt(i) -48 ; // charAt(1) -> 첫번째 글자찾
				}//for i
				
				
				//비교
				for (int i=0; i<com.length; i++) {
					for (int j=0; j<user.length; j++) {
						if ( com[i]==user[j]) {
							if(i==j) strike++;
							else ball++;
						}
					}
				}
				
				System.out.println(strike + "스트라이크" + ball + "볼");
				if (strike == 3) break;
			}//while
			
			
			
			
		}//if
		else System.out.println("게임을 종료합니다.");
		
		
		System.out.println("게임을 종료합니다.");
		
		
		
		
		
		
	}

}
		*/
		/* 내가 실패한 코
		String a;
		while (true){
			
			do {
			System.out.print("게임을 실행 하시겠습니까(Y/N) : ");
			a = s.next();
			} while (!a.equals("Y") && !a.equals("y") && !a.equals("N") && !a.equals("n"));
			
			if (a.equals("N") || a.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (a.equals("Y") || a.equals("y")) System.out.println("게임을 시작합니다.");
			
			
			System.out.println();
			
			
			//중복 제외 3개 난수 생성
			for(int i=0; i<com.length;i++) {
				com[i] = r.nextInt(9)+1;
				for (int j=0; j < i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			
			//com 난수(개인 확인용)
			for (int data : com) {
				System.out.print(data+ " ");
			}
			
			
			System.out.println();
			System.out.print("숫자 입력 : ");
			
			for (int i = 0; i < user.length; i++) {
				int b = s.nextInt();
			}
			
		
		}
		*/


/*
야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
*/