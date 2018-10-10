package io.github.hendrawd.beyondthekotlinbasics.material.reified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hendrawd on 10 Oct 2018
 */
public class GenericMethod {
    private static <T> List<T> fromArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"satu", "dua", "tiga", "empat", "lima"};
        List<String> stringList = fromArrayToList(stringArray);
        for (String string : stringList) {
            System.out.println(string);
        }
    }
}
