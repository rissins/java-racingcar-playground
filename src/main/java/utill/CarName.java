package utill;

public class CarName {

    public static String[] splitString(String carList) {
        return carList.split(",");
    }

    public static void CheckNameLength(String carList) {
        String[] carArray = splitString(carList);
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].length() > 5) {
                throw new IllegalArgumentException("5글자 이상 올 수 없습니다.");
            }
        }
    }
}



