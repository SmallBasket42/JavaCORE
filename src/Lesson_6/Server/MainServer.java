package Lesson_6.Server;

public class MainServer {

    public static void main(String[] args) {

        try {
            new ServerApp(4815).start();
        } catch (Exception e) {
            System.out.println("Клиент отсоединился и сервер прекратил работу");
        }
    }
}