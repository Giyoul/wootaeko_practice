package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import pairmatching.domain.Course;

public class CourseTest {
    @Test
    void wrong_course_name_validation_test() {
        // Given
        String courseName = "안드로이드";

        // When
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Course.from(courseName)
        );

        // then
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 코스를 잘못 입력하셨습니다.");
    }

    @Test
    void 백엔드를_입력하면_BACK을_반환한다() {
        // Given
        String courseName = "백엔드";

        // When & Then
        assertThat(Course.from(courseName)).isEqualTo(Course.BACK);
    }
}
