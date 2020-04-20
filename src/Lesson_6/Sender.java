package Lesson_6;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sender implements Runnable {

    private final Scanner in;
    private final DataOutputStream out;

    public Sender(Scanner in, DataOutputStream out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {

        String writer;
        try {
            do {
                writer = in.nextLine();
                out.writeUTF(writer);
                out.flush();

            } while (!writer.equals("bye"));
        } catch (IOException e) {
            System.out.println("app stopped");
        }
    }
}