package com.jun.towerofhanoi;

public class HanoiUtil {

	public static void moveDisc(TowerOfHanoi t, int n, char from, char aux, char end) {
		if (n == 1) {
			MoveAndShowTower(t, from, end);
		} else {
			moveDisc(t, n - 1, from, end, aux);
			MoveAndShowTower(t, from, aux);
			moveDisc(t, n - 1, aux, from, end);
		}
	}

	private static void MoveAndShowTower(TowerOfHanoi t, char from, char end) {
		int aa = 0;
		int ab = 1;
		switch (from) {
		case 'A':
			aa = 0;
			break;
		case 'B':
			aa = 1;
			break;
		case 'C':
			aa = 2;
			break;
		}

		switch (end) {
		case 'A':
			ab = 0;
			break;
		case 'B':
			ab = 1;
			break;
		case 'C':
			ab = 2;
			break;
		}

		System.out.println("Moved " + from + " bar to" + end);
		puts(t, aa, ab);
		showTower(t);
	}

	private static void showTower(TowerOfHanoi t) {
		int[][] tower = t.getTower();
		for (int i = 0; i < tower.length; i++) {
			System.out.print("[\t");
			for (int j = 0; j < tower[i].length; j++) {
				System.out.print(tower[i][j] + "\t");
			}
			System.out.println("]");
		}
		System.out.println("=====================================");
	}

	public static int hasTray(TowerOfHanoi t, int bar) {
		int no = -1;
		int[][] tower = t.getTower();
		for (int i = 0; i < tower.length; i++) {
			if (tower[i][bar] != 0) {
				no = i;
				break;
			}
		}
		return no;
	}

	private static void puts(TowerOfHanoi t, int barA, int barB) {
		int[][] tower = t.getTower();
		if (hasTray(t, barA) != -1) {
			change(tower, hasTray(t, barA), barA, hasTray(t, barB) - 1, barB);
		} else {
			change(tower, hasTray(t, barA), barA, tower.length - 1, barB);
		}
	}

	private static void change(int[][] tower, int aa, int ab, int ba, int bb) {
		System.out.println("(" + aa + ", " + ab + ")==>(" + ba + "," + bb + ") :");
		tower[ba][bb] = tower[aa][ab];
		tower[aa][ab] = 0;
	}
	
	public static void main(String[] args) {
		int tray = 4;
		TowerOfHanoi ha = new TowerOfHanoi(tray);
		HanoiUtil.showTower(ha);
		HanoiUtil.moveDisc(ha, tray, 'A', 'B', 'C');
	}

}
