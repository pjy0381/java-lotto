package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoListTest {

    @DisplayName("입력한 돈이 1000으로 나누어지지 않으면 예외가 발생한다.")
    @Test
    void createLottoListNotDivisionBy1000() {

        assertThatThrownBy(() -> new LottoList(1234))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력한 돈/1000 과 LottoList 사이즈는 같다.")
    @Test
    void createLottoListEqualSize() {
        LottoList result = new LottoList(9000);

        assertThat(result.getLottoList().size()).isEqualTo(9);
    }


}