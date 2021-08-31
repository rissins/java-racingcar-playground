import utill.CarGameProcess;
import utill.CarName;
import view.InputView;
import view.ResultView;

public class RacingCarApplication {
    public static void main(String[] args) {
        ResultView.askCarName();
        CarName.CheckNameLength(InputView.inputCarName());
        ResultView.askTryNumber();
        InputView.inputTryNumber();
        ResultView.resultProcess();
        CarGameProcess.printCarList();

    }
}
