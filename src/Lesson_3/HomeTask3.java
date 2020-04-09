package Lesson_3;

import java.util.*;

public class HomeTask3 {
    public static void main(String[] args) {
        String[] words = {"loop", "cat", "wolf", "rocket", "mile", "joke", "robot", "android", "rocket", "joke"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println(" ");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println(" ");

        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "745236");
        pb.add("Petrov", "456201");
        pb.add("Petrov", "789541");
        pb.add("Sidorov","612589");
        pb.add("Sidorov","481516");
        pb.add("Ivanov", "234252");
        pb.add("Skorobogatko","779801");
        pb.add("Carmack", "666555");
        pb.add("Romero","666554");
        System.out.println(pb.get("Sidorov"));
    }
}