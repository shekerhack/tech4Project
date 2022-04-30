package enums;

import javax.swing.text.StyledEditorKit;

public class Practice01 {
    /*

     */

    public static void main(String[] args) {
        Constants.Frequencies frequency = Constants.Frequencies.YEARLY;

        switch(frequency){
            case YEARLY:
                System.out.println("$38,400");
                break;
            case MONTHLY:
                System.out.println("$3,200");
                break;
            case BIWEEKLY:
                System.out.println("$1,600");
                break;
            case WEEKLY:
                System.out.println("$800");
                break;
            case DAILY:
                System.out.println("$160");
                break;
            case HOURLY:
                System.out.println("$20");
                break;
            default:
                throw new RuntimeException("There is no such frequency!");
        }
    }
}
