package ensyu6_19;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_19
 *  概要     :演習問題6-19の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.13
 */
public class Ensyu6_19 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :クラス数・各クラスの人数・全員の点数を読み込んで点数の合計点と平均点を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.13
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// クラス数の最大値を指定するint型の定数
		final int MAX_CLASS = 20;
		// 1クラスの人数の最大値を指定するint型の定数
		final int MAX_STUDENT = 50;
		// 点数の最大値を指定するint型の定数
		final int MAX_SCORE = 100;

		// 生徒数を格納する変数を0で初期化する
		int classValue = 0;
		
		// クラス数の最大値を表示する
		System.out.println("クラス数の最大値は " + MAX_CLASS + " 組");
		
		// 生徒数の最大値を表示する
		System.out.println("各クラスの生徒数の最大値は " + MAX_STUDENT + " 人");
		
		// 点数の最大値を表示する
		System.out.println("点数の最大値は " + MAX_SCORE + " 点 です\n");
		
		
		// クラス数として正の整数値が入力されるまで繰り返す
		do {
			// クラス数の入力を促す
			System.out.print("クラス数 : ");
			// 入力された値を"classValue"に代入する
			classValue = standardInput.nextInt();
			// "classValue"が0以下"MAX_CLASS"より大きい場合繰り返す
		}while (classValue <= 0 || classValue > MAX_CLASS);

		// 改行文字の出力
		System.out.println();

		// クラス数が"classNumber"であるint型の二次元配列を生成する。これは表示される配列aにあたる
		int[][] scoreValueArray = new int[classValue][];

		// 各クラスの人数を一時的に格納する変数を0で初期化する
		int studentValue = 0;
		
		// for文の制御に用いるscoreValueArrayの行数(クラス数)を表す変数を0で初期化する
		int classNumber = 0;
		// for文の制御に用いるscoreValueArrayの列数(人数)を表す変数を0で初期化する
		int studentNumber = 0;
		
		// すべての生徒数を格納する変数を0で初期化する
		int allStudentNumber = 0;
		
		// 各クラス、各生徒の点数を入力させる処理
		// 0で初期化されたint型の変数classNumberで制御されるfor文、scoreValueArrayのクラス数分繰り返す
		for(classNumber = 0; classNumber < scoreValueArray.length; classNumber++) {
			// 人数として正の整数値が入力されるまで繰り返す
			do {
				// 人数の入力を促す
				System.out.print((classNumber+1) + "組の人数 : ");
				// 入力された値を"studentValue"に代入する
				studentValue = standardInput.nextInt();
			// "studentValue"が0以下"MAX_STUDENT"より大きい場合繰り返す
			}while (studentValue <= 0 || studentValue > MAX_STUDENT);
			
			// "allStudentNumber"に各クラスの人数を加算していく
			allStudentNumber += studentValue;
			
			// "classNumber"行目に要素数が"studentNumber"である配列を生成する
			scoreValueArray[classNumber] = new int[studentValue];
			
			// 0で初期化されたint型の変数studentNumberで制御されるfor文、scoreValueArrayのクラス内の人数分繰り返す
			for(studentNumber = 0; studentNumber < scoreValueArray[classNumber].length; studentNumber++) {
				// 0以上の値が入力されるまで点数を入力させる処理をくりかえす
				do {
					// 点数の入力を促す
					System.out.print((classNumber+1) + "組" + (studentNumber+1) + "番の点数 : ");
					// scoreValueArray[classNumber][studentNumber]に入力された値を代入する
					scoreValueArray[classNumber][studentNumber] = standardInput.nextInt();
				// 入力された点数が負の値、"MAX_SCORE"より大きいなら繰り返す
				} while (scoreValueArray[classNumber][studentNumber] < 0 || scoreValueArray[classNumber][studentNumber] > MAX_SCORE);
			}
			// 各行ごとに確認しやすいように改行文字を出力する
			System.out.println();
		}
		
		// 各クラスの合計を一時的に保存する変数を0で初期化する
		int sumClass = 0;
		// 全ての生徒の合計点数を格納する変数を0で初期化する
		int sumAll = 0;
		
		// 表の項目を表示する
		System.out.println("  組 |   合計   平均");
		// 表の区切りを表示する
		System.out.println("-----+----------------");
		// 各クラスの合計、平均を表示していく処理
		// 0で初期化されたint型の変数classNumberで制御されるfor文、scoreValueArrayのクラス数分繰り返す
		for(classNumber = 0; classNumber < scoreValueArray.length; classNumber++) {
			// 0で初期化されたint型の変数studentNumberで制御されるfor文、scoreValueArrayのクラス内の人数分繰り返す
			for(studentNumber = 0; studentNumber < scoreValueArray[classNumber].length; studentNumber++) {
				// sumClassにscoreValueArray[classNumber][studentNumber]を加算していく
				sumClass += scoreValueArray[classNumber][studentNumber];
			}
			// "classNumber+1"組の行を表示する
			System.out.printf(" %d組 |%7d%7.1f\n",classNumber+1, sumClass, (double)sumClass/scoreValueArray[classNumber].length);
			// "sumAll"に"sumClass"を加算
			sumAll += sumClass;
			// "sumClass"を0にする
			sumClass = 0;
		}
		// 表の区切りを表示する
		System.out.println("----+-----------------");
		// 全ての合計と平均を表示する
		System.out.printf("  計 |%7d%7.1f\n", sumAll, (double)sumAll/allStudentNumber);
	}
}