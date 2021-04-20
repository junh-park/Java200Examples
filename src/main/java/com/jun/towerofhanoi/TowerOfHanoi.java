package com.jun.towerofhanoi;

public class TowerOfHanoi {
	int[][] tower;
	int pole = 3;
	int disc = 3;
	public TowerOfHanoi(int disc) {
		this.disc = disc;
		tower = new int[disc][pole];
		for(int i = 0; i < disc; i++) {
			int x = 2*i + 1;
			tower[i][0] = x;
		}
	}
	
	public void moveDisc(int n, char from, char aux, char end) {
		if(n == 1) {
			System.out.println("Move a disc from " + from + " to " + end);
		}
		else {
			moveDisc(n-1, from, end, aux);
			moveDisc(1, from, aux, end);
			moveDisc(n-1, aux, from, end);
		}
	}
	
	public int[][] getTower() {
		return tower;
	}

	public int getPole() {
		return pole;
	}

	public static void main(String[] args) {
		TowerOfHanoi hanoi = new TowerOfHanoi(3);
		hanoi.moveDisc(2, 'A', 'B', 'C');
	}
}
