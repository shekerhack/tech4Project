package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args) {

        System.out.println("Lowercase Letters");
        for(int i = 97; i <= 122; i++){  // other way if(char i = 'a'; i >= 'z'; i++
            System.out.print((char)i + " ");            //(i) it is char
        }
        System.out.println("\nUppercase Letters");
        for(int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }

        System.out.println("\n------Second way of Nested Loop----\n");

        for (int i = 1; i <= 2; i++) {
            int start = 97;
            if(i == 1){
                //First iteration start point = 97 end = 122 = start+25
                System.out.println("Lowercase Letters");
            }
            else{
                //Second iteration start point = 65 end = 90
                System.out.println("Uppercase Letters");
                start = 65;
            }

            for (int j = start; j <= start+25; j++) {
                System.out.println((char)j);
            }
        }

    }
}
