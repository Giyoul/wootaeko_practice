package menu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import menu.domain.Menu;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        getCoachInfo();
    }

    private void getCoachInfo() {
        outputView.printInitMessage();
        List<String> coachName = getCoachName();
        List<List<Menu>> cannotEatMenu = getCantEat(coachName);
    }

    private List<List<Menu>> getCantEat(List<String> coachName) {
        List<List<Menu>> cannotEat = new ArrayList<>();

        for (String name : coachName) {
             List<Menu> menus = retryUntilSuccess(() -> {
                outputView.printCannotEatMenuGuideMessage(name);
                return null;
            });
        }
        return null;
    }

    private List<String> getCoachName() {
        return retryUntilSuccess(() -> {
            outputView.printCoachNameGuideMessage();
            return inputView.getCoachName();
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
