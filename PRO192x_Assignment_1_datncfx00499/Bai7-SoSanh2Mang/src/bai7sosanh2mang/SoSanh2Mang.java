package bai7sosanh2mang;

import java.util.Scanner;

public class SoSanh2Mang {

	private static Scanner scan;
	
	public static void main(String[] args) {
		int[] mangMot = new int[5];
		int[] mangHai = new int[5];
		MangMot(mangMot);
		MangHai(mangHai);
		SoSanhKyTu(mangMot, mangHai);
	}
	
	public static void MangMot(int mangMot[]) {
		System.out.println("Vui lòng nhập mảng số thứ nhất gồm 5 phần tử");
		scan = new Scanner(System.in);
		for(int i = 0; i < mangMot.length; i++) {
			mangMot[i] = scan.nextInt();
		}
	}
	
	public static void MangHai(int mangHai[]) {
		System.out.println("Vui lòng nhập mảng số thứ hai gồm 5 phần tử");
		scan = new Scanner(System.in);
		for(int i = 0; i < mangHai.length; i++) {
			mangHai[i] = scan.nextInt();
		}
	}
	
	public static void SoSanhKyTu(int mangMot[], int mangHai[]) {
		String sTT = "";
		scan = new Scanner(System.in);
		int count = 0;
		for(int i = 0; i < mangMot.length && i < mangHai.length; i++) {
			if(mangMot[i] != mangHai[i]) {
				sTT = sTT + (count>0?", ":"") + i;
				count++;
			}
		}
		if (count != 0) {
			
			System.out.println("Hai mảng khác nhau ở ký thứ thứ: " + sTT);
		}
		else {
			System.out.println("Hai số giống nhau y xì lì");
		}
	}
}
