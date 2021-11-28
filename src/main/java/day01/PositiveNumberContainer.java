package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumberContainer {

    List<Double> numbers = new ArrayList<>();

    public void addNumbers(double number) {
        numbers.add(number);
    }

    public void addPositiveRealNumbers() {
        Scanner scanner = new Scanner(System.in);
        Double number = scanner.nextDouble();
        while (number > 0) {
            addNumbers(number);
            if (number <= 0) {
                break;
            }
            number = scanner.nextDouble();
        }
        System.out.println(numbers);
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        PositiveNumberContainer container = new PositiveNumberContainer();
        container.addPositiveRealNumbers();
    }
}
