import java.io.*;
import java.nio.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException{
		
		/*
		
		int tab[]= new int [256];
		//Initialisation de tab à {0}
		for (int i=0; i<256;i++){
			tab[i]=0;
		}
		*/
		
		/*
		//Lecture du fichier pgm
	     Path file = FileSystems.getDefault().getPath("src", "lena.pgm");
		try (InputStream in = Files.newInputStream(file);
		    BufferedReader reader =
		      new BufferedReader(new InputStreamReader(in))) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	
		    	

		    	
		        System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.println(x);
		}
		
		*/
		
		Scanner sc2 = null;
	    try {
	        sc2 = new Scanner(new File("lena.pgm"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    
	    int i=0;
	    
	    int tab[]= new int[256];
	    for (int j=0;j<256;j++){
	    	tab[j]=0;
	    }
	    while (sc2.hasNextLine()) {
	            Scanner s2 = new Scanner(sc2.nextLine());
	            i+=1;
	        boolean b;
	        String s;
	       
	        while (b = s2.hasNext()) {
	            
	        	s = s2.next();
	            if (i>5){
	            	tab[Integer.parseInt(s)]+=1;
	            	
	            }
	            }	
	        	
	        }
	    
	    PrintWriter pw = null;
		  try {
		     File file = new File("resultat.pgm");
		     FileWriter fw = new FileWriter(file, true);
		     pw = new PrintWriter(fw);
		     pw.println("Essai ");
		  } catch (IOException e) {
		     e.printStackTrace();
		  } finally {
		     if (pw != null) {
		        pw.close();
		     }
		  }
	    
		
		
		
		
		
		/*

			  String fileSpecified = "lena.pgm";

			  FileReader fr = new FileReader(fileSpecified);
			  BufferedReader br = new BufferedReader (fr);
			  Scanner in = new Scanner (br);

			  while (in.hasNextLine()) {
			    System.out.println ("next int = " + in.nextInt());
			  }
			}
		*/
		
		
		
		/*
		
		*/
		// TODO Auto-generated method stub

	}
}

