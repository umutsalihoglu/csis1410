import java.io.*;

public class CSVRead {

	public String[][] readCSV() {
		
	String[][] employee = new String[16][13];
	
	File files = new File("C:\\Users\\sfups\\Desktop\\EmployeeData.csv");
	String line = "";  
	String splitBy = ",";
	int row=0;
	
	try {
		BufferedReader br = new BufferedReader(new FileReader(files));  
		while ((line = br.readLine()) != null){  
			String[] emp = line.split(splitBy);
			for(int i = 0 ; i < emp.length ; i++) {
					employee[row][i]=emp[i];
			}
			row++;
			
		}
		br.close();
		
		return employee;
		}catch(IOException e) {
		e.printStackTrace();  
	}
	return null;
		
	}

}
	


