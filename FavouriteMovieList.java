import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class FavouriteMovieList {
	
	/*
	* Database : MovieData.txt
	*/
	
	static Scanner xx= new Scanner(System.in);
	static ArrayList <String> movie= new ArrayList<>();
	static ArrayList <String> movieDetails= new ArrayList<>();
	public static void main(String [] args) throws IOException {
		bacaData();
		boolean jalanTros= true;
		
			while(jalanTros==true) {
			
			System.out.println("Favourite Movie");
				if(movie.size()==0) {
					System.out.println("1. -");
				}else {
				for(int i=0; i<movie.size(); i++) {
					System.out.println((i+1)+". "+movie.get(i));
				}
			}
				
			System.out.println("(d)Detail (s)Search (a)Add (r)Remove (e)End Session");
			System.out.print("> ");
			String input= xx.nextLine();
			
				if(input.length()>2 && input.substring(0,2).equals("d ")) {
					if(Integer.parseInt(input.substring(2))>movie.size()) {
						System.out.println("Data tidak ada");
					}else {
						System.out.println(movieDetails.get(Integer.parseInt(input.substring(2))-1));
					}
					
				}else if(input.length()>2 && input.substring(0,2).equals("s ")) {
					boolean ada= false;
					for(int i=0; i<movie.size(); i++) {
					if(movie.get(i).contains(input.substring(3, input.length())) && input.length()>3 || input.length()==3 && movie.get(i).contains(input.substring(2))){
						System.out.println((i+1)+". "+movie.get(i));
						ada= true;
					}
					}
					if(ada==false) {
						System.out.println("Kata '"+input.substring(2,input.length())+"' tidak ada dalam data film");
					}
					
				}else if(input.length()>2 && input.substring(0,2).equals("r ")) {
					if(Integer.parseInt(input.substring(2))>movie.size()) {
						System.out.println("Indeks movie hanya sampai "+movie.size());
					}else{
						for(int i=0; i<movie.size(); i++) {
						if(input.substring(2).equals(Integer.toString(i+1))) {
							movie.remove(i);
							movieDetails.remove(i);
					}
					}
					}
				
				}else if(input.equals("a")) {
						System.out.print("Judul\t : ");
						String judul= xx.nextLine();
						movie.add(judul);
						movieDetails.add(tambahData(movieDetails, judul));
					
				}else if(input.equals("e")){
					System.out.println("End.");
					tulisData();
					break;
					
				}else {
					System.out.println("Input salah");
				}
			
			System.out.println("\n");
			}
		}
	
	public static String tambahData(ArrayList <String> a, String judul) {
		System.out.print("Rilis\t : ");
		String rilis= xx.nextLine();
		
		System.out.print("Durasi\t : ");
		String durasi= xx.nextLine();
		
		System.out.print("Genre\t : ");
		String genre= xx.nextLine();
		
		System.out.print("Sinopsis : ");
		String sinopsis= xx.nextLine();
		
		System.out.print("Cast\t : ");
		String cast= xx.nextLine();
		
		return  "Judul\t : "+judul+
			"\nRilis\t : "+rilis+
			"\nDurasi\t : "+durasi+
			"\nGenre\t : "+genre+
			"\nSinopsis : "+sinopsis+
			"\nCast\t : "+cast;
		}
	
	public static void bacaData() throws IOException{
		FileReader sumberFile= null;
		BufferedReader pembacaFile= null;

			sumberFile= new FileReader("MovieData.txt");
			pembacaFile= new BufferedReader(sumberFile);
				
			String baca;
			ArrayList <String> isi= new ArrayList<>();
			
			while((baca= pembacaFile.readLine())!= null){
				isi.add(baca);
			}
			
			String [][] splitter= new String[isi.size()][6];
			
			for(int i= 0; i<isi.size(); i++){
				splitter[i]= isi.get(i).split("###");
				movie.add(splitter[i][0].substring(9, splitter[i][0].length()));
				movieDetails.add(splitter[i][0]+
						"\n"+splitter[i][1]+
						"\n"+splitter[i][2]+
						"\n"+splitter[i][3]+
						"\n"+splitter[i][4]+
						"\n"+splitter[i][5]);
			}
					if(pembacaFile!=null) pembacaFile.close();
					if(sumberFile!=null) sumberFile.close();
			}
	
	public static void tulisData() throws IOException{
		PrintWriter penulisIsiFile= null;
		
			penulisIsiFile= new PrintWriter("MovieData.txt");	
		
			for(int i= 0; i<movieDetails.size(); i++){
				String ganti= movieDetails.get(i).replaceAll("\n", "###");
				penulisIsiFile.write(ganti+"\n");
			}		
			
			if(penulisIsiFile!=null) penulisIsiFile.close();
	}
	}
