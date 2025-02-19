package griffith;

public class Grades {

	int gradesMax(int[] grades) {
		if (grades.length == 0) {
			return 0;
		}

		int max = grades[0];

		for (int g : grades) {

			if (g > max) {
				max = g;
			}

		}
		return max;

	}

	int gradesTotal(int[] grades) {

		if (grades.length == 0) {
			return 0;
		}

		int total = 0;

		for (int g : grades) {

			total += g;

		}

		return total;

	}// get sum of array

	double gradesAverage(int[] grades) {
		if (grades.length == 0) {
			return 0;
		}

		double total = 0;

		for (int g : grades) {

			total += g;

		}

		double average = total / grades.length;
		return average;
	}

	int countFails(int[] grades, int minGrade) {
		return 0;

	} // count how many grades < minGrade

}
