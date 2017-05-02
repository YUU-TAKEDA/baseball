package baseball;

public class Tigers extends Team {

	String[] names ={"北条","鳥谷","大和","ゴメス","マートン","金本","梅野","高山","メッセンジャー"} ;


	//boolean attack = false;

	public  void teamInformation(){

		this.teamName = "タイガース";
		this.mainStadium = "甲子園";
		//System.out.println();
		}

	public Tigers() {

		player = new Player[9];
		//names = new String[9] {"北条","鳥谷","大和","ゴメス","マートン","金本","梅野","高山","メッセンジャー"} ;

		for(int i = 0  ; i<9 ; i++ ){
			player [i] = new Player();
			player [i].setName (names [i]) ;

		}
	}


		public void attack() {

			this.outcount = 0;
			System.out.println("タイガースの攻撃");

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

