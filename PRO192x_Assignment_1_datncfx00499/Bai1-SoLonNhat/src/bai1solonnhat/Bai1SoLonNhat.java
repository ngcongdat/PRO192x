package bai1solonnhat;

import java.util.Scanner;

public class Bai1SoLonNhat {

	private static Scanner scan;

	public static void main(String[] args) {	
		soThuc();
	}
	
	public static void soThuc() {
		double result;
		scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số thứ nhất: ");
		double numOne = scan.nextDouble();
		System.out.println("Mời bạn nhập vào số thứ hai: ");
		double numTwo = scan.nextDouble();
		System.out.println("Mời bạn nhập vào số thứ ba: ");
		double numThree = scan.nextDouble();
		result = Math.max(numOne, numTwo);
		double max = Math.max(result, numThree);
		System.out.println("Số lớn nhất của ba số là: " + "\n" + max);
	}

}
