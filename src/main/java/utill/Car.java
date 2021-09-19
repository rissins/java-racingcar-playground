package utill;

import view.ResultView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Car {

    private static final int DEFAULT_DISTANCE = 1;

    private List<String> carArray;
    private String name;
    private int distance;

    public Car(List<String> carArray, int distnace) {
        for (int i = 0; i < carArray.size(); i++) {
            if (carArray.get(i).length() > 5) {
                throw new IllegalArgumentException("5글자 이상 올 수 없습니다.");
            }

        }

    }

    public void printCarArray() {
        CarGameProcess carGameProcess = new CarGameProcess();
        for (int i = 0; i < carArray.size(); i++) {
            System.out.print(carArray.get(i) + " : -");
            carGameProcess.randomCheckRun();
            carGameProcess.drawLine();
            ResultView.blankPrint();

        }
    }

    public void Start() {
        for (int i = 0; i < carArray.size(); i++) {
            System.out.println(carArray.get(i) + " : -");
        }
        System.out.println();
    }

    public List<String> getCarArray() {

        return carArray;
    }

    public void move() {


    }
}





