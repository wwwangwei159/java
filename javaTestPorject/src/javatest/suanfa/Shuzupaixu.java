package javatest.suanfa;

public class Shuzupaixu {

	/**
	 * 插入数组排序
	 * @param arr
	 */
	public static void insertionSort(int[] arr){
		int in,out;
		for(out=1;out<arr.length;out++){
			int temp = arr[out];
			in = out;
			while(in>0&&arr[in-1]>temp){
				arr[in] = arr[in-1];
				in--;
			}
			arr[in] = temp;
		}
	}
	
	/**
	 * 希尔排序算法
	 * @param arr
	 */
	private static void shellSort(int[] arr) {
        int inner, outer;
        int temp;
        int h = 1;
        int nElem = arr.length;
        while (h <= nElem / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < nElem; outer++) {
                temp = arr[outer];
                inner = outer;
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
	
	/**
	 * 快速排序
	 * @param arr
	 * @param left
	 * @param right
	 */
    private static void recQuickSort(int arr [] ,int left,int right){
        if(right - left <= 0){
            return;
        }else{
            int pivot = arr[right];//一般使用数组最右边的元素作为枢纽
            int partition = partitionIt(arr, left, right, pivot);
            recQuickSort(arr, left, partition-1);
            recQuickSort(arr, partition+1, right);
        }
    }


    //划分
    private static int partitionIt(int[] arr ,int left,int right,int pivot){
        int leftPtr = left - 1;
        //int rightPtr = right + 1;
        int rightPtr = right ; //使用最右边的元素作为枢纽，划分时就要将最右端的数据项排除在外
        while(true){
            while(arr[++leftPtr] < pivot);
            while(rightPtr > 0 && arr[--rightPtr] > pivot);

            if(leftPtr >= rightPtr){
                break;
            }else{
                //交换leftPtr和rightPtr位置的元素
                int temp = arr[leftPtr];
                arr[leftPtr] = arr[rightPtr];
                arr[rightPtr] = temp;
            }
        }
        //交换leftPtr和right位置的元素
        int temp = arr[leftPtr];
        arr[leftPtr] = arr[right];
        arr[right] = temp;
        return leftPtr;//返回枢纽位置
    }
	
	
	/**
	 * 二分查找法
	 * @param arr
	 * @param start
	 * @param end
	 * @param searchKey
	 * @return
	 */
	public static int resursiveFind(int[] arr,int start,int end,int searchKey){
		if(start<=end){
			int middle = (start+end) >> 1;
			if(searchKey == arr[middle]){
				return middle;
			}else if(searchKey< arr[middle]){
				return resursiveFind(arr,start,middle-1,searchKey);
				
			}else{
				return resursiveFind(arr,middle+1,end,searchKey);
			}
			
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test1 = {7,6,3,9,8};
		
		insertionSort(test1);
		
		for(int out = 0;out<test1.length;out++){
			System.out.println(test1[out]);
			
		}
		
		int[] test2 = {1,3,7,9};
		
		System.out.print(resursiveFind(test2,0,3,9));
		
		
		//希尔排序测试
		int[] test3 = {5,4,11,9,66,54,4,6,45,65,34};
		
		shellSort(test3);
		
		for(int out = 0;out<test3.length;out++){
			System.out.println(test3[out]);
		}
		
		//希尔排序测试
		int[] test4 = {5,4,11,9,66,54,4,6,45,65,34};
		
		recQuickSort(test4,0,test4.length-1);
		
	}

}
