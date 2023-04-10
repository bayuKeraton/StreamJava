package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {
    @Test
    void testIntermediateOperation(){
    List<String> names = List.of("a", "b", "c","d", "e");
    
    Stream<String> upper = names.stream()
            .map(name-> {
                System.out.println("Change " + name + " to UPPERCASE");
                return name.toUpperCase();
            });
    }
}
