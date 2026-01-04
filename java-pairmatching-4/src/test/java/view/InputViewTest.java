package view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import pairmatching.view.InputView;

public class InputViewTest {
    private final InputView inputView = new InputView();

    @Test
    void 기능_입력_validation_예외_테스트() {
        // Given
        String input = "6";

        // When
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> inputView.validateMode(input)
        );

        assertThat(exception.getMessage()).isEqualTo("[ERROR] 잘못된 입력입니다.");
    }
}
