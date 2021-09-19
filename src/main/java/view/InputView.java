package view;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private final int defaultTryNumber;


    public InputView(int defaultTryNumber) {
        this.defaultTryNumber = defaultTryNumber;
    }

    public static List<String> inputCarName() {
        return Arrays.asList(SCANNER.next().split(","));
    }

    public static int inputTryNumber() {
        return SCANNER.nextInt();
    }


    public int getDefaultTryNumber() {
        return defaultTryNumber;
    }
}






