
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fill {


	@Test
	public void testfill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(40.0);
		assertTrue((int)tank.getDepositoNivel() == 40.0);

	}

}
