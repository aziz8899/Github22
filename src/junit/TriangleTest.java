package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {

	Triangle t1 = new Triangle(0, 0, 0);
	Triangle t2 = new Triangle(7, 8, 8);

	@Test
	public void testTriangleType() {
		assertEquals(3, t2.triangleType());

	}


}
