package generals;

public class Room extends MapSite{

	private MapSite[] sides = new MapSite[4];
	protected int roomNumber;
	
	public Room(int roomNo) {
		this.roomNumber = roomNo;
	}
	
	public MapSite getSide(Direction direction) {
		return sides[direction.ordinal()];
	}
	
	public void setSide(Direction direction, MapSite mapSite) {
		sides[direction.ordinal()] = mapSite;
	}

	@Override
	public void enter() {
		// Implementation for entering the room
	}

	public int getRoomNumber() {
		return roomNumber;
	} 
	
}
