package com.qa.java;

public class FlowCharts {
	// Flowcharts
	public static int getAnumber(int input1, int input2, Boolean y) {

		if (y = true) {
			return input1 + input2;
		} else {
			return input1 * input2;
		}

	}

	public static void flowchart(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
				// THE END
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
					// THE END
				} else {
					System.out.println("E");
					// THE END
				}
			}
		} else {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println("5");
					// THE END
				} else {
					System.out.println("4");
					if (a > 500) {
						System.out.println("6");
						// THE END
					} else {
						System.out.println("7");
						// THE END
					}
				}
			} else {
				System.out.println("2");
				// THE END
			}

		}
	}
}
