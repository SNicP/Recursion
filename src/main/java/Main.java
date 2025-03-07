import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        compare(1);
        compare(2);
        compare(5);
        compare(15);
    }

    public static String compare(int day) {
        System.out.println("=== Day " + day + " ===");
        int[] startNumbers = { 21, 1, 20, 23 };
        int iterative = chooseHobbyIterative(startNumbers, day);
        int recursive = chooseHobbyRecursive(startNumbers, day, new int[day + 4]);
        String result = "Iterative = " + iterative + " | Recursive = " + recursive;
        System.out.println(result);
        System.out.println();
        return result;
    }

    public static int chooseHobbyRecursive(int[] startNumbers, int day, int[] memory) {
        memory[0] = startNumbers[0];
        memory[1] = startNumbers[1];
        memory[2] = startNumbers[2];
        memory[3] = startNumbers[3];

        int prev;
        int prePrePrev;
        int result;
        int index = day + 4;

        if (day == 1) {
            prev = memory[index - 2];
            prePrePrev = memory[index - 4];
            memory[index - 1] = (prev * prePrePrev) % 10 + 1;
            result = memory[index - 1];
            return result;
        } else if (memory[index - 1] != 0) {
            return memory[index - 1];
        } else {
//            System.out.println(">>> " + day);
            prev = chooseHobbyRecursive(startNumbers, day - 1, memory);
            prePrePrev = chooseHobbyRecursive(startNumbers, day - 3, memory);
            memory[index - 1] = (prev * prePrePrev) % 10 + 1;
            result = memory[index - 1];
        }
        return result;
    }

    public static int chooseHobbyIterative(int[] startNumbers, int day) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(startNumbers[0]);  // 21
        numbers.add(startNumbers[1]);  // 01
        numbers.add(startNumbers[2]);  // 20
        numbers.add(startNumbers[3]);  // 23

        for (int d = 0; d < day; d++) {
            int index = d + 4; // индексы дней в массиве сдвинуты на 4
            int prev = numbers.get(index - 1); // предыдущее значение
            int prePrePrev = numbers.get(index - 3); // пре-пре-предыдущее значение
            numbers.add((prev * prePrePrev) % 10 + 1);
        }

        return numbers.get(numbers.size() - 1);
    }
}