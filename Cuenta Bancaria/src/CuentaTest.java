import static org.junit.Assert.*;

import org.junit.Test;


public class CuentaTest {

	@Test
	public void testCuentaBancaria() {
		
		Cuenta cuentaDePrueba=new Cuenta();
		
		assertNotNull("saldo con valor no nulo", cuentaDePrueba);
		
		double saldoDePrueba=cuentaDePrueba.depositar(-10);
		assertEquals("no permite deposito negativo", 0, saldoDePrueba, 1e-6);
		
		saldoDePrueba=cuentaDePrueba.extraer(10);		
		assertTrue("no permite saldo inferior a 0", saldoDePrueba==0);
	}
}
