package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
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
            recommandMenus.add(menuRecommend(recommandMenus, cuisines.get(i)));
        }
//        String response = makeRecommendationResult(cuisines, recommandMenus);

        return "test";
    }

//    private void makeRecommendationResult(List<Cuisine> cuisines, List<List<Menu>> recommandMenus) {
//    }

    private List<Menu> menuRecommend(List<List<Menu>> recommandMenus, Cuisine cuisine) {
        List<Menu> menus = Menu.getCuisinMenu(cuisine);
        List<Menu> recommendMenu = new ArrayList<>();
        for (int i = 0; i < coaches.size(); i++) {
            while (true) {
                boolean flag = true;
                Menu menu = Randoms.shuffle(menus).get(0);
                for (List<Menu> categorizedMenus : recommandMenus) {
                    if (categorizedMenus.get(i) == menu) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    recommendMenu.add(menu);
                }
            }
        }
        return recommendMenu;
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
