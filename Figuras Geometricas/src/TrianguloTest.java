import org.junit.Test;


public class TrianguloTest {

	@Test
	public void test_calculos() {
		Triangulo T= new Triangulo(2,5,3,4,2);
	
		System.out.println ("El perimetro del triangulo es " + T.obtenerPerimetro(2,5,3));	
		System.out.println ("El area del triangulo es " + T.obtenerArea(4,2));	
	}

}
