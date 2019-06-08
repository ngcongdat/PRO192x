package bai4daysodaonguoc;

import java.util.Scanner;

public class DaySoDaoNguoc {

	private static Scanner scan;
	
	public static void main(String[] args) {
		System.out.println ("Mời bạn nhập vào 10 số nguyên bất kỳ:");
		int[] mangSoNguyen = new int[10];
		NhapMang(mangSoNguyen);
		System.out.println("Mảng của bạn đảo ngược thành: ");
		MangDaoNguoc(mangSoNguyen);

	}

	// Nhập mảng số nguyên
	public static void NhapMang(int mangSoNguyen[]) {
		scan = new Scanner(System.in);
		for (int i = 0; i < mangSoNguyen.length; i++) {
			mangSoNguyen[i] = scan.nextInt();
		}
	}
	
	// Đảo ngược mảng đã nhập
	public static void MangDaoNguoc(int mangSoNguyen[]) {
		scan = new Scanner(System.in);
		for (int i = 9; i >= 0; i--) {
			System.out.print(mangSoNguyen[i] + "\t");
		}
	}
}
