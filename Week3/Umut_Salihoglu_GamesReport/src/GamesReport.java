import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GamesReport {


	public static void addGamer(File files) {
		String[] newGamer = new String[12];
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		System.out.print("Name: ");
		newGamer[i]=sc.next();
		i++;
		for(int j = 1 ; j < 11 ; j++) {
			System.out.print(j + ".Game Point: ");
			newGamer[j]=sc.next();
		}
		sc.close();
	
		int tempTotal=0;
		for(int j = 1 ; j < newGamer.length-1 ; j++) {
			tempTotal += Integer.parseInt(newGamer[j]);
			if(j==10) {
				newGamer[j+1] = Integer.toString(tempTotal);
			}
		}
		
		
		try {
			
			FileWriter fileWriter = new FileWriter(files,true);
			
			for(int j = 0 ; j < newGamer.length ; j++) {
				
				if(j==newGamer.length-1) {
					fileWriter.write(newGamer[j]);
					fileWriter.write("\n");
				}else {
					fileWriter.write(newGamer[j] + ",");
				}
				
			}
			fileWriter.close();
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
		
		
	}
	public static void gamerReport(File files) throws IOException{
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Game Report");
		System.out.println("---------------------------------------------------------------------------------------------");
		
		String[] header = new String[12];
		header[0] = "Gamer";
		for(int i = 1 ; i < header.length-1 ; i++) {
			header[i] = Integer.toString(i);
		}
		header[11] = "Total";
	
		
		
		String line = "";  
		String splitBy = ",";  
		int lenght = 0;
		int row = 0;
		try{  
		 
		BufferedReader br = new BufferedReader(new FileReader(files));  
		while ((line = br.readLine()) != null){  
		lenght++;
		} 
		br.close();
		BufferedReader br2 = new BufferedReader(new FileReader(files));  
		String[][] Games = new String[lenght][12];
		
		while ((line = br2.readLine()) != null){  
			String[] games = line.split(splitBy);
			for(int i = 0 ; i < games.length ; i++) {
					Games[row][i] = games[i];
			}
			row++;
			
		}
		br2.close();
		int tempTotal = 0;
		for(int i = 0 ; i < Games.length ; i++) {
			for(int j = 1 ; j < 11 ; j++) {
				tempTotal += Integer.parseInt(Games[i][j]);
				if(j==10) {
					Games[i][j+1] = Integer.toString(tempTotal);
					tempTotal=0;
					
				}
			}
			
		}
		for(int i = 0 ; i < header.length ; i++) {
			System.out.print(header[i] + "\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------");
		for(int i = 0 ; i < Games.length ; i++) {
			for(int j = 0 ; j < 12 ; j++) {
				System.out.print(Games[i][j] + "\t");
				}
			System.out.println();
			}
			
		int biggestScore = 0 ;
		String bestGamer = null;
		for(int i = 0 ; i < Games.length ; i++) {
			if(Integer.parseInt(Games[i][11]) > biggestScore) {
				biggestScore = Integer.parseInt(Games[i][11]);
				bestGamer = Games[i][0];
			}
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("# of Gamer: " + Games.length );
		System.out.println("TOP GAMER: " + bestGamer );
		System.out.println("BEST SCORE: " + biggestScore );
		System.out.println("---------------------------------------------------------------------------------------------");
		
		}catch (IOException e){  
		e.printStackTrace();  
		}  	
		
	}
	public static void main(String[] args) throws IOException {
	
		File files = new File("C:\\Users\\sfups\\Desktop\\GameScores.csv");
		Scanner sc = new Scanner(System.in);
		
		gamerReport(files);
		
		System.out.print("Do You Want to Add New Gamer? (Type 'Y' or 'N'): ");
		if(sc.next().equals("Y")){
			addGamer(files);
			gamerReport(files);
		}else{
			System.out.print("Program Finished..");
			sc.close();
		}
	
	}

}
