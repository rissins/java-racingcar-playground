package utill;


import view.InputView;

public class CarGameProcess {

//    public static void printCarDefaultList() {
//        for (int i = 0; i < InputView.getCarArray().size(); i++) {
//            System.out.println(InputView.getCarArray().get(i)+" : -");
////            randomCheckRun();
////            drawLine();
//        }
//    }

//    public static void startRace(){
//        printCarDefaultList();
//    }

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
        System.out.println();
    }
}

