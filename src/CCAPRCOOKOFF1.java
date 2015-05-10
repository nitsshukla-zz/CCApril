import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CCAPRCOOKOFF1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i3=0;i3<T;i3++){
			int n = scan.nextInt(),m=scan.nextInt(),k=scan.nextInt();
			List<Integer> l1 = new ArrayList<Integer>(); 
			for(int i=0;i<m;i++)
				l1.add(scan.nextInt());
			List<Integer> l2 = new ArrayList<Integer>(); 
			for(int i=0;i<k;i++)
				l2.add(scan.nextInt());
			List<Integer> l12 = new ArrayList<Integer>();List<Integer> l22 = new ArrayList<Integer>();
			for(int i=1;i<=n;i++)
			{
				if(!l1.contains(i))
					l12.add(i);
				if(!l2.contains(i))
					l22.add(i);
			}
			l1.retainAll(l2);l12.retainAll(l22);
			System.out.println(l1.size()+" "+l12.size());
			
		}
		scan.close();
	}

}
