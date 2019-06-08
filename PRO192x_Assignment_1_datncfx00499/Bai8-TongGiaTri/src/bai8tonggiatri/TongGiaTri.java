package bai8tonggiatri;

import java.util.ArrayList;
import java.util.Scanner;

public class TongGiaTri {

	private static Scanner scan;
	
	
	public static void main(String[] args) {
		System.out.println("Giá trị của mảng vừa nhập là: " + tongMang());
		
		
	}
	
	public static double tongMang() {
		ArrayList<Double> mangSoNguyen = new ArrayList<Double>();
		double result = 0;
		boolean running = true;
		System.out.println("Mời bạn nhập vào các số nguyên:");
		while (running) {
			scan = new Scanner(System.in);
			double newNumber = scan.nextDouble();
			mangSoNguyen.add(newNumber);
			if(newNumber == 0) {
				running = false;
			}
		}
		
		for(int i = 0; i < mangSoNguyen.size(); i++) {
			result += mangSoNguyen.get(i);
		}
		return result;
	}
}