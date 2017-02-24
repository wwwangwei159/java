package javatest.suanfa;

public class getBlockCnt {

	public static int[][] rang = new int[][] { { 0, 0, 1, 1 }, { 1, 0, 1, 1 },
			{ 1, 0, 0, 0 }, { 0, 1, 0, 1 } };
	// count the block,如果1周围都是0则计数为1，叫一个块,计数为1,如果1与相邻位置的其他数也为1，则这些相邻位置的所有数成为一个block也计数为1.
	// 0,0,1,1
	// 1,0,1,1
	// 1,0,0,0
	// 0,1,0,1
	

	//计数器
	public static int count = 0;

	public static int[][] blockCount(int[][] tempdata, int m, int n) {

		boolean continueflag = false;
		int[][] returnValue = new int[][] { { 0, 0 }, { 0, 0 }, { 0, 0 } };

		for (int i1 = 0; i1 < tempdata.length; i1++) {

			int x = tempdata[i1][0];
			int y = tempdata[i1][1];

			if (rang[x][y] == 1) {

				rang[x][y] = 0;

				if (x + 1 < m && rang[x + 1][y] != 0) {

					returnValue[0][0] = x + 1;
					returnValue[0][1] = y;

					continueflag = true;
				}

				if (y + 1 < n && rang[x][y + 1] != 0) {

					returnValue[1][0] = x;
					returnValue[1][1] = y + 1;

					continueflag = true;

				}

				if (x - 1 >= 0 && rang[x - 1][y] != 0) {

					returnValue[2][0] = x - 1;
					returnValue[3][1] = y;

					continueflag = true;

				}

				if (!continueflag) {

					count++;

				} else {

					blockCount(returnValue, m, n);

				}

			} else {
				return null;
			}

		}

		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i1 = 0; i1 < rang.length; i1++) {

			for (int j1 = 0; j1 < rang[i1].length; j1++) {

				System.out.println(i1 + " === i1  " + j1 + " ==j1 ");

				blockCount(new int[][] { { i1, j1 } }, 4, 4);

				System.out.println("count = " + count);

			}
		}

	}

}
