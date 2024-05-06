public interface Contract {

    void grab(String item);
    String drop(String item);
    void examine(String examineResponse);
    void use(String digResponse);
    boolean walk(String direction);
    boolean fly(int x, int y);
    Number shrink();
    Number grow();
    void rest();
    void undo();

}