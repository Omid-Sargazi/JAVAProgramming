package FunctionalProgramming.GameEntriesinanArray;

public class Scoreboard {
    private int numEntries;
    private GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

}
