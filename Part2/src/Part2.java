import java.util.ArrayList;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amy");
        names.add("Bob");
        names.add("Cherry");
        names.add("Dolores");
        names.add("Edward");

        System.out.println("Names = " + listToString(names));

        List<String> switchedNames = switchFirstAndLastLetters(names);

        System.out.println("Names (switched) = " + listToString(switchedNames));
    }

    private static List<String> switchFirstAndLastLetters(List<String> names) {
        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 1) {
                String switchedName = name.substring(name.length() - 1).toUpperCase() +
                                      name.substring(1, name.length() - 1).toLowerCase() +
                                      name.substring(0, 1).toLowerCase();
                switchedNames.add(switchedName);
            } else {
                switchedNames.add(name.toUpperCase());
            }
        }
        return switchedNames;
    }

    private static String listToString(List<String> list) {
        return String.join(", ", list);
    }
}

