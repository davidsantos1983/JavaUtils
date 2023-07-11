package org.collectionUtils.david;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean isEmpty(Collection<?> collection) {

        return collection == null || collection.isEmpty();
    }

    public static <T> List<T> filter(Collection<T> collection, Predicate<T> predicate) {

        List<T> filteredList = new ArrayList<>();
        //Example of Predicate: Predicate<Integer> evenPredicate = number -> number % 2 == 0;
        //This would be used for a collection of Integers
        if (collection != null && predicate != null) {
            for (T element : collection) {
                if (predicate.test(element)) {
                    filteredList.add(element);
                }
            }
        }
        return filteredList;
    }

    public static <T,R> List<R> transform(Collection<T> collection, Function<T,R> function) {

        List<R> transformedList = new ArrayList<>();
        //Example of Function: Function<Integer, String> toStringFunction = number -> number.toString();
        //This would be used for a collection of Integers
        if (collection != null && function != null) {
            for (T element : collection) {
                transformedList.add(function.apply(element));
            }
        }
        return transformedList;
    }

}