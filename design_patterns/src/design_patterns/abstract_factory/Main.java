package design_patterns.abstract_factory;

import generals.Maze;

public class Main {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		
		BombedMazeFactory bombedFactory = new BombedMazeFactory();
		Maze bombedMaze = game.createMaze(bombedFactory);
		
		EnchantedMazeFactory enchantedFactory = new EnchantedMazeFactory();
		Maze enchantedMaze = game.createMaze(enchantedFactory);
		
		System.out.println(bombedMaze.toString());
		System.out.println(enchantedMaze.toString());
	}
	
}
