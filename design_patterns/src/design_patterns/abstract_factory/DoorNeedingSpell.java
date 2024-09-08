package design_patterns.abstract_factory;

import generals.Door;
import generals.Room;

public class DoorNeedingSpell extends Door{

	public DoorNeedingSpell(Room room1, Room room2) {
		super(room1, room2);
	}

}
