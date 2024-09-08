package design_patterns.abstract_factory;

import generals.Direction;
import generals.Door;
import generals.Maze;
import generals.Room;

public class MazeGame {

	public Maze createMaze(MazeFactory factory) {
		Maze aMaze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door aDoor = factory.makeDoor(r1, r2);
		
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		
		r1.setSide(Direction.NORTH, factory.makeWall());
		r1.setSide(Direction.EAST, aDoor);
		r1.setSide(Direction.SOUTH, factory.makeWall());
		r1.setSide(Direction.EAST, factory.makeWall());
		
		r2.setSide(Direction.NORTH, factory.makeWall());
		r2.setSide(Direction.EAST, factory.makeWall());
		r2.setSide(Direction.SOUTH, factory.makeWall());
		r2.setSide(Direction.EAST, aDoor);
		
		return aMaze;
	}
	
}
