package lotto.domain;

import camp.nextstep.edu.missionutils.Console;

public class LottoLauncher {
    public LottoLauncher() {
        LottoList lottoList = inputMoney();

        System.out.println(lottoList);

        Lotto lotto_1st = create1stLotto();
        int bonusNumbers = createBonusNumber();
        CompareLotto compareLotto = new CompareLotto(lottoList, lotto_1st, bonusNumbers);

        System.out.println(compareLotto);
    }

    public LottoList inputMoney(){
        System.out.println("구입금액을 입력해 주세요.");

        int money = Integer.parseInt(Console.readLine());

        return new LottoList(money);
    }

    public Lotto create1stLotto(){
        System.out.println("당첨 번호를 입력해 주세요.");

        String numbers = Console.readLine();

        return new Lotto(numbers);
    }

    public int createBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");

        return Integer.parseInt(Console.readLine());
    }
}
