
public class Cat extends Mammal implements Carnivore{

	public Cat(String eyeColor, String furColor, String age, String species, String name) {
		super(eyeColor, furColor, age, species, name);
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	void miaowing() {
		System.out.println(getName() + ": Miaow Miaow");
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " avlanıyor.");
		
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " yavruluyor.");
		
	}
	
	void lovesMouse() {
		System.out.println(getName() + " fareyi seviyor.");
	}
}
