package Main;

public class Attack {
	private long deals;
	private long heals;
	private long armors;
	private boolean stun;
	private long stunDuration;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getStunDuration() {
		return stunDuration;
	}
	public void setStunDuration(long stunDuration) {
		this.stunDuration = stunDuration;
	}
	public long getDeals() {
		return deals;
	}
	public void setDeals(long deals) {
		this.deals = deals;
	}
	public long getHeals() {
		return heals;
	}
	public void setHeals(long heals) {
		this.heals = heals;
	}
	public long getArmors() {
		return armors;
	}
	public void setArmors(long armors) {
		this.armors = armors;
	}
	public boolean isStun() {
		return stun;
	}
	public void setStun(boolean stun) {
		this.stun = stun;
	}
}
