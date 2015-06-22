package Attacks;

import Main.Attack;
import Main.Entity;

public class HolyLight extends Attack{
	
	public HolyLight(Entity user){
		setDeals(0);
		setName("Holy Light");
		setArmors(0);
		setHeals(user.getHealingPwr());
		setStun(false);
		setStunDuration(0);
	}
}
