package DataStructureFramework.arrayList;
import java.util.*;

public class ArrayListOperator {
	 
    public static void insert(ArrayList<Integer> list, int x)
    {
        list.add(x);
         }
    public static void IncOrder(ArrayList<Integer> list)
    {
        Collections.sort(list);
        }
    public static void Search(ArrayList<Integer> list, int val)
    {
    	int flag =-1;
    	if(list.contains(val)) {
    		Collections.sort(list);
           int k=Collections.binarySearch(list,val);
          flag = 1;
          while(k!=0) {
        	  if(list.get(k-1)!=list.get(k)) 
        		break;  
        	  k--;
          }
          System.out.println(k);
    	}
        if(flag == -1){
            System.out.println("-1");
        }
      }
    public static void DecOrder(ArrayList<Integer> list)
    {
        Collections.reverseOrder();
    }
   public static void main(String[]args) {
    Scanner sc = new Scanner(System.in); 
	 System.out.println("Enter any number : ");
	int t=sc.nextInt();
	while(t-->0) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		int q=sc.nextInt();
		while(q-->0) {
			char ch=sc.next().charAt(0);
				if(ch=='a') {
					int x=sc.nextInt();
					ArrayListOperator.insert(list, x);
				}
				if(ch=='i') {
					ArrayListOperator.IncOrder(list);
					}
				if(ch=='s') {
					int val=sc.nextInt();
					ArrayListOperator.Search(list, val);
					}
				if(ch=='d') {
					ArrayListOperator.DecOrder(list);
				 }
			}
		}
	}
 }

