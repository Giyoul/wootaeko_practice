package menu.view;

public class OutputView {
    private static final String INIT_MESSAGE = "점심 메뉴 추천을 시작합니다.\n";
    private static final String PUT_COACH_NAME_GUIDE_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)";

    public void printInitMessage() {
        System.out.println(INIT_MESSAGE);
    }

    public void printCoachNameGuideMessage() {
        System.out.println(PUT_COACH_NAME_GUIDE_MESSAGE);
    }
}
