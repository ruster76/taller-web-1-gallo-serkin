
public class Triangulo {
	
	float lado1;
	float lado2;
	float lado3;
	float base;
	float altura;
	
	public Triangulo (float l1, float l2, float l3, float b, float h){
		lado1=l1;
		lado2=l2;
		lado3=l3;
		base=b;
		altura=h;
	}
	public float obtenerPerimetro(float lado1, float lado2, float lado3){
		float perimetro =lado1 + lado2 + lado3;
		return perimetro;
		
	}
	
	public float obtenerArea(float base, float altura){
		float area = (base * altura)/2;
		return area;
	}

}
