import java.io.*;
import java.util.*;
import java.lang.Math;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		
		while (j<3){
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Type in a sentence and press Enter: ");
		String sen = kbReader.nextLine();
		sen = sen.toUpperCase();
		String harmless = "bn";
		if(sen.equals("EXIT")){
			break;
		}
		else{
		sen = sen + harmless;
		String sp[] = sen.split("SA|S\\s+A");
		
		System.out.println("There are " + (sp.length-1) + " occurences.");
		}

		
		
		}
	}

}
