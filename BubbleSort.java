public class BubbleSort implements SortingAlgorithm{
	public void sort(int [] a) {
		int temp;
		boolean swap=false;
		for(int x=0;x<a.length;x++){
			for(int y=1;y<a.length-x;y++){
				if(a[y-1]>a[y]){
					temp = a[y];
					a[y]=a[y-1];
					a[y-1]=temp;
					swap=true;
				}
			}
			if(swap=false) {
				break;
			}
		}
	}
}