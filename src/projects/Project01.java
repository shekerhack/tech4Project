package projects;

public class Project01 {
    public static void main(String[] args) {
        // Task 1. Store your name in a String variable called "name"
        //-Print the variable with a proper message
        //-EX/ My name 1 is = name
        //NOTE: Uppercases, lowercases and spaces are important

        String myName = "Sheker";
        System.out.println("My name is " + myName + ".");

        //Task 2. Create different char variables for each of your name letter and store them in separate variables as nameCharacter1, nameCharacter2 and so on.
        //-Print variables with proper messages
        //-EX/Name letter 1 is = nameCharacter1

        char nameCharacter1, nameCharacter2, nameCharacter3, nameCharacter4, nameCharacter5, nameCharacter6;
        nameCharacter1 = 'S';
        nameCharacter2 = 'h';
        nameCharacter3 = 'e';
        nameCharacter4 = 'k';
        nameCharacter5 = 'e';
        nameCharacter6 = 'r';
        System.out.println("My name is " + nameCharacter1 + nameCharacter2 + nameCharacter3 + nameCharacter4 + nameCharacter5 + nameCharacter6 + ".");

        //Task 3.Create different String variables for to store info like myFavMovie, myFavSong, myFavCity, myFavActivity, myFavSnack.
        //-Print variables with proper messages
        //-EX/My favorite movie is = myFavMovie

        String myFavMovie = "Interstellar";
        String myFavSong = "\"Hasbi Rabbi\" by Sami Yusuf";
        String myFavCity = "San Diego";
        String myFavActivity = "painting wooden cabinets, trims, and baseboards in the house";
        String myFavSnack = "apple";
        System.out.println("My favorite movie is " + myFavMovie + "." + "\n" + "Sometimes, I like to listen " + myFavSong + "," + " it gives me hope when I lose it. " +
                "\n" + "I have couple of favorite cities, but so far I like " + myFavCity + "." + "\n" + "Since we moved in a new house, my new favorite activity become " + myFavActivity + "." +
                "\n" + "My favorite snack is " + myFavSnack + ".");

        // Task 4. Create different int variables for to store info like myFavNumber, numberOfStatesIVisited, numberOfCountriesIVisited.
        //-Print variables with proper messages
        //-EX/My favorite number is = myFavNumber

        int myFavNumber, numberOfCountriesIVisited;
        myFavNumber = 12;
        numberOfCountriesIVisited = 2;
        System.out.println("My favorite number is " + myFavNumber + ".".concat("\nI have visited only " + numberOfCountriesIVisited + " countries.") );

        //Task 5. Create a boolean called amIAtSchoolToday
        //-Assign true to this variable if all you are at campus today
        //-Assign false to this variable if you are joining online today
        //-Print variable value with a proper message using println() method
        //EX/ I am at school today = amIAtSchoolToday

        boolean amIAtSchoolToday = true;
        boolean amIOnlineToday = false;
        System.out.println("I am at school today = " + amIOnlineToday);
        System.out.println("I am online today = " + amIAtSchoolToday);

        /*
        Task 6.Create a boolean called isWeatherNiceToday
        Assign true to this variable if it is above 60F today
        Assign false to this variable if it is below or equal to 60F today
        Print variable value with a proper message using println() method
        EX/ Weather is nice today = isWeatherNiceToday
        */

        boolean isWeatherColdToday = true;
        boolean isWeatherNiceToday = false;
        System.out.println("Weather is cold today = " + isWeatherColdToday);
        System.out.println("Weather is nice today = " + isWeatherNiceToday);

    }
}
