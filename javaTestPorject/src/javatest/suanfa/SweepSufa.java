package javatest.suanfa;

public class SweepSufa {

	public static int[][] rang = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0 , 0 },
			{ 0, 0, 0, 0,0 }, { 0, 0, 0, 0 , 0 } ,{ 0, 0, 0, 0,0 }};
	
	static int setvalue = 0;
	
	//0,0,0,0,0
	//0,0,0,0,0
	//0,0,0,0,0
	//0,0,0,0,0
	//0,0,0,0,0
	//运行结果为：
	//01,02,03,04,05
	//16,17,18,19,06
	//15,24,25,20,07
	//14,23,22,21,08
	//13,12,11,10,09
	/**
	 * 
	 * @param rang
	 * @param m
	 * @param n
	 * @param priority 1横向运行，2竖向运行，3向左运行，4向上运行
	 */
	public static void bianli(int[][] rang,int m,int n,int priority){
		
		setvalue++;
		
		int x = 5;
		int y = 5;
		
		if(rang[m][n]==0){
			System.out.println(m+"--"+n);
			rang[m][n] = setvalue; //set 新值
			if(priority==1&&n+1<x&&rang[m][n+1]==0){ //第一优先级，向右做循环
				System.out.println("--------keep 1");
				bianli(rang,m,n+1,1);
			}else if(priority==1){
				System.out.println("--------turn 2");
				bianli(rang,m+1,n,2);
			}else if(priority==2&&m+1<y&&rang[m+1][n]==0){
				System.out.println("--------keep 2");
				bianli(rang,m+1,n,2);
			}else if(priority==2){
				System.out.println("--------turn 3");
				bianli(rang,m,n-1,3);
			}else if(priority==3&&n-1>=0&&rang[m][n-1]==0){
				System.out.println("--------keep 3");
				bianli(rang,m,n-1,3);
			}else if(priority==3){
				System.out.println("--------turn 4");
				bianli(rang,m-1,n,4);
			}else if(priority==4&&m-1>=0&&rang[m-1][n]==0){
				System.out.println("--------keep 4");
				bianli(rang,m-1,n,4);
			}else if(priority==4){
				System.out.println("--------trun 1");
				bianli(rang,m,n+1,1);
			}
			
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int path = 1;
		
		bianli(rang,0,0,1);


		for (int i = 0; i < rang.length; i++) {

			for (int j = 0; j < rang[i].length; j++) {

				System.out.println("-----------" + rang[i][j]);

			}

		}

	}

}
