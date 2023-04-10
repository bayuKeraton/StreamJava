package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream(){
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("Bayu");
        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
//        emptyOrNotStream.forEach(datas ->{
//            System.out.println(datas);
//        });
        Stream<String> streamString = Stream.of("Bayu","Talita","Kembara");
//        streamString.forEach(value ->{
//            System.out.println(value);
//        });
        Stream<Integer> streamInteger = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13);
//        streamInteger.forEach(System.out::println);
        Stream<String> streamArray = Arrays.stream(new String[]{"Bayu","Talita","Kembara"});
            streamArray.forEach(System.out::println);
//! or
//        String[]array = new String {
//            "Bayu","Talita","Kembara"
//        };
//        Stream<String> streamArray2 = Arrays.stream(array);
    }

    @Test
    void testCreateFromCollection(){
        Collection<String> collections = List.of("Bayu","Talita","Kembara");
        Stream<String> stringStream = collections.stream();
        stringStream.forEach(System.out::println);
        Stream<String> stringStream2 = collections.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateStreamIterate(){
        Stream<String> stream1 = Stream.generate(()->"Bayu");
        Stream<String> stream2 = Stream.iterate(
                "Bayu",values -> values.toUpperCase()
        );
//        stream2.forEach(System.out::println);
        Stream<Integer> streamInt = Stream.iterate(
                1,value -> value + 1
        );
        streamInt.forEach(System.out::println);
    }



}
