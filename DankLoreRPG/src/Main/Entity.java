package Main;

public class Entity {

	private long hp;
	private long dmg;
	private long armor;
	private boolean isStuned;
	private long uniqueID;
	private String name;
	private long xp;
	private long lvl;
	private long healingPwr;
	public Attack atck1;
	public Attack atck2;
	public Attack atck3;
	public Attack atck4;
	
	public void fight(Entity target,Attack atck){
		if(atck.getDeals()>target.getArmor()){
			target.setHp(target.getHp()-(atck.getDeals()-target.getArmor()));
		}
		if(atck.getDeals()<=target.getArmor()){
			target.setArmor(target.getArmor()-atck.getDeals());
		}
		if(atck.isStun()){
			//TODO ADD STUN
		}
		this.setHp(this.getHp()+atck.getHeals());
		this.setArmor(this.getArmor()+atck.getArmors());
	}
	
	public void giveInfo(){
		System.out.println("Name :");
		System.out.println(this.getName());
		System.out.println("Unique ID: ");
		System.out.println(this.getUniqueID());
		System.out.println("Level :");
		System.out.println(this.getLvl());
		System.out.println("Experience Points :");
		System.out.println(this.getXp());
		System.out.println("Damage :");
		System.out.println(this.getDmg());
		System.out.println("Health Points :");
		System.out.println(this.getHp());
		System.out.println("Armor :");
		System.out.println(this.getArmor());
		System.out.println("Healing Power :");
		System.out.println(this.getHealingPwr());
	}
	
	public long getHealingPwr() {
		return healingPwr;
	}

	public void setHealingPwr(long healingPwr) {
		this.healingPwr = healingPwr;
	}

	public void lvlUP(){
		lvl = lvl + 1;
		xp = 0;
	}
	
	public long getLvl() {
		return lvl;
	}
	public void setLvl(long lvl) {
		this.lvl = lvl;
	}
	public long getXp() {
		return xp;
	}
	public void setXp(long xp) {
		this.xp = xp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getHp() {
		return hp;
	}
	public void setHp(long hp) {
		this.hp = hp;
	}
	public long getDmg() {
		return dmg;
	}
	public void setDmg(long dmg) {
		this.dmg = dmg;
	}
	public long getArmor() {
		return armor;
	}
	public void setArmor(long armor) {
		this.armor = armor;
	}
	public boolean isStuned() {
		return isStuned;
	}
	public void setStuned(boolean isStuned) {
		this.isStuned = isStuned;
	}
	public long getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}
	public void setUniqueID() {
	        long minNumber = 1;
	        long maxNumber = 1000000;
			this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));
	}
	
	
}
