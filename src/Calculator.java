public class Calculator {

    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number");
        }

        int answer = 1;
        for (int i = 1; i <= number; i++) {
            answer *= i;
        }
        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || setSize < subsetSize) {
            throw new IllegalArgumentException("Invalid");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        return numerator / denominator;
    }
}
