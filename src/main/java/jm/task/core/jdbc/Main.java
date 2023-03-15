package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        // Создание таблицы
        userService.createUsersTable();

        // Добавление пользователей
        userService.saveUser("Alice", "Smith", (byte) 25);
        System.out.println("User с именем - Alice добавлен в базу данных");
        userService.saveUser("Bob", "Johnson", (byte) 30);
        System.out.println("User с именем - Bob добавлен в базу данных");
        userService.saveUser("Charlie", "Brown", (byte) 20);
        System.out.println("User с именем - Charlie добавлен в базу данных");
        userService.saveUser("David", "Davis", (byte) 35);
        System.out.println("User с именем - David добавлен в базу данных");

        // Получение всех пользователей и вывод в консоль
        List<User> users = userService.getAllUsers();
        System.out.println("Список пользователей:");
        for (User user : users) {
            System.out.println(user.toString());
        }

        // Очистка таблицы
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}
