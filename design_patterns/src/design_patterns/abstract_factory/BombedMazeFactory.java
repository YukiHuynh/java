package design_patterns.abstract_factory;

import generals.Room;
import generals.Wall;

public class BombedMazeFactory extends MazeFactory{

	@Override
	public Wall makeWall() {
		return new BombedWall();
	}
	
	@Override
	public Room makeRoom(int n) {
		return new RoomWithABomb(n);
	}

	@Override
	public String toString() {
		return "BombedMazeFactory [makeWall()=" + makeWall() + ", makeMaze()=" + makeMaze() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
