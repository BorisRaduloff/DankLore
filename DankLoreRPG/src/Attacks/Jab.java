package Attacks;

import Main.Attack;
import Main.Entity;

public class Jab extends Attack{
		public Jab(Entity user,long dmg){
			setDeals(dmg);
			setName("Jab");
			setArmors(0);
			setHeals(0);
			setStun(false);
			setStunDuration(0);
		}
}
