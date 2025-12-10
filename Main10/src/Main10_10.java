
public class Main10_10 {

	public static void main(String[] args) {
		public class Hero {

	public Hero() {
	System.out.println("Heroのコンストラクタが動作");
			}
            }
	public class SuperHero extends Hero {
    System.out.println("SuperHeroのコンストラクタが動作");
    
		}

	}
	
	public class Main{
		public static void main(String[] args) {
			SuperHero sh = new SuperHero();
		}
	}

}
