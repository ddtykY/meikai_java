// パッケージidに所属するクラスDateIdをインポート
import id.DateId;

public class Ensyu11_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成したパッケージid内のクラスDateIdの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.21
	 */
	public static void main(String[] args) {
		// 一つ目のインスタンスを生成する
		DateId firstUser = new DateId();
		// 二つ目のインスタンスを生成する
		DateId secondUser = new DateId();
		// 三つ目のインスタンスを生成する
		DateId thirdUser = new DateId();
		
		// 一つ目の識別番号を表示する
		System.out.println("firstUser の識別番号 : " + firstUser.getUserId());
		// 二つ目の識別番号を表示する
		System.out.println("secondUserの識別番号 : " + secondUser.getUserId());
		// 三つ目の識別番号を表示する
		System.out.println("thirdUser の識別番号 : " + thirdUser.getUserId());
	}
}
