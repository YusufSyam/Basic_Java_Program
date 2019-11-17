import java.util.*;

public class PossibleWordOrder {
	/**
	* Menghitung berapa kemungkinan 
	* kata yang dapat terbentuk
	* dari sebuah inputan
	*/
	
	static Scanner xx= new Scanner(System.in);
	public static void main(String [] args) {
		String kata= xx.nextLine();
		int n= kata.length();
		boolean [][] kesamaanHuruf= new boolean[n][n];
		ArrayList <String> hurufSama= new ArrayList<>();
		
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					kesamaanHuruf[i][j]= true;
					if(j!=i) {
						if(kata.substring(i, i+1).equals(kata.substring(j, j+1)) && kesamaanHuruf[i][j]==true && kesamaanHuruf[j][i]==true) {
							if(hurufSama.size()==0) {
								hurufSama.add(kata.substring(i, i+1));
							}else {
								boolean sama= false;
								for(int k=0; k<hurufSama.size(); k++) {
									if(kata.substring(i, i+1).equals(hurufSama.get(k))) {
										sama= true;
									}
									}
								if(sama==false)hurufSama.add(kata.substring(i, i+1));
						      }
							kesamaanHuruf[i][j]= false;
							kesamaanHuruf[j][i]= false;
						}
						}
						}
						}
			
			int [] r= new int[hurufSama.size()];
			
			for(int i=0; i<hurufSama.size(); i++) {
				for(int j=0; j<n; j++) {
					if(hurufSama.get(i).equals(kata.substring(j, j+1))) {
						r[i]++;
					}
					}	
					}
			
			int pembagi= 1;
			for(int i=0; i<r.length; i++) {
				pembagi*=(faktorial(r[i]));
			}
			
			System.out.println((faktorial(n)/pembagi));
	}
	
	public static int faktorial(int x) {
		int a= 1;
		for(int i=1 ; i<=x; i++) {
			a*=i;
		}
		return a; 
	}
	}
