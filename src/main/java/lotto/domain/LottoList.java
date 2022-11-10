package lotto.domain;

import java.util.*;

import camp.nextstep.edu.missionutils.Randoms;

public class LottoList {
    private final List<Lotto> lottoList;

    public LottoList(int money) {
        validate(money);

        this.lottoList = createLottoList(money / 1000);
    }

    private List<Lotto> createLottoList(int size) {
        List<Lotto> lottoList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            List<Integer> list = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            list.sort(Comparator.naturalOrder());

            Lotto lotto = new Lotto(list);

            lottoList.add(lotto);
        }

        return lottoList;
    }

    private void validate(int money) {
        if (money % 1000 != 0) {
            throw new IllegalArgumentException();
        }
    }

    public List<Lotto> getLottoList() {
        return lottoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(lottoList.size()).append("개 구매하셨습니다.");

        lottoList.stream().map(Lotto::getNumbers)
                .forEach(integers -> sb.append("\n").append(integers));

        return sb.toString();
    }
}
