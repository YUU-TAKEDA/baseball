package baseball;



public class Fitars extends Team {
	String[] names = { "西川", "松本", "近藤", "中田", "レアード", "大谷", "大野", "中島", "有原" };

	// boolean attack = true;

	public void teamInformation() {

		this.teamName = "ファイターズ";
		this.mainStadium = "札幌ドーム";
		// System.out.println();
	}

	public Fitars() {

		player = new Player[9];

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
