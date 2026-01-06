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
        try {
            List<String> parsedCoachNames = List.of(names.split(","));

            return parsedCoachNames;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 구분자는 ,여야 합니다.");
        }
    }
}
