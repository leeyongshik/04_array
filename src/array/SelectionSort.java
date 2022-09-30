package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {35, 48, 25, 72, 50};
		
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		//Arrays.sort(ar); 방법 1
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) { //오름차순
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}//if
			}//for j
		}// for i
		
		System.out.print("정렬 후 : ");
		for(int data : ar) {
			System.out.print(data + " ");
		}
	}

}
