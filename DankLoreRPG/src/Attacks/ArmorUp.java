package Attacks;

import Main.Attack;
import Main.Entity;

public class ArmorUp extends Attack{
	public ArmorUp(Entity user, long armor){
		setDeals(0);
		setName("Armor Up");
		setArmors(armor);
		setHeals(0);
		setStun(false);
		setStunDuration(0);
	}
}
