package griffith;
//Antonio Madrid - 3122205
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

	} //gets max grade

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
	} //gets average of array

	int countFails(int[] grades, int minGrade) {
	    int count = 0;

	    for (int g : grades) {
	        if (g < minGrade) {
	            count++;
	        }
	    }

	    return count;
	} //count how many grades < minGrade

}
