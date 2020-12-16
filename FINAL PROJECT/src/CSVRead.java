import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVRead {
	
	public String[][] readCSV() {
		
		File files = new File("C:\\Users\\sfups\\Desktop\\EmployeeData.csv");
		String line = "";  
		String splitBy = ",";
		int row=0;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(files)); 
			BufferedReader br2 = new BufferedReader(new FileReader(files)); 
			int lenght=0;
			/**
			 * I read it with null because I want to learn its length.  
			 */
			while ((line = br.readLine()) != null){  
				lenght++;
			}
			String[][] users = new String[lenght][9];
			br.close();
			while ((line = br2.readLine()) != null){  
				String[] emp = line.split(splitBy);
				for(int i = 0 ; i < emp.length ; i++) {
					users[row][i]=emp[i];
				}
				row++;
				
			}
			br2.close();
			
			return users;
			}catch(IOException e) {
			e.printStackTrace();  
		}
		return null;
		
	}
	public String[][] readCSV2(){
		
		
		File files = new File("C:\\Users\\sfups\\Desktop\\Users.csv");
		String line = "";  
		String splitBy = ",";
		int row=0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(files)); 
			BufferedReader br2 = new BufferedReader(new FileReader(files)); 
			int lenght=0;
			while ((line = br.readLine()) != null){  
				lenght++;
			}
			String[][] users = new String[lenght][2];
			br.close();
			while ((line = br2.readLine()) != null){  
				String[] emp = line.split(splitBy);
				for(int i = 0 ; i < emp.length ; i++) {
					users[row][i]=emp[i];
				}
				row++;
				
			}
			br2.close();
			
			return users;
			}catch(IOException e) {
			e.printStackTrace();  
		}
		return null;
			
	}
}
