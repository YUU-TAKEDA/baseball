package baseball;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		/*
		 * SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒SSS"); // 現在日時を取得 Date date =
		 * new Date(); String stringDate = sdf.format(date);
		 * System.out.println(stringDate + "試合開始");
		 */

		/* スコアを表示 */

		/* Giantst Tigersを召喚 */
		try {
			Giants g = new Giants();
			Tigers t = new Tigers();
			Fitars f = new Fitars();
			Swallows s = new Swallows();
			Softbank sf = new Softbank();
			Carp c = new Carp();
			Baystars b = new Baystars();
			Dragons d = new Dragons();
			Eagles e = new Eagles();
			Buffaloes bu = new Buffaloes();
			Lions l = new Lions();
			Marines m = new Marines();

			System.out.println("");
			g.teamInformation();
			System.out.println(g);
			t.teamInformation();
			System.out.println(t);
			f.teamInformation();
			System.out.println(f);
			s.teamInformation();
			System.out.println(s);
			sf.teamInformation();
			System.out.println(sf);
			c.teamInformation();
			System.out.println(c);
			b.teamInformation();
			System.out.println(b);
			d.teamInformation();
			System.out.println(d);
			e.teamInformation();
			System.out.println(e);
			bu.teamInformation();
			System.out.println(bu);
			l.teamInformation();
			System.out.println(l);
			m.teamInformation();
			System.out.println(m);

			System.out.println("");
			Stadium.kyuujyou();
			Team abcd = new Team();

			abcd.teamSelect();
			Team[] team = new Team[3];

			if (abcd.team.equals("ジャイアンツ")) {
				team[0] = g;
			}
			if (abcd.team.equals("タイガース")) {
				team[0] = t;
			}
			if (abcd.team.equals("ファイターズ")) {
				team[0] = f;
			}
			if (abcd.team.equals("スワローズ")) {
				team[0] = s;
			}
			if (abcd.team.equals("ソフトバンク")) {
				team[0] = sf;
			}
			if (abcd.team.equals("カープ")) {
				team[0] = c;
			}
			if (abcd.team.equals("ベイスターズ")) {
				team[0] = b;
			}
			if (abcd.team.equals("ドラゴンズ")) {
				team[0] = d;
			}
			if (abcd.team.equals("イーグルス")) {
				team[0] = e;
			}
			if (abcd.team.equals("バッファローズ")) {
				team[0] = bu;
			}
			if (abcd.team.equals("ライオンズ")) {
				team[0] = l;
			}
			if (abcd.team.equals("マリーンズ")) {
				team[0] = m;
			}

			if (abcd.team1.equals("ジャイアンツ")) {
				team[1] = g;
			}
			if (abcd.team1.equals("タイガース")) {
				team[1] = t;
			}
			if (abcd.team1.equals("ファイターズ")) {
				team[1] = f;
			}
			if (abcd.team1.equals("スワローズ")) {
				team[1] = s;
			}
			if (abcd.team1.equals("ソフトバンク")) {
				team[1] = sf;
			}
			if (abcd.team1.equals("カープ")) {
				team[1] = c;
			}
			if (abcd.team1.equals("ベイスターズ")) {
				team[1] = b;
			}
			if (abcd.team1.equals("ドラゴンズ")) {
				team[1] = d;
			}
			if (abcd.team1.equals("イーグルス")) {
				team[1] = e;
			}
			if (abcd.team1.equals("バッファローズ")) {
				team[1] = bu;
			}
			if (abcd.team1.equals("ライオンズ")) {
				team[1] = l;
			}
			if (abcd.team1.equals("マリーンズ")) {
				team[1] = m;
			}

			// team[0] = g;
			// team[1] = t;
			// team[2] = f;

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒SSS");
			// 現在日時を取得
			Date date = new Date();
			String stringDate = sdf.format(date);
			System.out.println(stringDate + "試合開始");

			for (int i = 0; i < 9; i++) {
				attack(i, team);
			}

			System.out.println("");
			System.out.println("試合終了");
			System.out.println(team[0].point + " - " + team[1].point);

			if (team[0].point > team[1].point) {
				System.out.println("勝ったのは" + team[0].teamName);
			}
			if (team[0].point < team[1].point) {
				System.out.println("勝ったのは" + team[1].teamName);
			}
			if (team[0].point == team[1].point) {
				System.out.println("引き分け");
			}

			System.out.println("");
			SimpleDateFormat sdf１ = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒SSS");
			// 現在日時を取得
			Date date１ = new Date();
			String stringDate１ = sdf.format(date);
			System.out.println(stringDate + "試合終了");
		} catch (NullPointerException e) {
			System.out.println("エラーです");
			System.out.println("ただしいチーム名を入力してください");

		}
	}

	public static void attack(int c, Team[] t) {
		System.out.println("");
		System.out.print((c + 1) + "回表");
		t[0].attack();
		System.out.println("得点" + t[0].point);
		System.out.println(" ");
		System.out.print((c + 1) + "回裏");
		t[1].attack();
		System.out.println("得点" + t[1].point);
		System.out.println(" ");
	}

	//public static void main(String[] args) {
		//if(abcd.team.equals("マリーンズ")){
			//		team[0] = m;



}
