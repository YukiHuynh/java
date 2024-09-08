package design_patterns.abstract_factory;

import generals.Door;
import generals.Room;

public class EnchantedMazeFactory extends MazeFactory{

	public EnchantedMazeFactory() {
	}
	
	@Override
	public Room makeRoom(int n) {
		return new EnchantedRoom(n, castSpell());
	}
	
	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}
	
	protected Spell castSpell() {
		return new Spell();
	}
	
}
