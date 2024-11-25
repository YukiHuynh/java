package chapter3.using_array;

public class Scoreboard {

	private int numEntries = 0;
	private GameEntry[] board;

	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}

	public void add(GameEntry entry) {
		int newScore = entry.getScore();

		if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
			if (numEntries < board.length) {
				numEntries++;
			}
			int j = numEntries - 1;
			while (j > 0 && board[j - 1].getScore() < newScore) {
				board[j] = board[j - 1];
				j--;
			}
			board[j] = entry;
		}
	}

}
