package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradesTest {

	@Test
	void testGradesMax() {
		Grades grade = new Grades();
		
			assertEquals(69, grade.gradesMax(new int [] {42, 69, 24}));
			assertEquals(-24, grade.gradesMax(new int [] {-42, -69, -24}));
			assertEquals(0, grade.gradesMax(new int [] {}));
	}

	@Test
	void testGradesTotal() {
		Grades grade = new Grades();
		
	}

	@Test
	void testGradesAverage() {
		Grades grade = new Grades();
		
	}

	@Test
	void testCountFails() {
		Grades grade = new Grades();
		
	}

}
