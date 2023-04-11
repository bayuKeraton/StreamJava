package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

public class MapOperationTest {
    @Test
    void testMapOperation() {
    List.of("Bayu","Kembara","Talita").stream()
            .map(newVab -> newVab.toUpperCase())
            .map(String::length)
            .forEach(System.out::println);
    }
}
