public class Triangle {
    public double areaTriangle(int a, int b, int c) {
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            int p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        else return 0.0;

    }


}
