package utill;

public class CarName {

    public static String[] carArray;

    public static String[] splitString(String carNameInput) {
        return carNameInput.split(",");
    }

    public static void CheckNameLength(String carNameInput) {
        carArray = splitString(carNameInput);
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].length() > 5) {
                throw new IllegalArgumentException("5글자 이상 올 수 없습니다.");
            }
        }
    }


}



