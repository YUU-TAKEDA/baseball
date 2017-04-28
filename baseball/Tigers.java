package baseball;

public class Tigers extends Team {

	String[] players ={"北条","鳥谷","大和","ゴメス","マートン","金本","梅野","高山","メッセンジャー"} ;

	int point;
	int outcount;

	boolean attack = false;

	void attack() {
		this.outcount = 0;
		System.out.println("タイガース");

		while (outcount < 3) {
			int r = new java.util.Random().nextInt(8);

			if (r == 0) {
				System.out.println("ホームラン");
				System.out.println("");
				point++;
			} else {
				System.out.println("アウト");
				outcount++;
				System.out.println(this.outcount + "アウト!");
				System.out.println("");
			}
		}
	}
}
