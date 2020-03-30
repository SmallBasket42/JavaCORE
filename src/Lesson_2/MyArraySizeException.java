package Lesson_2;

public class MyArraySizeException extends CustomException {

    public MyArraySizeException() {
        super("Массив должен быть размера 4x4");
    }
}