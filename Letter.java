public class Letter {
    // instance variables
    private String author;

    // constructor with a parameter for the sender of the letter
    public Letter(String sender) { 
        author = sender;
    }
    
    /* add your writeLetter method here: TO BE IMPLEMENTED IN #4 */
    public void writeLetter(String na) {
        greeting(na);
        specialMessage();
        closing();
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
        System.out.println("From, " + author);
    }
}