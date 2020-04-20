package Lesson_6.Server;

import Lesson_6.Handler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class ServerApp {

    private final int PORT;

    ServerApp(int port) {
        this.PORT = port;
    }

    void start() {
        try (ServerSocket server = new ServerSocket(PORT)) {

            System.out.println("Сервер запущен, ожидаем подключения...");

            try (Socket socket = server.accept()) {

                System.out.println("Клиент подключился");

                new Handler(socket, "Client");

            } catch (IOException e) {
                System.out.println("Ошибка запуска сервера");
            }
        } catch (IOException e) {
            System.out.println("Ошибка инициализации сервера");
        }
    }
}