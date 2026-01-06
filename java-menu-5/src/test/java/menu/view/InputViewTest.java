package menu.view;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class InputViewTest {
    private static InputView inputView = new InputView();

    @Test
    void 코치들의_이름을_정상적으로_파싱한다() {
        // Given
        String names = "토미,제임스,포코";
        List<String> expect = List.of("토미", "제임스", "포코");

        // When
        List<String> response = inputView.parseCoachNames(names);

        // Then
        assertThat(response).isEqualTo(expect);
    }
}
