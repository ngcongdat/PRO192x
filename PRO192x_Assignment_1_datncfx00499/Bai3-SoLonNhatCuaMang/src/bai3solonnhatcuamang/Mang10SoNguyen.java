package bai3solonnhatcuamang;

import java.util.Scanner;

public class Mang10SoNguyen {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		System.out.println ("Mời bạn nhập vào 10 số nguyên bất kỳ:");
		int[] mangSoNguyen = new int[10];
		NhapMang(mangSoNguyen);
		System.out.println ("Các số bạn vừa nhập là: ");
		XuatMang(mangSoNguyen);
		System.out.println();
		System.out.println("Bạn có muốn tìm giá trị lớn nhất không? Y / N?");
		TimSoLon(mangSoNguyen);
	}
	
	// Nhập mảng số nguyên
	public static void NhapMang(int mangSoNguyen[]) {
		scan = new Scanner(System.in);
		for (int i = 0; i < mangSoNguyen.length; i++) {
			mangSoNguyen[i] = scan.nextInt();
		}
	}
	
	
	// Xuất mảng số nguyên
	public static void XuatMang(int mangSoNguyen[]) {
		scan = new Scanner (System.in);
		for (int i = 0; i < mangSoNguyen.length; i++) {
			System.out.print(mangSoNguyen[i] + "\t");
		}
	}
	
	// Tìm giá trị lớn nhất trong mảng
	public static void GiaTriLonNhat(int mangSoNguyen[]) {
		int max = mangSoNguyen[0];
		scan = new Scanner(System.in);
		for (int i = 1; i < mangSoNguyen.length; i++) {
			if(mangSoNguyen[i] > max) {
				max = mangSoNguyen[i];
			}
		}
		System.out.println ("Giá trị lớn nhất trong mảng là: " + max);
	}
	
	// Kiểm tra hành vi người dùng
	public static void TimSoLon (int mangSoNguyen[]) {
		scan = new Scanner(System.in);
		String timSoLonNhat = scan.nextLine();
		switch(timSoLonNhat) {
		case "y":
		case "Y": GiaTriLonNhat(mangSoNguyen); break;
		case "n":
		case "N": System.out.println("Chào tạm biệt!!!"); break;
		default: {
			System.out.println("Bạn chỉ được nhập câu trả lời là Y hoặc N. Vui lòng thử lại!");
			TimSoLon(mangSoNguyen);
		}
		break;
		}
	}
}
