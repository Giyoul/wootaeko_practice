package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import pairmatching.domain.Level;

public class LevelTest {
    @Test
    void 잘못된_레벨과_미션을_입력하면_에러가_발생한다() {
        // Given
        String level = "레벨2";
        String mission = "배포";

        // When
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Level.from(level, mission)
        );

        // then
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 해당 레벨에 맞는 미션이 없습니다.");
    }

    @Test
    void 제대로된_레벨과_미션을_입력하면_해당하는_Level을_반환한다() {
        // Given
        String level = "레벨2";
        String mission = "장바구니";

        // When & Then
        assertThat(Level.from(level, mission)).isEqualTo(Level.TWO_SHOPPING);
    }
}
