import static org.junit.Assert.*;

import org.junit.Test;

public class consumir {

	@Test
	public void testconsumir() {
		
		DepositoCombustible tank = new DepositoCombustible(40.0,40.0);
		tank.consumir(40);
		assertTrue((int)tank.getDepositoNivel() == 0);

	}


}

