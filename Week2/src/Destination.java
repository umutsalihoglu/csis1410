
import java.util.*;

public class Destination {

	public static void main(String[] args) {
     
		ArrayList<String> Routation = new ArrayList<String>();
		String temp=null;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Destination: ");
			temp=input.nextLine();
			if(temp.equals("Done") || temp.equals("done")) {
				
			}else {
				Routation.add(temp);
			}
			if(temp.equals("done") || temp.equals("Done")) {
				System.out.print("Itinerary: ");
				for(int i = 0 ; i < Routation.size();i++) {
					if(i == Routation.size()-1) {
						System.out.print(Routation.get(i));
					}else {
						System.out.print(Routation.get(i)+" to ");
					}
				}
				break;
			}
			temp=null;
		}
		input.close();
    }
}
