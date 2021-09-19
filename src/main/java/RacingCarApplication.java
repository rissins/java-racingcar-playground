import utill.CarGameProcess;
import utill.Car;
import view.InputView;
import view.ResultView;

import java.util.List;

public class RacingCarApplication {
    public static void main(String[] args) {
        CarGameProcess carGameProcess = new CarGameProcess();

        ResultView.askCarName();


        Car car = new Car(InputView.inputCarName(), 0);
        Car car2 = new Car(InputView.inputCarName(), 0);
        Car car3 = new Car(InputView.inputCarName(), 0);

        ResultView.askTryNumber();
        InputView inputView = new InputView(InputView.inputTryNumber());
        ResultView.resultProcess();
        car.Start();
        car.printCarArray();
//        for (int i = 0; i < inputView.getDefaultTryNumber(); i++) {
//
//            ResultView.blankPrint();
//        }


    }
}
