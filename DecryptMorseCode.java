import java.util.Scanner;
import java.util.ArrayList;

public class DecryptMorseCode {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String kodeMorse= xx.nextLine();
		String [] kodePerHuruf= kodeMorse.split(" ");
		ArrayList <String> dekriptKode= new ArrayList<>();

		for(String a : kodePerHuruf) {
			dekriptKode.add(a);
		}
		
		dekriptKode.forEach(n ->{
			switch (n) {
				case ".-":
					System.out.print("A");
					break;
				case "-...":
					System.out.print("B");
					break;
				case "-.-.":
					System.out.print("C");
					break;
				case "-..":
					System.out.print("D");
					break;
				case ".":
					System.out.print("E");
					break;
				case "..-.":
					System.out.print("F");
					break;
				case "--.":
					System.out.print("G");
					break;
				case "....":
					System.out.print("H");
					break; 
				case "..":
					System.out.print("I");
					break;
				case ".---":
					System.out.print("J");
					break;
				case "-.-":
					System.out.print("K");
					break;
				case ".-..":
					System.out.print("L");
					break;
				case "--":
					System.out.print("M");
					break;
				case "-.":
					System.out.print("N");
					break;
				case "---":
					System.out.print("O");
					break;
				case ".--.":
					System.out.print("P");
					break;
				case "--.-":
					System.out.print("Q");
					break;
				case ".-.":
					System.out.print("R");
					break;
				case "...":
					System.out.print("S");
					break;
				case "-":
					System.out.print("T");
					break;
				case "..-":
					System.out.print("U");
					break;
				case "...-":
					System.out.print("V");
					break;
				case ".--":
					System.out.print("W");
					break;
				case "-..-":
					System.out.print("X");
					break;
				case "-.--":
					System.out.print("Y");
					break;
				case "--..":
					System.out.print("Z");
					break;
				case ".----":
					System.out.print("1");
					break;
				case "..---":
					System.out.print("2");
					break;
				case "...--":
					System.out.print("3");
					break;
				case "....-":
					System.out.print("4");
					break;
				case ".....":
					System.out.print("5");
					break;
				case "-....":
					System.out.print("6");
					break;
				case "--...":
					System.out.print("7");
					break;
				case "---..":
					System.out.print("8");
					break;
				case "----.":
					System.out.print("9");
					break;
				case "-----":
					System.out.print("0");
					break;
				default:
					System.out.print("Kode salah");
			}		
		});		
	}
}
