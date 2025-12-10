
public class Main9_5 {

	public class wizard{
		String name;
		int hp;
		public void heal(Hero h) {
			h.hp += 10;
			System.out.println(h.name + "のHPを10回復された！");
		}

	}

}
