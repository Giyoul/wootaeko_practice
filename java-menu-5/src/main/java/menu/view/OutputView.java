package menu.view;

public class OutputView {
    private static final String INIT_MESSAGE = "점심 메뉴 추천을 시작합니다.\n";
    private static final String PUT_COACH_NAME_GUIDE_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String PUT_CANNOT_EAT_MENU_GUIDE_MESSAGE = "(이)가 못 먹는 메뉴를 입력해 주세요.";


    public void printInitMessage() {
        System.out.println(INIT_MESSAGE);
    }

    public void printCoachNameGuideMessage() {
        System.out.println(PUT_COACH_NAME_GUIDE_MESSAGE);
    }

    public void printExceptionMessage(String message) {
        System.out.println(message);
    }

    public void printCannotEatMenuGuideMessage(String name) {
        System.out.println(name + PUT_CANNOT_EAT_MENU_GUIDE_MESSAGE);
    }
}
