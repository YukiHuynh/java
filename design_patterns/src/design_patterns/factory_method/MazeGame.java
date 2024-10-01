package design_patterns.factory_method;

import generals.Direction;
import generals.Door;
import generals.Maze;
import generals.Room;
import generals.Wall;

public class MazeGame {

	public Maze createMaze() {
		
		Maze maze = makeMaze();
		Room room1 = makeRoom(1);
		Room room2 = makeRoom(2);
		Door door = makeDoor(room1, room2);
		
		maze.addRoom(room1);
		maze.addRoom(room2);
		
		room1.setSide(Direction.NORTH, makeWall());
		room1.setSide(Direction.SOUTH, makeWall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.WEST, makeWall());
		
		room1.setSide(Direction.NORTH, makeWall());
		room1.setSide(Direction.SOUTH, makeWall());
		room1.setSide(Direction.EAST, makeWall());
		room1.setSide(Direction.WEST, door);
		
		return maze;
	}
	
	public Maze makeMaze() {
		return new Maze();
	}
	
	public Room makeRoom(int n) {
		return new Room(n);
	}
	
	public Wall makeWall() {
		return new Wall();
	}
	
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}

