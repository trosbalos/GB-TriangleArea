import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class TriangleTest {

    @Test
    public void areaTriangle() {
        Triangle triangle = new Triangle();
        double area = triangle.areaTriangle(4,4,4);
        double area2 = triangle.areaTriangle(5,5,5);
        double area3= triangle.areaTriangle(6,7,8);
        double area4 = triangle.areaTriangle(2,3,10);


        Assertions.assertEquals(6.9,area,0.1);
        Assertions.assertEquals(7.4,area2,0.1);
        Assertions.assertEquals(15.4,area3,0.1);

        //Ниже я ничего лучше не придумал, кроме как сделать 0 если треугольник сделать не получится.
        Assertions.assertEquals(0.0,area4,0.1);

    }
}