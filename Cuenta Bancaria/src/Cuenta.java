
public class Cuenta {
 double saldo;
 double monto;	
	public Cuenta(){
	saldo=0;
	
	}
	
	
	public double obtenerSaldo(){
		return this.saldo;
			
	}
	
	public double depositar(double monto){
		if(monto>=0){
			this.saldo=this.saldo+monto;
			
		}
		else{
			System.out.println("No se permite el ingreso de monto negativo");
		}
		return this.saldo;
	}

	
	public double extraer (double monto){
		
		double control= this.saldo-monto;
		if(control<0){
			
			System.out.println ("No se puede extraer ese monto, limite superado");
		}
		else{
			this.saldo=control;
		}
		return  this.saldo;
	}
}
