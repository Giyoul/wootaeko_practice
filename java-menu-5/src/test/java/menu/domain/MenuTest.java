package menu.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MenuTest {
    @Test
    void 못먹는_메뉴들의_이름을_정상적으로_파싱한다() {
        // Given
        String input = "떡볶이";

        // When
        Menu response = Menu.from(input);

        // Then
        assertThat(response).isEqualTo(Menu.TTEOKBOKKI);
    }
}
