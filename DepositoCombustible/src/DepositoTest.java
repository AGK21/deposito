import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoTest {

	@Test
	public final void getDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible (40.0,7.0);
		double nivel=tank.getDepositoNivel();
		assertEquals(7.0,nivel,1.0);
	}

	@Test
	public final void getDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible (40.0,40.0);
		double depMax=tank.getDepositoMax();
		assertEquals(40.0,depMax,40.0);
	}

	@Test
	public final void estaVacio() {
		DepositoCombustible tank = new DepositoCombustible (40.0,0.0);		
		assertEquals(true,tank.estaVacio());
	}

	@Test
	public final void estaLleno() {
		DepositoCombustible tank = new DepositoCombustible (40.0,40.0);		
		assertEquals(true,tank.estaLleno());
	}
}
