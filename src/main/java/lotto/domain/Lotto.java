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
                .sorted().forEach(number -> numbers.add(castInt(number)));

        validate(numbers);

        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private int castInt(String readLine) {
        try {
            return Integer.parseInt(readLine);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR]");
        }
    }
}
