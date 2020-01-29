import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		PrimeOrNot obj=new PrimeOrNot();
		boolean result=obj.checkPrime(17);
		assertEquals(result,true);
	}

}
