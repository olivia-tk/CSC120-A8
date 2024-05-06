import java.util.Scanner;
//class to run the game

public class Game implements Contract{
    private String digResponse;
    private String examineResponse;
    private Scanner scanner;
    private String grabResponse;
    private String walkResponse;
    private String dropResponse;
    private String shrinkGrowResponse;
    private int x;
    private int y;


    public Game() {
        scanner = new Scanner(System.in); 
        System.out.println("You got a letter from your Primary School, inviting you to a reunion to dig up time capsules!");
        scanner.nextLine();
        System.out.println("Would you like to walk to your Primary School? Yes or No?");
        walkResponse = scanner.nextLine();
        walk(walkResponse);
        System.out.println("You are back at your Primary School. Does this remind you when you were a little kid?");
        scanner.nextLine();
        System.out.println("What would you like to use to dig up the time capsules?");
        digResponse = scanner.nextLine();
        use(digResponse);
        System.out.println("You found a box full of items! Would you like to examine them? Yes or No?");
        examineResponse = scanner.nextLine();
        examine(examineResponse);
        System.out.println("You found a letter! Would you like to grab it? Yes or No?");
        grabResponse = scanner.nextLine();
        grab(grabResponse);
        System.out.println("Wow! The card says, it can cast a spell on you to change size! Would you like to Shrink or Grow?");
        shrinkGrowResponse = scanner.nextLine();
        if ("Shrink".equals(shrinkGrowResponse)){
            shrink();
        }
        else{
            grow();
        }
        scanner.nextLine();
        System.out.println("You are tired from running around so much. I think you should rest.");
        scanner.nextLine(); 
        rest();
        //scanner.nextInt();
        System.out.println("As you are resting, you are starting to realize that you need to go home for a meeting. You must return to your own size!");
        scanner.nextLine();
        undo();
        //scanner.nextInt();
        System.out.println("You found another card that says, say the month and year and you can time travel to that time!");
        System.out.println("Which month do you want to time travel to? Answer in numbers.");
        //scanner.nextLine(); 
        x = scanner.nextInt();
        System.out.println("Which year do you want to time travel to?");
        //scanner.nextInt();
        y = scanner.nextInt();
        fly(x, y);
        //System.out.println("Time travelling!!");
        scanner.nextLine();
        System.out.println("And you're back to the present! How was your time travel?");
        scanner.nextLine();
        System.out.println("Cool! Well, I hope you enjoyed your time at the Primary School reunion. Sadly, it's time to go home now. Thanks for coming!");
    }

    public boolean walk(String direction) {
        walkResponse = direction;
        if ("Yes".equals(walkResponse)){
            System.out.println("Walking to your Primary School.");
        }
        else{
        System.out.println("Ok, that's too bad!");
        System.exit(0);
        }
        return true;
    }

    public void use(String item) {
        digResponse = item;
        System.out.println("Digging up the capsules using " + digResponse);

    }
    public void examine(String item) {
        examineResponse = item;
        if ("Yes".equals(examineResponse)){
            System.out.println("Examining items.");
        }
        else{
        System.out.println("Ok, that's too bad!");
        System.exit(0);
        }
    }

    public void grab(String item){
        grabResponse = item;
        if ("Yes".equals(grabResponse)){
            System.out.println("Grabbing the letter");
        }
        else{
            System.out.println("Ok, that's too bad!");
            System.exit(0);
        }
    }

    public String drop(String item) {
        dropResponse = item;
        if ("Yes".equals(dropResponse)){
            System.out.println("Amazing!");
        }
        else{
            System.out.println("Ok, that's too bad!");
            System.exit(0);
        }
        return item;
    }

    public Number shrink() {
        System.out.println("Wow! You are a little person!");
        System.out.println("Go run around and explore your primary school, as a little person:)");
        return 0;
    }
    public Number grow() {
        System.out.println("Wow! You are a giant!");
        System.out.println("Go run around and explore your primary school, as a Giant:)");
        return 0;
    }
    public void rest() {
        System.out.println("Here, have a cup of tea. Resting.");
    }

    public boolean fly(int x, int y) {
        System.out.println("Time traveling to the " + x + "th month of " + y);
        return true;
    }

    public void undo() {
        System.out.println("You are back to your normal size now!");
    }

    public static void main(String[] args) {
        Game game = new Game(); 
    }
}





