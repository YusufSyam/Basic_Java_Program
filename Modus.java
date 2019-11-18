import java.util.*;

public class Modus {
	
	// Mencari modus dari sebuah data tunggal
	 
	static Scanner xx= new Scanner(System.in);
	public static void main(String [] args) {
		ArrayList <Integer> bilanganSama= new ArrayList<>();
		int n= xx.nextInt();
		int [] bilangan= new int[n];
		boolean bilanganAda;
		bilanganSama.add(bilangan[0]= xx.nextInt());
		
			for(int i=1; i<n; i++) {
				bilangan[i]= xx.nextInt();
				bilanganAda= true;
				for(int j=0; j<bilanganSama.size(); j++) {
					if(bilangan[i]==bilangan[0]) {
						bilanganAda= false;
						break;
					}else if(bilangan[i]==bilanganSama.get(j)) {
						bilanganAda= false;
						break;
					}else{
						bilanganAda= true;
					}
					}
				if(bilanganAda==true) bilanganSama.add(bilangan[i]);
			}
			
		int [] modus= new int[bilanganSama.size()];
		
		for(int i= 0; i<n; i++) {
			for(int j=0; j<bilanganSama.size(); j++) {
				if(i==0) {
					modus[j]=0;
				}
				if(bilangan[i]==bilanganSama.get(j)) {
					modus[j]++;
				}
				}
				}
		
		int maks= 0, maksIndeks= 0, maksModus= 0;
		
		for(int i=0; i<modus.length; i++) {
			if(modus[i]>=maks && bilanganSama.get(i)>=maksModus) {
				maksIndeks= i; 
				maksModus= bilanganSama.get(i);
				maks= modus[i];
			}
			}	
		
		System.out.println(bilanganSama.get(maksIndeks));
		
	}
	}
