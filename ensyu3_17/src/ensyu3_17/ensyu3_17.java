package ensyu3_17;

// Randomクラスを使うためimportする
import java.util.Random;

/*
 * クラス名:ensyu3_17
 * 概要    :演習問題3-17の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.06
 */
public class ensyu3_17 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :0,1,2いずれかを乱数で生成し、それぞれに対応したメッセージ（じゃんけん）を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成
		Random random = new Random();
		
		switch (random.nextInt(3)) {  // 0～2のいずれかの値を乱数で生成しその値によって分岐させる
		  case 0 : System.out.println("グー");   break; // 0の場合はグーを表示しswich文を抜け出す
		  case 1 : System.out.println("チョキ"); break; // 1の場合はチョキを表示しswich文を抜け出す
		  case 2 : System.out.println("パー");   break; // 2の場合はパーを表示しswich文を抜け出す
		}
	}

}
