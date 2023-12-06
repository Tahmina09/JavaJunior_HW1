import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToDoubleFunction;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(8);
        integerList.add(3);
        integerList.add(12);
        integerList.add(1);
        integerList.add(6);
        integerList.add(9);
        integerList.add(2);
        integerList.add(18);

        System.out.println(integerList);

        middleValue(integerList);
    }

    public static void middleValue(List<Integer> integerList) {
        double average = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToDouble(integer -> integer)
                .average()
                .orElse(Double.NaN);
        System.out.println("Среднее число всех четных чисел = " + average);
    }
}