package chap05;

public class Test5_2 {

	public static void main(String[] args) {
		//1.2
		int[] array = {1, 2, 3};
		//int[] array2; array2 = {1, 2, 3};
		
		//2. 3
		boolean bool = false;
		
		//3.
		int[][] arr = {
			{95},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		System.out.println(arr.length);  //3
		System.out.println(arr[2].length);  //5
		
		//4.
		int max = 0;
	    int[] a = {1, 5, 3, 8, 2};
	    
	    max = a[0];
	    for(int i=0; i<a.length; i++) {
	    	if(max < a[i])
	    		max = a[i];
	    }
	    System.out.println("max:" + max);
	    
	    //5.
	    int[][] score = {
    		{95, 86},
    		{83, 92, 96},
    		{78, 83, 93, 87, 88}
	    };
	    
	    int sum = 0;
	    double avg = 0.0;
	    int count = 0;
	    
	    for(int i=0; i<score.length; i++) {
	    	for(int j=0; j<score[i].length; j++) {
	    		sum += score[i][j];
	    		count++;
	    	}
	    }
	    System.out.println(count);  //개수
	    avg = (double)sum / count;   //기본 int형이므로 double로 강제 형변환
	    System.out.println("sum: " + sum);
	    System.out.println("avg: " + avg);
	}//main 닫기
}






