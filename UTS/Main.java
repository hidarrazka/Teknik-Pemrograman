package UTS;
class Hero {
	String nama;

	Hero(String nama){
		this.nama = nama;
	}

	void display(){
		System.out.println("\nName \t: " + this.nama);
	}

	void attack(Hero enemy){
		System.out.println("Menyerang");
	}
}
class HeroAgility extends Hero{
	String type = "Agility";

	HeroAgility(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}

	void showoff(){
		System.out.println("Saya hero Agility!!");
	} //ggg = ghaisan ganteng ganteng, hhh = haidar h
}
class HeroIntel extends Hero{
	String type = "intel";

	HeroIntel(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}
}
class HeroStrength extends Hero{
	String type = "Strength";

	HeroStrength(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}
}
public class Main {
	public static void main(String[] args) {
		Hero hero1 = new Hero("Ucup");
		HeroStrength hero2 = new HeroStrength("Otong");
		hero1.display();
		hero2.display();

		// Polymorphic
		Hero hero3 = new HeroAgility("Maria");
		hero3.display();


		// tidak bisa
		// HeroIntel hero4 = new Hero("Mahmud");
		// hero4.display();

		// Array list
		Hero[] kumpulanHero = new Hero[4];
		kumpulanHero[0] = hero1;
		kumpulanHero[1] = hero2;
		kumpulanHero[2] = hero3;


		kumpulanHero[0].display();
		kumpulanHero[1].display();
		kumpulanHero[2].display();

		// method calls


		// aplikasi
		hero1.attack(hero2);
		hero1.attack(hero3);


	}
}