package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamOperation {
    @Test
    void testMapStream(){
        List<String> names = List.of("Bayu","Kembara","Talita");
        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(newData -> newData.toUpperCase());
        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
