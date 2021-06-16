public class Practice4 {
    public static void main(String[] args) {
        // Problem 1
        //String name = "Harish Jha";
        //name = name.toLowerCase();
        //System.out.println(name);

        // Problem 2
        //String text = "To My Bhai";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Harish");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harish,\n\tThis Java Practice is Superb.\nThanks Sir!";
        System.out.println(myLetter);
    }
}
