import static org.junit.Assert.*;

import org.junit.Test;

public class testeHome {

	@Test
	public void sum_test() {
		assertEquals(2, home.sum(1,1));
	}
	
	@Test
	public void sum_test_wrong() {
		assertEquals(3, home.sum(1,1));
	}

}
