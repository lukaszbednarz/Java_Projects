package book.page281;

public class PlayerTestDrive {
	public static void main(String[] args) {
		System.out.println(Player.playerCount);
		Player one = new Player("Rory McIlroy"); // err, Tiger Woods
		System.out.println(Player.playerCount);
	}
}
