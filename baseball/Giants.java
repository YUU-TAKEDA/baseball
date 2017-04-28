package baseball;

public class Giants extends Team {
	Player players;
	// {"坂本","阿部","村田","小林","脇谷","橋本","立岡","長野","菅野"};
	String[] names = { "坂本", "阿部", "村田", "小林", "脇谷", "橋本", "立岡", "長野", "菅野" };

	int point;
	int outcount;

	boolean attack = true;

	public Giants() {

		players = new Player();
	}

	void attack() {

		this.outcount = 0;
		System.out.println("ジャイアンツの攻撃");

		while (outcount < 3) {
			int r = new java.util.Random().nextInt(8);

			for (int names = 0; names < 9; names++)
				;
			{
				System.out.println("打者"  );
				if (r == 0) {
					players.homerun();
					System.out.println("");
					point++;
				} else {
					players.out();
					outcount++;
					System.out.println(outcount + "アウト");
					System.out.println("");
				}

				/* 確率 */
			}
		}

	}
}