package pairmatching.domain;

import java.util.Arrays;

public enum Level {
    ONE_CAR("레벨1", "자동차경주"),
    ONE_LOTTO("레벨1", "로또"),
    ONE_BASEBALL("레벨1", "숫자야구게임"),
    TWO_SHOPPING("레벨2", "장바구니"),
    TWO_PAY("레벨2", "결제"),
    TWO_SUBWAY("레벨2", "지하철노선도"),
    THREE("레벨3", ""),
    FOUR_IMPROVE("레벨4", "성능개선"),
    FOUR_PUBLISH("레벨4", "배포"),
    FIVE("레벨5", "");


    private final String level;
    private final String mission;

    Level(String level, String mission) {
        this.level = level;
        this.mission = mission;
    }

    public static Level from(String levelName, String missionName) {
        return Arrays.stream(values())
                .filter(level -> level.level.equals(levelName) && level.mission.equals(missionName))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("[ERROR] 해당 레벨에 맞는 미션이 없습니다."));
    }
}
