import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class SelfDividingNumber {
	/**
	* Angka yang bisa
	* Membagi Dirinya Sendiri
	*/
	
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int input1= xx.nextInt();
		int input2= xx.nextInt();
		int maks= Math.max(input1,  input2);
		int min= Math.min(input1, input2);
		ArrayList<Integer> DeretAngkaYgBisaDibagi= new ArrayList<>();
		System.out.print("[");
		
			for(int i=min; i<=maks; i++) {
				if(i%10!=0 && AngkaYgBisaDiBagi(i)!=10 || i==0) {
				DeretAngkaYgBisaDibagi.add(AngkaYgBisaDiBagi(i));
				}	
				}
			for(int i=0; i<DeretAngkaYgBisaDibagi.size(); i++) {
				if(i!=DeretAngkaYgBisaDibagi.size()-1) {
					System.out.print(DeretAngkaYgBisaDibagi.get(i)+", ");
				}else {
					System.out.print(DeretAngkaYgBisaDibagi.get(i)+"]");
				}
				}	
				}
	
	public static int AngkaYgBisaDiBagi(int a) {
		int angka= Math.abs(a);
		int indeks= 1, pengurang= 0	;
		HashMap <Integer, Integer> digit= new HashMap<>();	
		
			for(int i=10; i<1000000000; i*=10) {
				if(angka-i>=0){ 
					digit.put(indeks, (angka%i)-pengurang);
					pengurang+= digit.get(indeks);

					if(indeks>=1) {
						digit.put(indeks, digit.get(indeks)/(i/10));
					}
					indeks++;
				}else if(angka-i<0){
					digit.put(indeks, (angka-pengurang)/(i/10));
					break;
					}
					}
			for(int i=1; i<=indeks; i++) {
				if(a==0) {
					return 0;
				}
				if(digit.get(i)==0) {
					return 10;
				}
				if(angka%digit.get(i)!=0 ) {
					return 10;
				}
				}
			
			if (a<0) {
				return angka*(-1);
			}else{
				return angka;
			}		
			}
	
	}
