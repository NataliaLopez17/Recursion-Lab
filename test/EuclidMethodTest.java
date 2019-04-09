import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.jupiter.api.Test;

public class EuclidMethodTest {

	@Test
	public void testGCDDirecVariablePassing() {
		assertNotEquals("It cannot return p.",1048,EuclidMethod.gcd(1048, 402));
		assertNotEquals("It cannot return q.",402,EuclidMethod.gcd(1048, 402));
		assertNotEquals("You are returning 0.",0,EuclidMethod.gcd(1048, 402));
	}
	@Test
	public void testGCD() {
		assertEquals("It is not the correct result",24,EuclidMethod.gcd(1440,408));
		assertEquals("It is not the correct result",10,EuclidMethod.gcd(100,10));
		assertEquals("It is not the correct result",512,EuclidMethod.gcd(4096,512));
		assertEquals("It is not the correct result",1,EuclidMethod.gcd(3567,256));
		assertEquals("It is not the correct result",1440,EuclidMethod.gcd(1440,1440));
	}
}