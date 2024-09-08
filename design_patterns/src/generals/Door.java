package generals;

public class Door extends MapSite {

	private Room room1;
	private Room room2;
	private boolean isOpen;
	
	
	
	public Door(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
		this.isOpen = false;
	}

	@Override
	public void enter() {
		// Implementation for entering the door
	}

	public Room otherSideRoom(Room room) {
		if(room == room1) {
			return room2;
		} else {
			return room1;
		}
	}
	
}
