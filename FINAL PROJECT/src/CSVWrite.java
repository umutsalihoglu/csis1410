import java.io.FileWriter;
import java.io.IOException;

public class CSVWrite {

	public void WriteData(String[][] employee) {
		String[][] newData = employee;
		
		try{
			FileWriter csvWriter = new FileWriter("C:\\Users\\sfups\\Desktop\\EmployeeData.csv",true);
			for (int i = 0 ; i < newData.length ; i++) {
				for(int j = 0 ; j < 9 ; j++) {
					if(j==8) {
						csvWriter.append(newData[i][j]);
					}else {
						csvWriter.append(newData[i][j]);
						csvWriter.append(",");
						/**
						 * I use , because when I write a data put , to end every word except last one.
						 */
					}
					csvWriter.append("\n");
				}	    
			}
			csvWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void WriteData(String[] employee) {
		String[] newData = employee;
		
		try{
			FileWriter csvWriter = new FileWriter("C:\\Users\\sfups\\Desktop\\EmployeeData.csv",true);
			for (int i = 0 ; i < newData.length ; i++) {
					if(i==8) {
						csvWriter.append(newData[i]);
					}else {
						csvWriter.append(newData[i]);
						csvWriter.append(",");
					}
						    
			}
			csvWriter.append("\n");	
			csvWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void WriteData2(String users[][]) {
		String[][] newData = users;
		
		try{
			FileWriter csvWriter = new FileWriter("C:\\Users\\sfups\\Desktop\\Users.csv",false);
			for (int i = 0 ; i < newData.length ; i++) {
				for(int j = 0 ; j < 2 ; j++) {
					if(j==1) {
						csvWriter.append(newData[i][j]);
					}else {
						csvWriter.append(newData[i][j]);
						csvWriter.append(",");
					}
					
				}	    
				csvWriter.append("\n");
			}
			csvWriter.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
