package Main;
import java.util.Scanner;

import Attacks.ArmorUp;
import Attacks.HolyLight;
import Attacks.Jab;
import Attacks.SinisterStrike;


public class Main {
	
	public static Player p = new Player();
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		byte choice = 0;
		System.out.println("Hello and welcome to the DankLoreRPG!");
		System.out.println("Chose your starting class : ");
		System.out.println("[1]Tank");
		System.out.println("[2]Damage");
		System.out.println("[3]Priest");
		if(userInput.hasNextByte()){
			choice = userInput.nextByte();
		}
		switch(choice){
			case 1:
				System.out.println("You chose Tank");
				p.setHp(120);
				p.setDmg(10);
				p.setArmor(20);
				p.setStuned(false);
				p.setUniqueID();
				p.setXp(0);
				p.setLvl(1);
				p.setHealingPwr(10);
				break;
			case 2:
				System.out.println("You chose Damage");
				p.setHp(90);
				p.setDmg(25);
				p.setArmor(0);
				p.setStuned(false);
				p.setUniqueID();
				p.setXp(0);
				p.setLvl(1);
				p.setHealingPwr(10);
				break;
			case 3:
				System.out.println("You chose Priest");
				p.setHp(10);
				p.setDmg(20);
				p.setArmor(10);
				p.setStuned(false);
				p.setUniqueID();
				p.setXp(0);
				p.setLvl(1);
				p.setHealingPwr(25);
				break;
		
		}
		Jab jab = new Jab(p,p.getDmg() + p.getLvl()*2 );
		ArmorUp armorUp = new  ArmorUp(p, 5 + p.getLvl()*3);
		SinisterStrike sinStrike = new SinisterStrike(p, p.getDmg() +p.getLvl());
		HolyLight holyLight = new HolyLight(p);
		System.out.println("What is your name Adventurer?");
		p.setName(userInput.next());

		System.out.println("OK, so for a quick overview this is you:");
		p.giveInfo();
		System.out.print(p.getName() + ", you will experience great adventures and fight evil. You might be the one that will exterminate \n all evil and its' roots from this world! \n I wish you best of luck!!!");
		p.atck1 = jab;
		switch(choice){
			case 1:
				p.atck2 = armorUp;
				break;
			case 2:
				p.atck2 = sinStrike; 
				break; 
			case 3:
				p.atck2 = holyLight;
			
		}
		
	}
}
