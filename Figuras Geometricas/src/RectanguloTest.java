import org.junit.Test;


public class RectanguloTest {

	@Test
	
	
	public void test_calculos() {
		Rectangulo R= new Rectangulo(2,5);
		R.obtenerPerimetro(2,5);
		R.obtenerArea(2,5);
		System.out.println ("El perimetro del rectangulo es " + R.obtenerPerimetro(2,5));	
		System.out.println ("El area del rectangulo es " + R.obtenerArea(2,5));	
	}

}
