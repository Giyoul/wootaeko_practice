package pairmatching.controller;

import java.util.function.Supplier;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        while (true) {
            String mode = selectMode();

            if (mode.equals("Q")) break;
            if (mode.equals("1")) pairMatch();
            if (mode.equals("2")) pairCheck();
            if (mode.equals("3")) pairReset();
        }

    }

    public void pairMatch() {
        outputView.printCourseInfo();
    }

    public void pairCheck() {

    }

    public void pairReset() {

    }

    public String selectMode() {
        return retryUntilSuccess(() -> {
            outputView.printFunctionSelection();
            return inputView.readMode();
        });
    }

    private <T> T retryUntilSuccess(Supplier<T> action) {
        while (true) {
            try {
                return action.get();
            } catch (IllegalArgumentException e) {
                outputView.printExceptionMessage(e.getMessage());
            }
        }
    }
}
