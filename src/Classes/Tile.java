package Classes;

public class Tile {
    private char letter;
    private int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return this.letter;
    }

    public int getValue() {
        return this.value;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void printTile() {
        System.out.println(this.letter + ": " + this.value);
    }



}