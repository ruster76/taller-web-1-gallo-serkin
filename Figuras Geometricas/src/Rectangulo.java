
public class Rectangulo {
		
	float base;
	float altura;
	
	public  Rectangulo (float b, float h){
		base=b;
		altura=h;
	}
	public float obtenerPerimetro(float base, float altura){
		float perimetro =2*(base + altura);
		return perimetro;
		
	}
	
	public float obtenerArea(float base, float altura){
		float area = base * altura;
		return area;
	}

}



