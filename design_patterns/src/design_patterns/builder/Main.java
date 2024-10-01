package design_patterns.builder;

import generals.Maze;

public class Main {

	public static void main(String[] args) {
		Maze maze;
		MazeGame game = new MazeGame();
		StandardMazeBuilder builder = new StandardMazeBuilder();
		
		game.createMaze(builder);
		maze = builder.getMaze();
		System.out.println(maze);
		
		int[] counts = new int[2];
		CountingMazeBuilder cbuilder = new CountingMazeBuilder();
		game.createMaze(cbuilder);
		cbuilder.getCount(counts);
		System.out.println("The maze has " + counts[0] + " rooms and " + counts[1] + " doors.");
	}

}
