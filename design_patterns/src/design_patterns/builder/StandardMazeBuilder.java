package design_patterns.builder;

import generals.Direction;
import generals.Door;
import generals.Maze;
import generals.Room;
import generals.Wall;

public class StandardMazeBuilder extends MazeBuilder {
	
	public Maze currentMaze;

	public StandardMazeBuilder() {
		currentMaze = null;
	}
	
	@Override
	public void buildMaze() {
		currentMaze = new Maze();
	}

	@Override
	public Maze getMaze() {
		return currentMaze;
	}
	
	@Override
	public void buildRoom(int n) {
		if(currentMaze.roomNo(n) == null) {
			Room room = new Room(n);
			currentMaze.addRoom(room);
			room.setSide(Direction.NORTH, new Wall());
			room.setSide(Direction.SOUTH, new Wall());
			room.setSide(Direction.EAST, new Wall());
			room.setSide(Direction.WEST, new Wall());
		}
	}
	
	@Override
	public void buildDoor(int n1, int n2) {
		Room r1 = currentMaze.roomNo(n1);
		Room r2 = currentMaze.roomNo(n2);
		Door d = new Door(r1, r2);
		r1.setSide(commonWall(r1, r2), d);
		r1.setSide(commonWall(r2, r1), d);
	}
	
	private Direction commonWall(Room r1, Room r2) {
		if(r1.getRoomNumber() < r2.getRoomNumber()) {
			return Direction.EAST;
		} else {
			return Direction.WEST;
		}
	}
	
}
