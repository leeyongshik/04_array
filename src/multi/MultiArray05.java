package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("인원수 : ");
        int cnt = s.nextInt();
        System.out.println();

        String[] name = new String[cnt];  //이름
        String[][] subject = new String[cnt][];  //과목
        int[][] jumsu = new int[cnt][]; //과목별 점수
        double[] avg = new double[cnt];  //평균
        String[] grade = new String[cnt];  //등급
        int[] rank = new int[cnt];  //등수

        //입력
        for(int i=0; i<cnt; i++){

            System.out.print("이름 입력 : ");
            name[i] = s.next();


            System.out.print("과목수 입력 : ");
            int subjectCnt = s.nextInt();
            
            
            //******가변 배열 중요 *******
            subject[i] = new String[subjectCnt];
            jumsu[i] = new int[subjectCnt+1];

            
            
            for(int j=0; j<subjectCnt; j++) {
                System.out.print("과목명 입력 : ");
                subject[i][j] = s.next();
            }

            for(int j=0; j<subjectCnt; j++) {
                System.out.print(subject[i][j]+" 점수 입력 : ");
                jumsu[i][j] = s.nextInt();
            }

            System.out.println("---------------------");

            for(int j=0; j<subjectCnt; j++) {
                jumsu[i][subjectCnt] += jumsu[i][j]; // 총점계산
            }

            avg[i] = (double)(jumsu[i][subjectCnt] / subjectCnt);

            if (avg[i] >= 90) grade[i] = "A";
            else if (avg[i] >= 80) grade[i] = "B";
            else if (avg[i] >= 70) grade[i] = "C";
            else if (avg[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }


        System.out.println();
        System.out.println();

        //출력
        for(int i=0; i<cnt; i++){
            System.out.print("이름\t");
            for(int j=0; j<subject[i].length; j++){
                System.out.print(subject[i][j]+"\t");
            }

            System.out.println("총점\t평균\t등급\t");

            System.out.print(name[i]+"\t");

            for(int j=0; j<jumsu[i].length; j++){
                System.out.print(jumsu[i][j]+"\t");
            }

            System.out.println(String.format("%.2f", avg[i])+"\t"+grade[i]);
            System.out.println();
            
        }
		
		
		

	}

}

/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름   국어  영어   과학    총점      평균
이기자   95   100      90        xxx      xx.xx
*/