package lotto;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class LottoList {
    private final List<Lotto> lottoList;

    public LottoList(int money) {
        validate(money);

        this.lottoList = createLottoList(money/1000);
    }

    private List<Lotto> createLottoList(int size) {
        List<Lotto> lottoList =  new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Lotto lotto = new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6));
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

}
