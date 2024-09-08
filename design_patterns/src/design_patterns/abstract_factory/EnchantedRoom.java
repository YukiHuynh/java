package design_patterns.abstract_factory;

import generals.Room;

public class EnchantedRoom extends Room{

	private Spell spell;

	public EnchantedRoom(int roomNo, Spell spell) {
		super(roomNo);
		this.spell =spell;
	}

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	@Override
	public String toString() {
		return "EnchantedRoom [spell=" + spell + ", roomNumber=" + roomNumber + "]";
	}
	
}
