package ensyu13_3;

/*
 *  クラス名 :Ensyu13_3
 *  概要     :演習問題13-3の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class Ensyu13_3 {
	// 勝ちであることを表す定数
	public static final int WIN_VALUE = 1;
	// 引き分けであることを表す定数
	public static final int DROW_VALUE = 0;
	// 負けであることを表す定数
	public static final int LOSE_VALUE = -1;
	
	
	/*
	 * 関数名           :
	 * メソッドの説明   :じゃんけんの結果を求める
	 * パラメータの説明 :firstPlayer　一人目の手
	 *                   secondPlayer　二人目の手
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public static int winLose(int firstPlayer, int secondPlayer) {
		// じゃんけんの手の形の種類
		final int KIND_OF_HAND = 3;
		// 結果を格納する変数
		int winnerPlayer = 0;
		switch((firstPlayer - secondPlayer + KIND_OF_HAND) % KIND_OF_HAND) {
		// もし0なら
		case 0 : 
			// "winnerPlayer"をDROW_VALUEとする
			winnerPlayer = DROW_VALUE;
			// switch文を抜ける
			break;
		// もし1なら
		case 1 : 
			// "winnerPlayer"をLOSE_VALUEとする
			winnerPlayer = LOSE_VALUE;
			// switch文を抜ける
			break;
		// もし2なら
		case 2 : 
			// "winnerPlayer"をWIN_VALUEとする
			winnerPlayer = WIN_VALUE;
			// switch文を抜ける
			break;
		}
		// "winnerPlayer"を返却する
		return winnerPlayer;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成したPlayerクラス群の動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.26
	 */
	public static void main(String[] args) {
		// Playerクラスの配列を生成する
		Player[] player = {
				new HumanPlayer("山本"),
				new ComputerPlayer()
		};
		
		// それぞれの手の形を設定する
		for(Player playerHand : player) {
			// メソッドdecideHandTypeを呼び出す
			playerHand.decideHandType();
		}
		
		// それぞれの手の形を表示する
		for(Player playerHand : player) {
			// メソッドprintHandを呼び出す
			System.out.println(playerHand.toString());
		}
		
		// メソッドwinLoseを呼び出す
		int winOrLose = winLose(player[0].getHandType(), player[1].getHandType());
		
		// 改行する
		System.out.println();
		// もしwinOrLoseがWIN_VALUEなら
		if(winOrLose == WIN_VALUE) {
			// プレイヤーの勝ちであることを示す
			System.out.println(player[0].getplayerName() + "の勝ち");
		// もしwinOrLoseがDROW_VALUEなら
		} else if(winOrLose == DROW_VALUE) {
			// 引き分けであることを示す
			System.out.println("引き分け");
		// もしwinOrLoseがLOSE_VALUEなら
		} else if(winOrLose == LOSE_VALUE) {
			// プレイヤーの勝ちであることを示す
			System.out.println(player[0].getplayerName() + "の負け");
		}
	}
	

}
