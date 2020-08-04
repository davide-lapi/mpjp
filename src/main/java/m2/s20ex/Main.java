package m2.s20ex;

public class Main {
	public static void main(String[] args) {
		Actor[] actors = { new Wizard("Tom") , new Wizard("Red") , new Wizard("Blu") , new Warrior("Rust")};

		for (Actor actor : actors) {
			System.out.println(actor);
		}
		for(int i = 0;i<actors.length ;i++) {
			for(int j = 0;j<actors.length ;j++) {
				if(i!=j) {
					boolean victory = false;
					if(actors[i] instanceof Warrior) {
						victory = ((Warrior)actors[i]).fight(actors[j]);
					} 
					if(actors[i] instanceof Wizard) {
						victory = ((Wizard)actors[i]).spell(actors[j]);
					}
					if(victory==true) {
						System.out.println(actors[i].getName() + " win against "+ actors[j].getName());
					}
					else {
						System.out.println(actors[j].getName() + " win against "+ actors[i].getName());
					}
					
				}
			}
			
			
		}
	}
}
