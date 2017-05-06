package baseball;

public class Stadium {

	public static void kyuujyou(){


		System.out.println("球場を選んでください");
	System.out.println("東京ドーム、甲子園、札幌ドーム、神宮球場、福岡ヤフードーム、マツダスタジアム");
	System.out.println("横浜スタジアム、名古屋ドーム、ほっともっと、西武ドーム、千葉マリン");
	String stadium = new java.util.Scanner(System.in).nextLine();

	System.out.println("本日の球場は" + stadium);


	}
	}

