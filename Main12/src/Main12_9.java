public class Hero extends Character {

	public static void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println(this.name + "敵に10ポイントのダメージをあたえた!");
		m.hp -= 10;

	}

}
