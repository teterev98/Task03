public class DragonsAge {
    public static void main(String[] args) {

    }

    public static final int TWO_HEAD_LIMIT_AGE = 300;
    public static final int THREE_HEAD_LIMIT_AGE = 200;


    public static int getNumberOfHeads(int age) {
        int numberOfHeads = 0;

        if (age <= TWO_HEAD_LIMIT_AGE) {
            if (age < THREE_HEAD_LIMIT_AGE) {
                numberOfHeads = age * 3 + 3;
            } else {
                numberOfHeads = (THREE_HEAD_LIMIT_AGE * 3) +
                        3 + (age - THREE_HEAD_LIMIT_AGE) * 2;
            }
        } else {
            numberOfHeads = (THREE_HEAD_LIMIT_AGE * 3) + 3 +
                    TWO_HEAD_LIMIT_AGE * 2 + (age - TWO_HEAD_LIMIT_AGE);
        }
        return numberOfHeads;
    }

    public static int getNumberOfEyes(int age) {
        return getNumberOfHeads(age) * 2;
    }
}
