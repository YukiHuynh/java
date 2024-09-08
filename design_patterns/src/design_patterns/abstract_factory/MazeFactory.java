package design_patterns.abstract_factory;

import generals.Door;
import generals.Maze;
import generals.Room;
import generals.Wall;

public class MazeFactory {

	public MazeFactory() {
	}

	public Maze makeMaze() {
		return new Maze();
	}
	
	public Wall makeWall() {
		return new Wall();
	}
	
	public Room makeRoom(int n) {
		return new Room(n);
	}
	
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
