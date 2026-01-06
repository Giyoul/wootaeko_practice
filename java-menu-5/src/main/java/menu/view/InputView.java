package menu.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {
    public List<String> getCoachName() {
        String names = Console.readLine();
        List<String> parsedNames = parseCoachNames(names);
        return null;
    }

    public List<String> parseCoachNames(String names) {
        List<String> parsedCoachNames = List.of(names.split(","));
        numberOfCoachNames(parsedCoachNames);
        return parsedCoachNames;
    }

    public void numberOfCoachNames(List<String> coachNames) {
        if (coachNames.size() == 1) {
            throw new IllegalArgumentException("[ERROR] 코치는 최소 2명 이상 입력해야 합니다.");
        }
    }
}
