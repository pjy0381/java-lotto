package lotto;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.CompareLotto;
import lotto.domain.Lotto;
import lotto.domain.LottoList;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("구입금액을 입력해 주세요.");

        int money = Integer.parseInt(Console.readLine());
        LottoList lottoList = new LottoList(money);

        System.out.println(lottoList);

        System.out.println("당첨 번호를 입력해 주세요.");
        String numbers = Console.readLine();

        Lotto lotto_1st = new Lotto(numbers);

        System.out.println("보너스 번호를 입력해 주세요.");
        int bonusNumbers = Integer.parseInt(Console.readLine());

        CompareLotto compareLotto = new CompareLotto(lottoList, lotto_1st, bonusNumbers);
        System.out.println(compareLotto);

    }
}
