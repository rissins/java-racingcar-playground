package utill;

import static utill.CarName.carArray;

public class CarGameProcess {

    public static void printCarList() {
        for (int i = 0; i < carArray.length; i++) {
            System.out.print(carArray[i]+" : ");
            randomCheckRun();
            drawLine();
        }
    }

    public static boolean randomCheckRun(){
        if ((int)(Math.random()*9) >= 4){
            return true;
        }

        return false;
    }

    public static void drawLine(){
        if (randomCheckRun()){
            System.out.println("-");
        }
    }
}

