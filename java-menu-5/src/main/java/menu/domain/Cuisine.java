package menu.domain;

public enum Cuisine {
    JAPANESE("일식"),
    KOREAN("한식"),
    CHINESE("중식"),
    ASIAN("아시안"),
    ITALIAN("양식");

    private final String cuisineName;

    Cuisine(String cuisineName) {
        this.cuisineName = cuisineName;
    }
}
