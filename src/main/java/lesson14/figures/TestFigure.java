package lesson14.figures;

import java.util.ArrayList;

public class TestFigure {
    public static void main(String[] args) {

        ArrayList<Figure> figures= new ArrayList<>();

        for (Figure figure:figures){
            figure.calculateTheField();
        }
    }
    public static void showField(Figure figure){
        System.out.println(figure.calculateTheField());
    }
}
