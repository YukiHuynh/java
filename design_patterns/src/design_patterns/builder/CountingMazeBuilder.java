package design_patterns.builder;

import generals.Maze;

public class CountingMazeBuilder extends MazeBuilder{

	private int doors;
	private int rooms;
	
	public CountingMazeBuilder() {
		doors = 0;
		rooms = 0;
	}

	@Override
	public void buildRoom(int n) {
		rooms++;
	}
	
	@Override
	public void buildDoor(int n1, int n2) {
		doors++;
	}
	
	public void getCount(int[] counts) {
		counts[0] = rooms;
		counts[1] = doors;
	}

	@Override
	public Maze getMaze() {
		return null;
	}
	
}
