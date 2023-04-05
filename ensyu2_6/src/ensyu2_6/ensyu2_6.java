package ensyu2_6;

//Scannerクラスを使用可能にするためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu2_6
 * 概要    :演習2-6の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_6 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :底辺と高さを読み込み、その面積を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 三角形の面積を求めるという旨を表示し伝える
		System.out.println("三角形の面積を求めます。 ");
		
		// 底辺を表す実数値"bottomLength"の入力を促す
		System.out.print("底辺 : ");
		// double型の変数"bottomLength"に実数値を読み込む
		double bottomLength = standardInput.nextDouble();
		
		// 高さを表す実数値"height"の入力を促す
		System.out.print("高さ : ");
		// double型の変数"bottomLength"に実数値を読み込む
		double height = standardInput.nextDouble();
		
		// 三角形の面積(底辺*高さ/2)をひょうじする
		System.out.println("面積は" + bottomLength * height / 2 + "です。");
		
		//standardInputを閉じる
		standardInput.close();
	}
}
