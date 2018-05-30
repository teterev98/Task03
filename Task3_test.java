public class Task3_test {
    public static void main(String[] args) {
        testTriangle();
        testDragonsAge();
        testVowel();
        testMoodSensor();
        testNextDay();
    }

    public static void testTriangle() {
        System.out.println("***** Test Triangle *****");
        System.out.println(Triangle.isTriangle(0, 0, 0, 3, 5, 3));
        System.out.println(Triangle.isTriangle(4, 0, 0, 3, 5, 3));
    }

    public static void testDragonsAge() {
        System.out.println("***** Test DragonAge *****");
        System.out.println("147 years - " + DragonsAge.getNumberOfHeads(147) +
                " heads and " + DragonsAge.getNumberOfEyes(147) + " eyes");

    }

    public static void testVowel() {
        System.out.println("***** Test Vowel *****");
        System.out.println(Vowel.isAvowel('a'));
        System.out.println(Vowel.isAvowel2('b'));

    }

    public static void testMoodSensor() {
        System.out.println("***** Test MoodSensor *****");
        MoodSensor.outMood();
        MoodSensor.outMood();
        MoodSensor.outMood();
    }

    public static void testNextDay() {
        System.out.println("***** Test NextDay *****");
        NextDay.outNextDay(28, 2,1901);
        NextDay.outNextDay(28, 2,1600);
        NextDay.outNextDay(31, 12,1900);
    }
}

