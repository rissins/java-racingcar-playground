package utill;

import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    private final List<String> carArray;

    public Car(List<String> carArray) {
        this.carArray = carArray;

        for (int i = 0; i < this.carArray.size(); i++) {
//            System.out.println(InputView.getCarArray().get(i));
            if (this.carArray.get(i).length() > 5) {
                throw new IllegalArgumentException("5글자 이상 올 수 없습니다.");
            }

        }

    }

    public void printCarArray(){
        for (int i = 0; i < carArray.size(); i++) {
            System.out.println(carArray.get(i)+" : -");
        }
    }

    public List<String> getCarArray() {

        return carArray;
    }
}





