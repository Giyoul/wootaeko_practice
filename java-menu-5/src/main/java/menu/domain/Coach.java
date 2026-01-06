package menu.domain;

import java.util.List;

public class Coach {
    private String name;
    private List<Menu> cantEat;

    public Coach(String name, List<Menu> cantEat) {
        this.name = name;
        this.cantEat = cantEat;
    }
}
