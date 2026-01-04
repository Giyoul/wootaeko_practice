package pairmatching.controller;

import java.util.function.Supplier;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        while (!selectMode().equals("Q")) {

        }

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
