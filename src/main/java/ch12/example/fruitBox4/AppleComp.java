package ch12.example.fruitBox4;

import java.util.Comparator;

public class AppleComp implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return o2.weight - o1.weight;
    }
}
