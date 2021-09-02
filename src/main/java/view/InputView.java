package view;

import utill.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner SCANNER = new Scanner(System.in);

    public List<String> inputCarName() {
        return Arrays.asList(SCANNER.next().split(","));
    }

    public int inputTryNumber() {
        return SCANNER.nextInt();
    }



}






