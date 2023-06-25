package com.demo.bredit;


import java.util.ArrayList;
import java.util.List;

public class QuestionApplication {


	protected int question1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			// System.out.println("i = " + i);
			sum += i;
		}

		return sum;
	}

	protected List<Integer> question2(List<Integer> n, Integer sizeOfProcess) {
		List<Integer> result = new ArrayList<>(); // Arrays.asList(1,2,3);
		int sum = 0;
		int num = 0;
		for (int i = 0; i < n.size(); i++) {
			num = n.get(i);
			sum += num;
			if ((i + 1) % sizeOfProcess == 0) {
				result.add(sum);
				sum = 0;
			} else if ((n.size() - 1) == i) {
				result.add(sum);
			}
		}

		return result;
	}

	protected int question3(int sizeX, int sizeY, int elementX, int elementY) {
		int countRound = 0;

		while (countRound < (sizeX + sizeY)) {
			int count = 0;
			for (int y = 1; y <= sizeY; y++) {
				for (int x = 1; x <= sizeX; x++) {
					if ((Math.abs(elementX - x) <= countRound)
							&& (Math.abs(elementY - y) <= countRound)) {
						// System.out.print("x");
						count++;

					} // else {
						// System.out.print("-");
						// }

				}
				// System.out.println();
			}

			countRound++;
			if (count == (sizeX * sizeY)) {
				break;
			}
		}

		return countRound;
	}

	/*
	 * protected void scanInput() { try { Scanner inpuScanner = new Scanner(new
	 * File("Data_test.txt")); String questionNumber = ""; while (inpuScanner.hasNext()) {
	 * questionNumber = inpuScanner.nextLine(); String[] splitQuestions =
	 * questionNumber.split("\\|"); if (splitQuestions[0].equals("question1")) { System.out.println(
	 * "question 1 : " + question1(Integer.parseInt(splitQuestions[1]))); } if
	 * (splitQuestions[0].equals("question2")) { List<String> strList = new
	 * ArrayList<String>(Arrays.asList(splitQuestions[1].split(","))); List<Integer> intList = new
	 * ArrayList<>(); for (String s : strList) intList.add(Integer.valueOf(s));
	 * System.out.println("question 2 : " + question2(intList,
	 * Integer.parseInt(splitQuestions[2]))); } if (splitQuestions[0].equals("question3")) {
	 * System.out.println( "question 3 : " + question3(Integer.parseInt(splitQuestions[1]),
	 * Integer.parseInt(splitQuestions[2]), Integer.parseInt(splitQuestions[3]),
	 * Integer.parseInt(splitQuestions[4]))); }
	 * 
	 * 
	 * // Arrays.stream(splitQuestions).forEach(System.out::println); }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

}
