package baseball;

public class Giants extends Team {

	String[] names ={"坂本","阿部","村田","小林","脇谷","橋本","立岡","長野","菅野"};


	//boolean attack = true;

	public void teamInformation() {

		this.teamName = "ジャイアンツ";
		this.mainStadium = "東京ドーム";
		// System.out.println();
	}

	public Giants() {

		player = new Player[9];
		//names = new String[9] { "坂本", "阿部", "村田", "小林", "脇谷", "橋本", "立岡", "長野", "菅野" };

		for(int i = 0  ; i<9 ; i++ ){
			player [i] = new Player();
			player [i].setName (names [i]) ;

		}
	}

	public void attack() {

		this.outcount = 0;
		System.out.println("ジャイアンツの攻撃");

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
