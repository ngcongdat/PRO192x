package bai6dodaichuoi;

import java.util.Scanner;

public class DoDaiChuoi {

	private static Scanner scan;
	
	public static void main(String[] args) {
		System.out.println("Vui lòng nhập vào một chuỗi:");
		scan = new Scanner(System.in);
		String doDaiChuoi = scan.nextLine();
		
		System.out.println("Độ dài chuỗi bạn nhập là: " + doDaiChuoi.length());
	}

}
