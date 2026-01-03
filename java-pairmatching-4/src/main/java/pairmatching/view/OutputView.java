package pairmatching.view;

public class OutputView {
    private static final String ASK_PAIRMATCHING_CHOICE = "기능을 선택하세요.\n"
            + "1. 페어 매칭\n"
            + "2. 페어 조회\n"
            + "3. 페어 초기화\n"
            + "Q. 종료";

    public void printFunctionSelection() {
        System.out.println(ASK_PAIRMATCHING_CHOICE);
    }

    public void printExceptionMessage(String message) {
        System.out.println(message);
    }
}
