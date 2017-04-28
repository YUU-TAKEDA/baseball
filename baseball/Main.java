package baseball;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now + "試合開始");

		/* スコアを表示 */

		/* Giantst Tigersを召喚 */
		Giants g = new Giants();
		Tigers t = new Tigers();

		for (int i = 0; i < 9; i++) {
			System.out.println("");
			System.out.print((i + 1) + "回表");
			g.attack();
			System.out.println("得点" + g.point);
			System.out.println(" ");

			System.out.print((i + 1) + "回裏");
			t.attack();
			System.out.println("得点" + t.point);
			System.out.println(" ");
		}

		System.out.println("");
		System.out.println("試合終了");
		System.out.println(g.point + " - " + t.point);

		if(g.point > t.point){
		System.out.println("勝ったのは巨人");
		}
		if (g.point < t.point){
			System.out.println("勝ったのは阪神");
		}if (g.point == t.point){
			System.out.println("引き分け");
		}

		System.out.println("");
		Date finish = new Date();
		System.out.println("試合終了時間  " + finish);

	}
}