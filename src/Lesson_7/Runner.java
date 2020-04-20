package Lesson_7;

import Lesson_7.Client.Client;
import Lesson_7.Server.MServer;
import javafx.application.Application;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        new Thread(MServer::new).start();
            Thread.sleep(1000);

        new Thread(() -> Application.launch(Client.class, args)).start();
    }
}