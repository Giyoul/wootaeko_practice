package menu.domain;

public enum Menu {
    // Japanese
    GYUDON("규동", Cuisine.JAPANESE),
    UDON("우동", Cuisine.JAPANESE),
    MISOSIRU("스시", Cuisine.JAPANESE),
    KATSUDONG("가츠동", Cuisine.JAPANESE),
    ONIGIRI("오니기리", Cuisine.JAPANESE),
    HIGHRICE("하이라이스", Cuisine.JAPANESE),
    RAMEN("라멘", Cuisine.JAPANESE),
    OKONOMIYAKI("오코노미야끼", Cuisine.JAPANESE),

    // Korean
    GIMBAP("김밥", Cuisine.KOREAN),
    KIMCHI_STEW("김치찌개", Cuisine.KOREAN),
    SSAMBAP("쌈밥", Cuisine.KOREAN),
    SOYBEAN_PASTE_STEW("된장찌개", Cuisine.KOREAN),
    BIBIMBAP("비빔밥", Cuisine.KOREAN),
    KALGUKSU("칼국수", Cuisine.KOREAN),
    BULGOGI("불고기", Cuisine.KOREAN),
    TTEOKBOKKI("떡볶이", Cuisine.KOREAN),
    SPICY_PORK("제육볶음", Cuisine.KOREAN),

    // Chinese
//    중식: 깐풍기, 볶음면, 동파육, 짜장면, 짬뽕, 마파두부, 탕수육, 토마토 달걀볶음, 고추잡채
    KKANPUNGGI("깐풍기", Cuisine.CHINESE),
    STIR_FRIED_NOODLES("볶음면", Cuisine.CHINESE),
    DONGPAE_MEAT("동파육", Cuisine.CHINESE),
    JAJANGMYEON("짜장면", Cuisine.CHINESE),
    JJAMPPONG("짬뽕", Cuisine.CHINESE),
    MAPA_TOFU("마파두부", Cuisine.CHINESE),
    SWEET_AND_SOUR_PORK("탕수육", Cuisine.CHINESE),
    TOMATO_STIR_FIRED_EGGS("토마토 달걀볶음", Cuisine.CHINESE),
    RED_PEPPER_JAPCHAE("고추잡채", Cuisine.CHINESE),

    // Asian
    PAD_THAI("팟타이", Cuisine.ASIAN),
    KAO_PAD("카오 팟", Cuisine.ASIAN),
    NASI_GORENG("나시고렝", Cuisine.ASIAN),
    PINEAPPLE_FRIED_RICE("파인애플 볶음밥", Cuisine.ASIAN),
    PHO("쌀국수", Cuisine.ASIAN),
    TOM_YUM_KUNG("똠얌꿍", Cuisine.ASIAN),
    BANH_MI("반미", Cuisine.ASIAN),
    VIETNAMESE_SPRING_ROLLS("월남쌈", Cuisine.ASIAN),
    BUNCGA("분짜", Cuisine.ASIAN),

    // Italian
    LASAGNA("라자냐", Cuisine.ITALIAN),
    GRATIN("그라탱", Cuisine.ITALIAN),
    GNOCCHI("뇨끼", Cuisine.ITALIAN),
    QUICHE("끼슈", Cuisine.ITALIAN),
    FRENCH_TOAST("프렌치 토스트", Cuisine.ITALIAN),
    BAGUETTE("바게트", Cuisine.ITALIAN),
    SPAGHETTI("스파게티", Cuisine.ITALIAN),
    PIZZA("피자", Cuisine.ITALIAN),
    PANINI("파니니", Cuisine.ITALIAN);

    private final String menuName;
    private final Cuisine cuisine;

    Menu(String menuName, Cuisine cuisine) {
        this.menuName = menuName;
        this.cuisine = cuisine;
    }
}
