package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {

        /* An annual average salary for an SDET in the Unites States is 90k. Write a Java program that calculates
           and prints the monthly and bi-weekly and weekly average amount that an SDETs makes in the United States.
         */
        // NOTE: Write the pseudo code first
        // 1. Create the varibales
        // 2. Do the equation
        // 3. Calculate monthly and bi-weekly and week average salary of SDET
        // 4. Print them out
        //Annual average salary = $90,000.00
        //1 year = 12 months
        //1 year = 52 weeks
        //Biweekly = every other week

        double avgSalary = 90_000.00; // _this sign for space and better reading = 90000.00
        double monSalary = avgSalary / 12;
        double biWeeklySal = avgSalary / 26;
        double weeklySal = avgSalary /52;

        System.out.println("Monthly salary = " + monSalary);
        System.out.println("Bi-weekly salary is = " + biWeeklySal);
        System.out.println("Weekly salary is = " + weeklySal);

    }
}
