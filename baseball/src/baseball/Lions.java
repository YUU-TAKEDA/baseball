package baseball;

public class Lions extends Team {

	String[] names ={"秋山","源田","浅村","中村","メヒア","田代","木村","炭谷","水口"};


	//boolean attack = true;

	public void teamInformation() {

		this.teamName = "ライオンズ";
		this.mainStadium = "西武ドーム";
		// System.out.println();
	}

	public Lions() {

		player = new Player[9];
		//names = new String[9] { "坂本", "阿部", "村田", "小林", "脇谷", "橋本", "立岡", "長野", "菅野" };

		for(int i = 0  ; i<9 ; i++ ){
			player [i] = new Player();
			player [i].setName (names [i]) ;

		}
	}

	public void attack() {

		this.outcount = 0;
		System.out.println("ライオンズの攻撃");

		while (outcount < 3) {
			int r = new java.util.Random().nextInt(100);

			//for (int names = 0; names < 9; names++);{
			System.out.println(TheBat + 1 + "番打者 " + player[TheBat].getName());
			player[TheBat].batting(r,this);
			run(player,player[TheBat].base,player[TheBat]);
			addTheBat();
			System.out.println();
				}
		for(int i = 0 ; i<player.length; i++){
			player[i].base = 0;
		}


				/* 確率 */
			}
		}

