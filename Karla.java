import java.util.HashSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Karla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        String[] inputsplit = input.split(" ");
        String[] input2split = input2.split(" ");
        String QuestionType = inputsplit[1];
        HashSet<String> Protestertypes = new HashSet<String>();
        ArrayList<Integer> SegmentNumbers = new ArrayList<Integer>();

        for (int i = 0; i < input2split.length; i++) {
            SegmentNumbers.add(Integer.valueOf(input2split[i]));
        }
        Collections.sort(SegmentNumbers);

        if (QuestionType.equals("1")) {
            for (String string : input2split) {
                Protestertypes.add(string);
            }
            System.out.println(Protestertypes.size());
        }

        if (QuestionType.equals("2")) {
            HashMap<Integer, Integer> counts = new HashMap<>();

            for (String numberStr : input2split) {
                int num = Integer.parseInt(numberStr);
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }
            
            int desiredSegments = Integer.parseInt(inputsplit[2]);
            int currentSegments = Protestertypes.size();
            int flagsToMove = 0;

            while (currentSegments > desiredSegments) {
            
                int minSegmentCount = Integer.MAX_VALUE;
                for (Integer count : counts.values()) {
                    if (count < minSegmentCount && count > 0) {
                        minSegmentCount = count;
                    }
                }

                
                for (int i = 0; i < input2split.length; i++) {
                    int num = Integer.parseInt(input2split[i]);
                    if (counts.get(num) == minSegmentCount) {
                        Protestertypes.remove(input2split[i]);
                        counts.put(num, counts.get(num) - 1);
                        flagsToMove++;
                        currentSegments = Protestertypes.size();
                        break;
                    }
                }
            }
            System.out.println(flagsToMove);
        }
    }
}