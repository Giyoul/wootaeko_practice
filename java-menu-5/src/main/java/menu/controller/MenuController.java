package menu.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import menu.domain.Coach;
import menu.domain.Menu;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final MenuService menuService = new MenuService();

    public void run() {
        List<Coach> coachInfo = getCoachInfo();
        menuService.saveCoachInfo(coachInfo);
        String recommend = menuService.recommendMenu();
    }

    private List<Coach> getCoachInfo() {
        outputView.printInitMessage();
        List<String> coachName = getCoachName();
        List<List<Menu>> cannotEatMenu = getCantEat(coachName);
        return makeCoachInfo(coachName, cannotEatMenu);
    }

    private List<Coach> makeCoachInfo(List<String> coachName, List<List<Menu>> cannotEatMenu) {
        List<Coach> coaches = new ArrayList<>();
        for (int i = 0; i < coachName.size(); i++) {
            coaches.add(new Coach(coachName.get(i), cannotEatMenu.get(i)));
        }
        return coaches;
    }

    private List<List<Menu>> getCantEat(List<String> coachName) {
        List<List<Menu>> cannotEat = new ArrayList<>();

        for (String name : coachName) {
            List<Menu> menus = getCannotEatMenus(name);
            cannotEat.add(menus);
        }
        return cannotEat;
    }

    public List<Menu> getCannotEatMenus(String name) {
        return retryUntilSuccess(() -> {
            outputView.printCannotEatMenuGuideMessage(name);
            return inputView.getCannotEat();
        });
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
