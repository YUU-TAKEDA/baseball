package baseball;

public class Player {

	private String name;
	int BattingAverage;
	String Position;
	int base;

	void batting(int r, Team team) {
		base = 0;
		if (r < 5) {
			homerun();
			System.out.println("");
			base = 4;
			// team.point++;
		} else if (5 <= r && r < 8) {

			ThreeBaseHits();
			System.out.println("");
			base = 3;

		} else if (8 <= r && r < 16) {

			TwoBaseHits();
			System.out.println("");
			base = 2;
		} else if (16 <= r && r < 30) {

			SingleHits();
			System.out.println("");
			base = 1;
		} else {
			out();
			base = 0;
			team.outcount++;
			System.out.println(team.outcount + "アウト");
			System.out.println("");

		}
	}

	public void homerun() {
		System.out.println("ホームラン!!!!!!!!!!!");

	}

	public void ThreeBaseHits() {
		System.out.println("スリーベース!!!");
	}

	public void TwoBaseHits() {
		System.out.println("ツーベースヒット!!");
	}

	public void SingleHits() {
		System.out.println("ヒット!");
	}

	public void out() {
		System.out.println("アウト!!");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object o){
		if (this == o){return true;}
		if(o instanceof Player){
			Player p = (Player) o;
			if(this.name.equals(p.name)){
				return true;
			}

	}
		return false;

		}
	}
