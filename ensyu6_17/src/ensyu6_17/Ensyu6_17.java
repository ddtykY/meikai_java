package ensyu6_17;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_17
 *  概要     :演習問題6-17の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.13
 */
public class Ensyu6_17 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :6人の2科目の点数を読み込んで、科目ごとの平均点、学生ごとの平均点を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.13
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 学生の人数を表すint型の定数
		final int STUDENT_VALUE = 6;
		
		// 科目数を表すint型の定数
		final int SUBJECT_VALUE = 2;
		// 科目番号に対応する科目を格納する配列
		String[] subjectName = {"国語", "数学"};
		
		
		// 6行2列のint型の二次元配列を生成
		int[][] scoreValueArray = new int[STUDENT_VALUE][SUBJECT_VALUE];
		
		// 各生徒の国語、数学それぞれの点数を読み込むための繰り返し
		// 0で初期化されたint型の変数studentNumberで制御されるfor文、STUDENT_VALUEの値分繰り返す
		for (int studentNumber = 0; studentNumber < STUDENT_VALUE; studentNumber++) {
			// もしstudentNumberが0でないなら
			if(studentNumber != 0) {
				// 改行文字の出力
				System.out.println();
			}
			// 何人目かを表示する
			System.out.println((studentNumber+1) + "人目");
			// 0で初期化されたint型の変数subjectNumberで制御されるfor文、SUBJECT_VALUEの値分繰り返す
			for(int subjectNumber = 0; subjectNumber < SUBJECT_VALUE; subjectNumber++) {
				// 0以上の値が入力されるまで点数を入力させる処理をくりかえす
				do {
					// subjectNumberに対応する科目への点数の入力を促す
					System.out.print(subjectName[subjectNumber] + " : ");
					// scoreValueArray[studentNumber][subjectNumber]に入力された数値を代入する
					scoreValueArray[studentNumber][subjectNumber] = standardInput.nextInt();
				// 入力された点数が負の値なら繰り返す
				} while (scoreValueArray[studentNumber][subjectNumber] < 0);
			}
		}
		
		// 科目ごとの平均点を表示する旨を示す
		System.out.println("\n科目ごとの平均点");
		
		// 科目合計を表す変数を0で初期化
		int sumSubject = 0;		
		// 科目ごとの平均点を求める繰り返し文
		// 0で初期化されたint型の変数subjectNumberで制御されるfor文、SUBJECT_VALUEの値分繰り返す
		for(int subjectNumber = 0; subjectNumber < SUBJECT_VALUE; subjectNumber++) {
			// 0で初期化されたint型の変数studentNumberで制御されるfor文、STUDENT_VALUEの行数分繰り返す
			for(int studentNumber = 0; studentNumber < STUDENT_VALUE; studentNumber++) {
				sumSubject += scoreValueArray[studentNumber][subjectNumber];
			}
			// subjectNumberに対応する科目の平均を表示する旨を示す
			System.out.print(subjectName[subjectNumber] + "の平均  : ");
			// scoreValueArray[][subjectNumber]の平均を表示する
			System.out.printf("%3.1f 点\n", (double)sumSubject / STUDENT_VALUE);
			// sumSubjectの値を0にする
			sumSubject = 0;
		}

		// 学生ごとの平均点を表示する旨を示す
		System.out.println("\n学生ごとの平均点");
		
		// 学生の合計を表す変数を0で初期化
		int sumStudent = 0;		
		// 学生ごとの平均点を求める繰り返し文
		// 0で初期化されたint型の変数studentNumberで制御されるfor文、STUDENT_VALUEの行数分繰り返す
		for(int studentNumber = 0; studentNumber < STUDENT_VALUE; studentNumber++) {
			// 0で初期化されたint型の変数subjectNumberで制御されるfor文、SUBJECT_VALUEの値分繰り返す
			for(int subjectNumber = 0; subjectNumber < SUBJECT_VALUE; subjectNumber++) {
				sumStudent += scoreValueArray[studentNumber][subjectNumber];
			}
			// 何人目の平均であるか表示する
			System.out.print((studentNumber+1) + "人目の平均 : ");
			// scoreValueArray[][subjectNumber]の平均を表示する
			System.out.printf("%3.1f 点\n", (double)sumStudent / SUBJECT_VALUE);
			// sumStudentの値を0にする
			sumStudent = 0;
		}
	}
}