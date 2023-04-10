package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamPipelineTest {
    @Test
    void testCreateStreamPipeline() {

//        * this thing never be used by java developers
        List<String> list = List.of("Bayu", "Talita", "Kembara", "Arsyta");
        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(upper -> "Mr. " + upper);
        streamMr.forEach(System.out::println);
    }
    @Test
    void testCreateStreamValid(){
        List<String> list = List.of("Bayu", "Talita", "Kembara", "Arsyta");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr " + upper)
                .forEach(System.out::println);
    }
}
