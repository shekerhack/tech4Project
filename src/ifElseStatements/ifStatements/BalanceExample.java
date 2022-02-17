package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;

        // you can use relational and logical operators
        // expression which is going to be true if balance is less than 0

        boolean isBalanceLessThan0 = balance < 0; //false
        boolean isBalanceEquals100 = balance == 0;  //false
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000;  //false

        // create an expression for checking if balance is not equals to -1

        boolean balanceIsNotEqual_1 = balance != -1;  //true



        if(balanceIsNotEqual_1){ // if this is true execute otherwise skip
            // if(statement, expression, boolean){} action my code to be executed
            //Statement means anything true or false

            System.out.println("Your balance is not equals to -1");

          //  if(balance < 0){ // if this is true execute otherwise skip
              //  System.out.println("Your balance is under 0");
        }
    }
}

