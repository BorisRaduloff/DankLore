package Attacks;

import Main.Attack;
import Main.Entity;

public class SinisterStrike extends Attack{
	
	public SinisterStrike(Entity user, long dmg){
		setDeals(dmg);
		setName("Sinister Strike");
		setArmors(0);
		setHeals(0);
		setStun(false);
		setStunDuration(0);
	}
}
