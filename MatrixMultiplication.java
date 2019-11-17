import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String [] args) {	
		Scanner xx= new Scanner(System.in);
		 
		System.out.println("Matriks 1");
		System.out.print("Baris : ");
		int barisM1= xx.nextInt();
		System.out.print("Kolom : ");
		int kolomM1= xx.nextInt();
		
		System.out.println("Matriks 2");
		System.out.print("Baris : ");
		int barisM2= xx.nextInt();
		System.out.print("Kolom : ");
		int kolomM2= xx.nextInt();
		
		int [][] matriks1= new int[barisM1][kolomM1];
		int [][] matriks2= new int[barisM2][kolomM2];
		int [][] matriks3= new int[barisM1][kolomM2];
		int [][] matriks4= new int[barisM2][kolomM1];
		boolean [] bisa= {true, true};
		
		int i, j, k;
		
			for(i=0; i<barisM1; i++){
				for(j=0; j<kolomM1; j++){
					matriks1 [i][j]= xx.nextInt();
				}
				}
			
			for(i=0; i<barisM2; i++){
				for(j=0; j<kolomM2; j++){
					matriks2 [i][j]= xx.nextInt();
				}
				}
			
			if(kolomM1!=barisM2) {
				System.out.println("Matriks 1 tidak bisa dikali matriks 2");
				bisa[0]= false;
			}
			
			if(kolomM2!=barisM1) {
				System.out.println("Matriks 2 tidak bisa dikali matriks 1");
				bisa[1]= false;
			}
			
			
			if(kolomM1==barisM2){
					for(i=0; i<barisM1; i++){
						for(j=0; j<kolomM2; j++){
							for(k=0; k<kolomM1; k++){
								matriks3[i][j]+=(matriks1[i][k]*matriks2[k][j]);
					}
					}
					}
					}
			
			if(kolomM2==barisM1) {	
				for(i=0; i<barisM2; i++){
					for(j=0; j<kolomM1; j++){
						for(k=0; k<kolomM2; k++){
							matriks4[i][j]+=(matriks2[i][k]*matriks1[k][j]);
					}
					}	
					}
					}
			
			if(bisa[0]==true) {
				System.out.println("Matriks 1 x Matriks 2 ");
				for(i=0; i<barisM1; i++){
					for(j=0; j<kolomM2; j++){
						System.out.printf("%4s",matriks3[i][j]);
					}
					System.out.println();
					}
					}
			
			if(bisa[1]==true) {
				System.out.println("Matriks 2 x Matriks 1 ");
				for(i=0; i<barisM2; i++){
					for(j=0; j<kolomM1; j++){
						System.out.printf("%4s",matriks4[i][j]);
					}
					System.out.println();
					}
					}
	}
	}
