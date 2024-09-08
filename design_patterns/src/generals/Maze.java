package generals;

import java.util.HashMap;
import java.util.Map;

public class Maze {

	private Map<Integer, Room> rooms = new HashMap<>();
	
	public Maze() {
	}
	
	public void addRoom(Room room) {
		rooms.put(room.roomNumber, room);
	}
	
	public Room roomNo(int roomNumber) {
		return rooms.get(roomNumber);
	}
	
}
