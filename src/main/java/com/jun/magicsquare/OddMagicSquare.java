package com.jun.magicsquare;

public class OddMagicSquare extends MagicSquare {

	public OddMagicSquare(int n) {
		super(n);
	}

	public OddMagicSquare() {
		this(3);
	}


	@Override
	public void make() {
		int x = 0;
		int y = n / 2;
		for (int i = 1; i <= n * n; i++) {
			int temX = x;
			int temY = y;
			System.out.printf("(%d, %d)\t", x, y);
			magic[x][y] = i;

			if (x - 1 < 0) {
				x = n - 1;
			} else {
				x--;
			}

			if (y - 1 < 0) {
				y = n - 1;
			} else {
				y--;
			}
			if (magic[x][y] != 0) {
				x = temX + 1;
				y = temY;
			}
		}
	}
}
