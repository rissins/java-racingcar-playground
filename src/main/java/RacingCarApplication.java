import utill.Convert;
import view.InputView;
import view.ResultView;

public class RacingCarApplication {
    public static void main(String[] args) {
        ResultView.askCarName();
        Convert.splitString(InputView.inputCarName());
        ResultView.askTryNumber();
        InputView.inputTryNumber();


        }
    }


}
