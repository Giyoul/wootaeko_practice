package menu.service;

import java.util.ArrayList;
import java.util.List;
import menu.domain.Coach;
import menu.domain.Cuisine;
import menu.domain.Menu;

public class MenuService {
    private List<Coach> coaches;

    public void saveCoachInfo(List<Coach> coachInfo) {
        coaches = coachInfo;
    }


    public String recommendMenu() {
        List<Cuisine> cuisines = new ArrayList<>();
        List<List<Menu>> recommandMenus = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            cuisines.add(cuisineRecommend(cuisines));
        }

        return "test";
    }

    private Cuisine cuisineRecommend(List<Cuisine> cuisines) {
        while (true) {
            Cuisine recommended = Cuisine.getRandomCuisine();
            long count = cuisines.stream().filter(cuisine ->
                            cuisine.equals(recommended))
                    .count();
            if (count != 2) {
                return recommended;
            }
        }
    }
}
