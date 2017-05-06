package baseball;

public class Team {

	String teamName;
	String mainStadium;

	int point;
	int outcount;
	Player[] player ;
	int TheBat;
String team;
String team1;

	public String toString(){
		return "チーム名" + this.teamName + "本拠地" + mainStadium;
				}

	public  void teamSelect(){
		System.out.println("チームを選んでください");
		System.out.println("1:ジャイアンツ　2：タイガース　3:ファイターズ　4:スワローズ　5:ソフトバンク");
		System.out.println("6:カープ　7:ベイスターズ　8:ドラゴンズ　9:イーグルス　10:バッファローズ");
		System.out.println("11:ライオンズ　12:マリーンズ");
		 team = new java.util.Scanner(System.in).nextLine();

		System.out.println("1:ジャイアンツ　2：タイガース　3:ファイターズ　4:スワローズ　5:ソフトバンク");
		System.out.println("6:カープ　7:ベイスターズ　8:ドラゴンズ　8:ドラゴンズ　9:イーグルス　10：バッファローズ");
		System.out.println("11:ライオンズ　12:マリーンズ");
		 team1 = new java.util.Scanner(System.in).nextLine();
		System.out.println("本日の試合は" + team + "対" + team1);

//TheBat は0が一番、8が9番バッター
	}
public void attack(){

}

public void addTheBat(){
	TheBat++;
	if(TheBat == 9){
		TheBat = 0;
	}

}

public void run(Player [] player,int battingreslut,Player p){
for(int i = 0; i<player.length; i++){
	if(player[i].base >= 1&& player[i].base <= 3&& p.equals(player [i]) == false){
		player[i].base = player[i].base + battingreslut;
				}
if( player[i].base >= 4){
	System.out.println("得点");
	point++;
	player[i].base = 0;
}
}


}
public String  getteam(){
	return this.team;



}
public String  getteam1(){
	return this.team1;

	}

}