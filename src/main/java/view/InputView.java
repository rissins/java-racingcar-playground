package view;

import java.util.Scanner;

public class InputView {

    private static Scanner SCANNER = new Scanner(System.in);

    public static String inputCarName(){
        return SCANNER.next();
    }

    public static int inputTryNumber(){
        return SCANNER.nextInt();
    }
}
