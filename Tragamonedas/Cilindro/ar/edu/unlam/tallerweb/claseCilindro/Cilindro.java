package ar.edu.unlam.tallerweb.claseCilindro;
import java.util.Random;
public class Cilindro {
	private  int a, b, c;
	
public  void jugar() {
	          
	            Random rnd = new Random();
	            a = rnd.nextInt(7);
	            b = rnd.nextInt(7);
	            c = rnd.nextInt(7);      
	            System.out.println(a);        
	            System.out.println(b);        
	            System.out.println(c);        
	     
	            
	 }
}
