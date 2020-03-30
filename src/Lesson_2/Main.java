package Lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"4", "8", "15", "16"},
                {"23", "42", "1", "7"},
                {"87", "25", "32", "53"},
                {"87", "48", "57", "29"}
        };
        String[][] wrongSizeMatrix = {
                {"3", "2", "3", "3"},
                {"5", "7"},
                {"1", "4", "8", "9"},
                {"0", "2", "7", "3"}
        };
        String[][] wrongChar = {
                {"3", "2", "3", "3"},
                {"6", "1", "%", "3"},
                {"0", "*", "7", "3"},
                {"1", "2", "7", "3"}
        };

        try {
            System.out.println(Lesson_2.Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Lesson_2.Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}

