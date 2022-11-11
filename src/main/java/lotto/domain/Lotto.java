package lotto.domain;

import java.util.*;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR]");
        }

        if (numbers.stream().distinct().count() != 6) {
            throw new IllegalArgumentException("[ERROR]");
        }
    }

    // TODO: 추가 기능 구현

    public Lotto(String StringNumbers) {
        List<Integer> numbers = new ArrayList<>();

        Arrays.stream(StringNumbers.split(","))
                .sorted().forEach(s -> numbers.add(Integer.parseInt(s)));

        validate(numbers);

        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
