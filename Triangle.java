public class Triangle {
    public static void main(String[] args) {

    }

    public static double getSide(int x1, int y1, int x2, int y2) {
        return (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
    }

    public static String isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = getSide(x1, y1, x2, y2);
        double b = getSide(x2, y2, x3, y3);
        double c = getSide(x1, y1, x3, y3);
        String answer = "is not triangle ";
        if (a + b > c && a + c > b && b + c > a) {
            answer = "is triangle ";
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                answer = "is rectangular triangle";
            }
        }
        return answer;
    }
}
