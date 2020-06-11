import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
	@Test
	public void caseTest1() {
		String resultado = Triangle.setTriangleType(3, 3, 3, true);
		String esperado = "Equilateral Triangle";
		assertEquals(esperado, resultado);
	}

	@Test
	public void caseTest2() {
		String resultado = Triangle.setTriangleType(2, 3, 4, true);
		String esperado = "Scalene Triangle";
		assertEquals(esperado, resultado);
	}

	@Test
	public void caseTest3() {
		String resultado = Triangle.setTriangleType(5, 5, 6, true);
		String esperado = "Isosceles Triangle";
		assertEquals(esperado, resultado);
	}

	@Test
	public void caseTest4() {
		Boolean[] inputsResultado = Triangle.validateInput(0, 0, 0, false, true, true);
		Boolean[] inputsEsperado = new Boolean[] { false, false, false };
		assertArrayEquals(inputsEsperado, inputsResultado);
	}

	@Test
	public void caseTest5() {
		Boolean[] inputsResultado = Triangle.validateInput(-3, 5, 6, false, true, true);
		Boolean[] inputsEsperado = new Boolean[] { false, true, true };
		assertArrayEquals(inputsEsperado, inputsResultado);
	}

	@Test
	public void caseTest6() {
		Boolean[] inputsResultado = Triangle.validateInput(205, 5, 6, false, true, true);
		Boolean[] inputsEsperado = new Boolean[] { false, true, true };
		assertArrayEquals(inputsEsperado, inputsResultado);
	}

	@Test
	public void caseTest7() {
		String resultado = Triangle.setTriangleType(1, 1, 1, true);
		String esperado = "Equilateral Triangle";
		assertEquals(esperado, resultado);
	}

	@Test
	public void caseTest8() {
		String resultado = Triangle.setTriangleType(200, 200, 200, true);
		String esperado = "Equilateral Triangle";
		assertEquals(esperado, resultado);
	}

	@Test
	public void caseTest9() {
		String resultado = Triangle.setTriangleType(99, 99, 99, true);
		String esperado = "Equilateral Triangle";
		assertEquals(esperado, resultado);
	}
}
