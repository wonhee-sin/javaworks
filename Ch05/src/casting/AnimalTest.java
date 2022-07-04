package casting;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 폅니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}


public class AnimalTest {
	
	public static ArrayList<Animal> animallist = new ArrayList<>();

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		//객체 생성
		animallist.add(new Human());
		animallist.add(new Eagle());
		animallist.add(new Tiger());
		
		for(Animal animal : animallist) {
			animal.move();
		}
		
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
		
	}
	
	public void testCasting() {
		
		for ( int i=0; i<animallist.size();i++) {
			Animal animal = animallist.get(i);
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.read();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
		}
	}
	

}
