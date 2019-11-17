import java.util.Scanner;

public class HighestValueOfPyramidNumber {
	
	/**
	* Mencari jumlah angka tertinggi
	* Dari titik terendah sampai titik tertinggi
	* Suatu segitiga angka
	*/
	
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int batas= xx.nextInt();
		int batas2= (int) Math.pow(2 , (batas-1));
		int [][] piramida= new int [batas][];
		int i, j, k, l;
		int maks = 0;
		
			for(i=0; i<batas; i++) {
				piramida[i]= new int[i+1];
			}	
			
			for(i=0; i<batas; i++) {
				for(j=0; j<=i; j++) {
					piramida[i][j]= xx.nextInt();
			}
			}
			
			for(i=0; i<batas2; i++) {
				int a= 0;
				int kemungkinan=piramida[0][0];
				for(j=0; j<batas-1; j++) {
					int bawah= 1;
					for(k=0; k<j; k++) {
						bawah*=2;
				}
					if((i&bawah)==0) {
						a+=0;
					}else if((i&bawah)!=0) {
						a++;	
					}
				kemungkinan+= piramida[j+1][a];				
				}
				if(kemungkinan>maks) {
					maks= kemungkinan;
				}
				}
			System.out.print(maks);
	}
	}
		
