package mathClass;

public class FindMax {
    public static void main(String[] args) {
        int x = 8;
        int y = 20;
        int z = 6;
        int a = 34;
        int b = 123;

        int maxValueOfXY = Math.max(x, y); //char can be put
        int maxValueOfXYZ = Math.max(maxValueOfXY, z);
        int maxValueOfAB = Math.max(a,b);
        int maxOfEvery = Math.max(maxValueOfXYZ, maxValueOfAB);


        System.out.println("maxValueOfXY = " + maxValueOfXY);
        System.out.println("maxValueOfXYZ = " + maxValueOfXYZ);
        System.out.println("maxValueOfAB = " + maxValueOfAB);
        System.out.println("maxOfEvery = " + maxOfEvery);
    }
}
