 public class SelectionSort implements SortingAlgorithm{
 	void swap(int [] a,int i,int j){
 		int temp = a[i];
 		a[i] = a[j];
 		a[j] = temp;
 	}

 	int findSmallest(int [] a, int start){
 		int small = start;
 		for(int i=small+1;i<a.length;i++){
 			if(a[i]<a[small]){
 				small = i;
 			}
 		}
 		return small;
 	}

 	public void sort(int [] a){
 		for(int i=0;i<a.length;i++){
 			swap(a,i,findSmallest(a,i));
 		}
 	}

}