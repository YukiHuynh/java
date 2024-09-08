package design_patterns.abstract_factory;

import generals.Room;

public class RoomWithABomb extends Room{

	private boolean hasBomb;
	private boolean bombExploded;
	
	public RoomWithABomb(int roomNo) {
		super(roomNo);
		this.hasBomb = true;
		this.bombExploded = false;
	}
	
}
