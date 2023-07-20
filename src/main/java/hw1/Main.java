package hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("coffee", 3.1, 80, 0.25);
        HotDrink tea = new HotDrink("tea", 2.1,90, 0.25);

        System.out.println(coffee.toString());
        System.out.println(tea.toString());


    }
}