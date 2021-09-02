import utill.CarGameProcess;
import utill.Car;
import view.InputView;
import view.ResultView;

import java.util.List;

public class RacingCarApplication {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        ResultView.askCarName();
        Car car = new Car(inputView.inputCarName());
        ResultView.askTryNumber();
        inputView.inputTryNumber();
        ResultView.resultProcess();

        car.printCarArray();
//        inputView.inputCarName();
//        car.CheckNameLength(inputView.getCarArray());
//        CarGameProcess.printCarDefaultList();

    }
}
