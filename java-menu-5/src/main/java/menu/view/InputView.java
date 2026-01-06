package menu.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {
    public List<String> getCoachName() {
        String names = Console.readLine();
        List<String> parsedNames = List.of(names.split(","));
        System.out.println(parsedNames);
        return null;
    }
}
