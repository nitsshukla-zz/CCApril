package com.cc.apr15;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class TF01 {
static ArrayList1 list; static boolean flag=false;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i3=0;i3<T;i3++){
			int n = scan.nextInt(),k=scan.nextInt();list = new ArrayList1();list.add(0,90012);flag=false;
			for(int i=0;i<n;i++){
				merge(list,scan.nextInt(),k);
			//System.out.println(list);
			}
		System.out.println(flag?1:0);
		}
	}

	private static void merge(ArrayList1 list, int nextInt, int k) {
		if(flag)
			return;
		List<Integer> list1 = new ArrayList<Integer>();ArrayList1 list2 = new ArrayList1();
		
		for(Integer i: list.list)
			list1.add(i+nextInt);
		int l=0,r=0;
		while(l!=list.size()||r!=list1.size()){
			if(flag)
				return;
			if(l==list.size()){
				list2.add(list1.get(r),k);
				r++;
			}
			else if(r==list1.size()){
				list2.add(list.get(l),k);
				l++;
			}
			else if(list.get(l)<list1.get(r)){
				list2.add(list.get(l),k);
				l++;
			}
			else {
				list2.add(list1.get(r),k);
				r++;
			}
		}
			list.clear();
			for(Integer i:list2.list)
				list.list.add(i);
	}

}
class ArrayList1{
	List<Integer> list;

	public ArrayList1() {
	list = new ArrayList<Integer>();
	}

	public ArrayList1(ArrayList1 list2) {
	list = new ArrayList<Integer>();
		for(Integer i:list2.list)
		list.add(i);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean contains(Object paramObject) {
		return list.contains(paramObject);
	}

	public Iterator<Integer> iterator() {
		return list.iterator();
	}

	public Object[] toArray() {
		return list.toArray();
	}

	public <T> T[] toArray(T[] paramArrayOfT) {
		return list.toArray(paramArrayOfT);
	}

	public boolean add(Integer paramE, int k) {
		if(paramE>k)
			return true;
		else if(paramE==k)
			TF01.flag=true;
		if(list.size()==0)
		return list.add(paramE);
		else if(list.get(list.size()-1)!=paramE)
			return list.add(paramE);
		else return true;
	}

	public boolean remove(Object paramObject) {
		return list.remove(paramObject);
	}

	public boolean containsAll(Collection<?> paramCollection) {
		return list.containsAll(paramCollection);
	}

	public boolean addAll(Collection<? extends Integer> paramCollection) {
		return list.addAll(paramCollection);
	}

	public boolean addAll(int paramInt,
			Collection<? extends Integer> paramCollection) {
		return list.addAll(paramInt, paramCollection);
	}

	public boolean removeAll(Collection<?> paramCollection) {
		return list.removeAll(paramCollection);
	}

	public boolean retainAll(Collection<?> paramCollection) {
		return list.retainAll(paramCollection);
	}

	public void clear() {
		list.clear();
	}

	public boolean equals(Object paramObject) {
		return list.equals(paramObject);
	}

	public int hashCode() {
		return list.hashCode();
	}

	public Integer get(int paramInt) {
		return list.get(paramInt);
	}

	public Integer set(int paramInt, Integer paramE) {
		return list.set(paramInt, paramE);
	}


	public Integer remove(int paramInt) {
		return list.remove(paramInt);
	}

	public int indexOf(Object paramObject) {
		return list.indexOf(paramObject);
	}

	public int lastIndexOf(Object paramObject) {
		return list.lastIndexOf(paramObject);
	}

	public ListIterator<Integer> listIterator() {
		return list.listIterator();
	}

	public ListIterator<Integer> listIterator(int paramInt) {
		return list.listIterator(paramInt);
	}

	public List<Integer> subList(int paramInt1, int paramInt2) {
		return list.subList(paramInt1, paramInt2);
	}

	@Override
	public String toString() {
		return "ArrayList1 [list=" + list + "]";
	}
	
}