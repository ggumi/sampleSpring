package hello.sampleSpring.samplespring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findAny {

    @Test
    public void createStream_whenFindAnyResultsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        System.out.println("ddd"+list);

        Optional<String> result = list.stream().findAny();


    }
}

