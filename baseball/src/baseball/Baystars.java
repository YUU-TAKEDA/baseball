package baseball;

public class Baystars extends Team {
	String[] names = { "桑原", "石川", "梶谷", "筒香", "ロペス", "エリアン", "倉本", "戸柱", "今永" };

	// boolean attack = true;

	public void teamInformation() {

		this.teamName = "ベイスターズ";
		this.mainStadium = "横浜スタジアム";
		// System.out.println();
	}

	public Baystars() {

		player = new Player[9];

		for(int i = 0  ; i<9 ; i++ ){
			player [i] = new Player();
			player [i].setName (names [i]) ;
		}
	}

	public void attack() {

		this.outcount = 0;
		System.out.println("ベイスターズの攻撃");

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
