package baseball;

public class Carp extends Team {
	String[] names ={"田中","菊池","丸","エルドレット","新井","小窪","石原","鈴木","黒田"};


	//boolean attack = true;

	public void teamInformation() {

		this.teamName = "カープ";
		this.mainStadium = "マツダスタジアム";
		// System.out.println();
	}

	public Carp() {

		player = new Player[9];
		//names = new String[9] { "坂本", "阿部", "村田", "小林", "脇谷", "橋本", "立岡", "長野", "菅野" };

		for(int i = 0  ; i<9 ; i++ ){
			player [i] = new Player();
			player [i].setName (names [i]) ;

		}
	}

	public void attack() {

		this.outcount = 0;
		System.out.println("カープ");

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



