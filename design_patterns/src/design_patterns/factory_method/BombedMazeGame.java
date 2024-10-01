package design_patterns.factory_method;

import design_patterns.abstract_factory.BombedWall;
import design_patterns.abstract_factory.RoomWithABomb;
import generals.Room;
import generals.Wall;

public class BombedMazeGame extends MazeGame{

	public BombedMazeGame() {
		super();
	}
	
	@Override
	public Wall makeWall() {
		return new BombedWall();
	}
	
	@Override
	public Room makeRoom(int n) {
		return new RoomWithABomb(n);
	}
	
}
