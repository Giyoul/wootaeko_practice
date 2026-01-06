package menu.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void 입력받은_코치가_1명_이하일경우_에러를_발생시킨다() {
        // Given
        List<String> input = List.of("토미");

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            inputView.numberOfCoachNames(input);
        });

        // Then
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 코치는 최소 2명 이상 입력해야 합니다.");
    }

    @Test
    void 입력받은_코치의_이름이_2글자_이하일경우_에러를_발생시킨다() {
        // Given
        List<String> input = List.of("토미", "제임스", "포");

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            inputView.checkNameSize(input);
        });

        // Then
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 코치의 이름은 2글자 이상 4글자 이하여야 합니다.");
    }

    @Test
    void 입력받은_코치의_이름이_4글자_이상일경우_에러를_발생시킨다() {
        // Given
        List<String> input = List.of("토미", "제임스", "포코코코코코코");

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            inputView.checkNameSize(input);
        });

        // Then
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 코치의 이름은 2글자 이상 4글자 이하여야 합니다.");
    }
}
