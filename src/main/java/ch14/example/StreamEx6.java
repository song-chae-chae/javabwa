package ch14.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180),
        };

        // 학생 이름만 뽑아서 List<String>에 저장
        List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);

        // 스트림을 배열로 반환
        Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);

        for(Student s : stuArr2) {
            System.out.println(s);
        }

        // Stream -> Map<String, String> : 학생 이름이 키
        Map<String, Student> studentMap = Stream.of(stuArr).collect(Collectors.toMap(s -> s.getName(), p -> p));

        for(String name : studentMap.keySet()) {
            System.out.println(name  + " - " + studentMap.get(name));
        }

        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr).collect(summingInt(Student::getTotalScore));
        System.out.println("count = " + count);
        System.out.println("totalScore = " + totalScore);

        totalScore = Stream.of(stuArr).collect(reducing(0, Student::getTotalScore, Integer::sum));
        System.out.println("totalScore = " + totalScore);

        Optional<Student> topStudent = Stream.of(stuArr).collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStudent = " + topStudent.get());

        IntSummaryStatistics stat = Stream.of(stuArr).collect(summarizingInt(Student::getTotalScore));
        System.out.println(stat);

        String studentNames = Stream.of(stuArr).map(Student::getName).collect(joining(",", "{", "}"));
        System.out.println(studentNames);
    }
}
