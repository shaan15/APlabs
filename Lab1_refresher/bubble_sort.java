import java.util.Scanner;

public class bubble_sort {
	void bubble(int arr[],int n){
		int i,j;
		for(i=0;i<(n-1);i++){
			for(j=0;j<(n-i-1);j++){
				if(arr[j] < arr[j+1]){
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int[] arr = new int[n];
		Scanner inp = new Scanner(System.in);
		for(i=0;i<n;i++){
			arr[i] = inp.nextInt();
		}
		bubble_sort obj = new bubble_sort();
		obj.bubble(arr, n);
		for(i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

}
