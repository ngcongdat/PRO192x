package pro192xa4.business;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import pro192xa4.entity.EDegree;
import pro192xa4.entity.EPosition;
import pro192xa4.entity.Employee;
import pro192xa4.entity.Staff;
import pro192xa4.entity.Teacher;

public class SerializeFile {
	private static String fileName = "data.txt";
	static File file = new File(fileName);
	// Save data employee file
	public static boolean saveFile(ArrayList<Employee> listE) {

		try {
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for (Employee e : listE) {
				if (e instanceof Staff) {
					String line = "Staff" + ", " + e.toString();
					bw.write(line);
				}
				if (e instanceof Teacher) {
					String line = "Teacher" + ", " + e.toString();
					bw.write(line);
					
				}
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		}
		catch (FileNotFoundException ex) {
			System.err.println("Can't save data to file :" + fileName);
		}
		catch (IOException ex) {
			System.err.println("Can't save data to file :" + fileName);
		}
		catch (Exception ex) {
			System.err.println("Can't save data to file :" + fileName);
		}
		return false;
	}
	
	// Read data employee file
	public static ArrayList<Employee> readFile() {
		ArrayList<Employee> listE = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader irs = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(irs);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(", ");
				if (arr.length == 8) {
					switch (arr[0]) {
					case "Staff":
						Staff s = new Staff();
						s.setFullName(arr[1]);
						s.setDepartment(arr[2]);
						s.setPosition(EPosition.valueOf(arr[3]));
						s.setSalaryRatio(Float.parseFloat(arr[4]));
						s.setAllowance(Float.parseFloat(arr[5]));
						s.setNoOfWorkingDay(Float.parseFloat(arr[6]));
						listE.add(s);
						break;
					case "Teacher":
						Teacher t = new Teacher();
						t.setFullName(arr[1]);
						t.setFaculty(arr[2]);
						t.setDegree(EDegree.valueOf(arr[3]));
						t.setSalaryRatio(Float.parseFloat(arr[4]));
						t.setAllowance(Float.parseFloat(arr[5]));
						t.setTeachingHours(Integer.parseInt(arr[6]));
						listE.add(t);
						break;
					}
				}
				else {
					System.err.println("Error data " + fileName + ". Please check again!");
				}
				line = br.readLine();
			}
			br.close();
			irs.close();
			fis.close();
		}
		catch (FileNotFoundException ex) {
			System.err.println("*****Load data: " + fileName + " file not found.");
		}
		catch (IOException ex) {
			System.err.println("*****Load data: " + fileName + " file not found.");
		}
		catch (Exception ex) {
			System.err.println("*****Load data: " + fileName + " file not found.");
		}
		return listE;
	}

}