package design_patterns.factory_method;

import design_patterns.abstract_factory.DoorNeedingSpell;
import design_patterns.abstract_factory.EnchantedRoom;
import design_patterns.abstract_factory.Spell;
import generals.Door;
import generals.Room;

public class EnchantedMazeGame extends MazeGame{

	public EnchantedMazeGame() {
		super();
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
