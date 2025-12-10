
public class Main10_11 {

	public static void main(String[] args) {
		public class Item {
			String name;
			int price;
			public Item(String name) {
				this.name = name;
				this.price = 0;
			}
			public Item (String name, int price) {
				this.name = name;
				this.price = price;
			}
		}
		public class Weapon extends Item {・・・}
        
		public class Main{
			public static void  main (String[] args) {
				Weapon w = new Weapon();
			}
		}

