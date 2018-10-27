package io.github.hendrawd.beyondthekotlinbasics.material.reified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hendrawd on 10 Oct 2018
 */
public class GenericMethod {

    // T = Type,
    // T is commonly used,
    // but like a variable in java, it can be replaced with other word also
    private static <T> List<T> fromArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"satu", "dua", "tiga", "empat", "lima"};
        List<String> stringList = fromArrayToList(stringArray);

        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        List<Integer> intList = fromArrayToList(intArray);
    }
}
