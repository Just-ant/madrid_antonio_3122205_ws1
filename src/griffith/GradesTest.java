package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradesTest {

	@Test
	void testGradesMax() {
		Grades grade = new Grades();

		assertEquals(69, grade.gradesMax(new int[] { 42, 69, 24 }));
		assertEquals(-24, grade.gradesMax(new int[] { -42, -69, -24 }));
		assertEquals(0, grade.gradesMax(new int[] {}));
	}

	@Test
	void testGradesTotal() {
		Grades grade = new Grades();

		assertEquals(6, grade.gradesTotal(new int[] { 1, 2, 3 }));
		assertEquals(-6, grade.gradesTotal(new int[] { -1, -2, -3 }));
		assertEquals(0, grade.gradesTotal(new int[] {}));

	}

	@Test
	void testGradesAverage() {
		Grades grade = new Grades();

		assertEquals(2, grade.gradesAverage(new int[] { 1, 2, 3 }));
		assertEquals(-2, grade.gradesAverage(new int[] { -1, -2, -3 }));
		assertEquals(0, grade.gradesAverage(new int[] {}));
	}

	@Test
	void testCountFails() {
		Grades grade = new Grades();

		assertEquals(1, grade.countFails (new int[] { 100, 69, 40, 32 },40));
		assertEquals(4, grade.countFails (new int[] { 34, 23, 34,12 },40));
		assertEquals(0, grade.countFails(new int[] {},40));
	}

}
