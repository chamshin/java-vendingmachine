package vendingmachine;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void 동전을_생성한다(){
        Coin coin = new Coin(100);
        assertThat(coin).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(ints = {500, 100, 50, 10})
    void 동전은_500원_100원_50원_10원이_있다(int value){
        Coin coin = new Coin(value);
        assertThat(coin).isEqualTo(new Coin(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {499, 99, 9, 11})
    void 존재하지_않는_동전을_정의한다(int value){
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Coin(value));
    }

}