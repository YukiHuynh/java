package design_patterns.abstract_factory;

import generals.Wall;

public class BombedWall extends Wall {

	private boolean damaged;
	
	public BombedWall() {
		this.damaged = false;
	}
	
}
