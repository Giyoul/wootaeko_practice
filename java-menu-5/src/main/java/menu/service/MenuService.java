package menu.service;

import java.util.List;
import menu.domain.Coach;

public class MenuService {
    private List<Coach> coaches;

    public void saveCoachInfo(List<Coach> coachInfo) {
        coaches = coachInfo;
    }
}
