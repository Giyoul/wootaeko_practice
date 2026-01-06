package menu.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import menu.domain.Menu;

public class InputView {

    public List<Menu> getCannotEat() {
        String menus = Console.readLine();
        List<Menu> response = Stream.of(menus.split(","))
                .map(Menu::from)
                .collect(Collectors.toList());
        return response;
    }

    public List<String> getCoachName() {
        String names = Console.readLine();
        List<String> parsedNames = parseCoachNames(names);
        return parsedNames;
    }

    public List<String> parseCoachNames(String names) {
        List<String> parsedCoachNames = List.of(names.split(","));
        numberOfCoachNames(parsedCoachNames);
        checkNameSize(parsedCoachNames);
        return parsedCoachNames;
    }

    public void numberOfCoachNames(List<String> coachNames) {
        if (coachNames.size() == 1) {
            throw new IllegalArgumentException("[ERROR] 코치는 최소 2명 이상 입력해야 합니다.");
        }
    }

    public void checkNameSize(List<String> coachNames) {
        for (String name : coachNames) {
            if (name.length() < 2 || name.length() > 4) {
                throw new IllegalArgumentException("[ERROR] 코치의 이름은 2글자 이상 4글자 이하여야 합니다.");
            }
        }
    }
}
