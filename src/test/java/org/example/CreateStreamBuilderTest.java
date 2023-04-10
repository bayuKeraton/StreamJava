package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder(){
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Bayu");
        builder.add("Kembara").add("Talita");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }
    
    @Test
    void testCreateStreamBuilderTernary(){
        Stream<Object> stream= Stream.builder().add("Bayu").add("Talita").add("Kembara").build();

        stream.forEach(System.out::println);
    }

}
