package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;

public enum Cuisine {
    JAPANESE(1, "일식"),
    KOREAN(2, "한식"),
    CHINESE(3, "중식"),
    ASIAN(4, "아시안"),
    ITALIAN(5, "양식");

    private final int index;
    private final String cuisineName;

    Cuisine(int index, String cuisineName) {
        this.index = index;
        this.cuisineName = cuisineName;
    }

    public static Cuisine getRandomCuisine() {
        int index = Randoms.pickNumberInRange(1, 5);
        return Arrays.stream(Cuisine.values()).filter(cuisine ->
                cuisine.index == index)
                .findFirst()
                .get();
    }
}
