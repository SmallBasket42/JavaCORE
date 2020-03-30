package Lesson_2;

public class MyArrayDataException extends CustomException {

    public MyArrayDataException(int row, int col) {
        super(String.format("Недопустимые значения[%d, %d]", row, col));
    }
}