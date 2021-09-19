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

    public  boolean randomCheckRun(){
        if ((int)(Math.random()*9) >= 4){
            return true;
        }

        return false;
    }

    public  void drawLine(){
        if (randomCheckRun()){
            System.out.print("-");
        }
//        System.out.println();
    }
}

