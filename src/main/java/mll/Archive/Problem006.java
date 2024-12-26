package mll.Archive;

public class Problem006 {
    public static int calculate(){
        int sumOfSquares = 0;
        int amountOfFirstNumbers = 100;
        for (int i = 1; i <= amountOfFirstNumbers; i++) {
            sumOfSquares += i*i;
        }

        int sum = 0;
        for (int j = 1; j <= amountOfFirstNumbers; j++) {
            sum +=j;
        }
        int squareOfSums=sum*sum;

        int difference = squareOfSums - sumOfSquares;

        return difference;
    }
    public static int calculate_short(){
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i*i;
            sum +=i;
        }
        return (sum*sum) - sumOfSquares;
    }
}
