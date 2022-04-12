
public class SortingAlgorithmsPractice {

	public static void main(String[] args) {
		String[]a= {"mahesh","rahul","deepak","makhan","muskan","vinod"};
		int[]a= {43,76,89,64,2,2422,12,443,23,55,772,112,56,377,8444,66};
       bubbleSort(a);
       selectionSort(a);
       insertionSort(a);
       mergeSort(a);
       quickSort(a);
       heapSort(a);
       StringSort(a);
      for(int it:a) {
        	System.out.print(it+" ");
       }
	}
  
  // bubble sort
public static void bubbleSort(int[]a) {
	int n=a.length;
	for(int i=0;i<n;i++) {
		boolean sorted=true;
		for(int j=1;j<n-i;j++) {
			if(a[j-1]>a[j]) {
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				sorted=false;
			}
		}
		if(sorted)break;
	}
}
  
  //selection sort
public static void selectionSort(int[]a) {
	int n=a.length;
	for(int i=0;i<n;i++) {
		int mid=i;
		boolean flag=true;
		for(int j=i+1;j<n;j++) {
			if(a[j]<a[mid]) {
				mid=j;
				flag=false;
			}
		}
		if(flag)break;
		int temp=a[i];
		a[i]=a[mid];
		a[mid]=temp;
	}
}
  
  // insertion sort
public static void insertionSort(int[]a) {
	int n=a.length;
	int temp,j;
	for(int i=1;i<n;i++) {
		temp=a[i];
		j=i;
		while(j>0&&a[j-1]>temp) {
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
	}
}
  
  // merge sort
public static void mergeSort(int[]a) {
	int high=a.length-1;
	int low=0;
	mergeSortArr(a,low,high);
}
static void mergeSortArr(int[]a,int low, int high) {
	if(low<high) {
		int mid=(high+low)/2;
		mergeSortArr(a,low,mid);
		mergeSortArr(a,mid+1,high);
		mergeArray(a,low,mid,high);
	}
}
static void mergeArray(int[]a,int low, int mid , int high) {
	int[]left=new int[mid-low+1];
	int[]right=new int[high-mid];
	int n=left.length;
	int m=right.length;
	for(int i=0;i<n;i++) {
		left[i]=a[low+i];
	}
	for(int i=0;i<m;i++) {
		right[i]=a[mid+1+i];
	}
	int i=0;int j=0;int k=low;
	while(i<n&&j<m) {
		if(left[i]<right[j]) {
			a[k]=left[i];
			i++;
		}else {
			a[k]=right[j];
			j++;
		}
		k++;
	}
	while(i<n) {
		a[k++]=left[i++];
	}
	while(j<m) {
		a[k++]=right[j++];
	}
}
  
  // quick sort
public static void quickSort(int[]a) {
   int n=a.length;
   quickSortArray(a,0,n-1);
}
static void quickSortArray(int[]a,int low, int high) {
	int pivot=partition(a,low,high);
	if(low<pivot-1) {
		quickSortArray(a,low,pivot-1);
	}
	if(pivot<high){
		quickSortArray(a,pivot,high);
	}
}
static int partition(int[]a,int low, int high) {
	int pivot=a[(high+low)/2];
	while(low<high) {
		while(a[low]<pivot) {
			low++;
		}
		while(a[high]>pivot) {
			high--;
		}
		if(low<=high) {
			int temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
	}
	return low;
}  
  
  // heap sort
public static void heapSort(int[]a) {
   int n=a.length;
	buildHeap(a,n);
   for(int i=n-1;i>=0;i--) {
	   int temp=a[0];
	   a[0]=a[i];
	   a[i]=temp;
	   heapify(a,i,0);
   }
}
static void buildHeap(int[]a,int n) {
	for(int i=(n-1)/2;i>=0;i--) {
		heapify(a,n,i);
	}
}
static void heapify(int[]a,int n,int i) {
	int largest=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<n&&a[left]>a[largest]) {
		largest=left;
	}
	if(right<n&&a[right]>a[largest]) {
		largest=right;
	}
	if(largest!=i) {
		int temp=a[i];
		a[i]=a[largest];
		a[largest]=temp;
		heapify(a,n,largest);
	}
}
  
  // String sort
public static void StringSort(String[]a) {
	int n=a.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1;j++) {
		 if(a[j].compareTo(a[j+1])>0) {
			 String temp=a[j];
			 a[j]=a[j+1];
			 a[j+1]=temp;
		 }
		}
	}
	
}
}
