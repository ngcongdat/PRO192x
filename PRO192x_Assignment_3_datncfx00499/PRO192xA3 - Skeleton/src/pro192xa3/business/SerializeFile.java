package pro192xa3.business;

import java.io.*;
import java.util.ArrayList;

import pro192xa3.entity.Employee;

public class SerializeFile {

	static File file = new File("data.dat");
	public static boolean saveFile(ArrayList<Employee> listE) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(listE);
			oos.close();
			fos.close();
			return true;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<Employee> readFile() {
		ArrayList<Employee> listE = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			listE = (ArrayList<Employee>) data;
			ois.close();
			fis.close();
		}
		catch(Exception ex) {
			
		}
		return listE;
	}
}
