import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class PascalTriangleTest {

	ArrayList<String> compArray1 = new ArrayList<String>();
	
	ArrayList<String> compArray5 = new ArrayList<String>();
	
	ArrayList<String> compArray9 = new ArrayList<String>();

	@Before
	public void prepare() {
		compArray1.add(" 1 ");
		
		compArray5.add("     1 ");
		compArray5.add("    1 1 "); 
		compArray5.add("   1 2 1 "); 
		compArray5.add("  1 3 3 1 "); 
		compArray5.add(" 1 4 6 4 1 ");
		
		compArray9.add("         1 ");
		compArray9.add("        1 1 ");
		compArray9.add("       1 2 1 ");
		compArray9.add("      1 3 3 1 ");
		compArray9.add("     1 4 6 4 1 ");
		compArray9.add("    1 5 10 10 5 1 ");
		compArray9.add("   1 6 15 20 15 6 1 "); 
		compArray9.add("  1 7 21 35 35 21 7 1 "); 
		compArray9.add(" 1 8 28 56 70 56 28 8 1 ");
	}
	@Test
	public void test() {
		PascalTriangle.iterate(0);
		assertTrue("The triange must be empty.",PascalTriangle.getArr().isEmpty());
		
		PascalTriangle.iterate(1);
		assertTrue("The triange must have one line or does not set the correct numbers.",PascalTriangle.getArr().equals(compArray1));

		PascalTriangle.iterate(5);
		assertTrue("The triange must have five lines or does not set the correct numbers.",PascalTriangle.getArr().equals(compArray5));

		PascalTriangle.iterate(9);
		assertTrue("The triange must have nine lines or does not set the correct numbers.",PascalTriangle.getArr().equals(compArray9));
	}
}
