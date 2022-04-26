package singleton;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Driver.getDriver());

        for(int i = 0; i < 10; i++){
            System.out.println(Driver.getDriver());
        }
    }
}
