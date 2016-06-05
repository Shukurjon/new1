/**
 * 
 */
package knuth4;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author gu_
 */
@SuppressWarnings("rawtypes")
public class Permutation implements Iterator<ArrayList<MyObject>>{
	ArrayList<MyObject>	ali		=null;
	ArrayList<MyObject>	alix	=null;
	boolean				hasNext	=true;
	/**
	 * @param ali
	 */
	public Permutation(final ArrayList<MyObject> ali){
		this.ali=ali;
	}
	@Override
	public boolean hasNext(){
		return hasNext;
	}
	@Override
	public ArrayList<MyObject> next(){
		// pandit Narayan
		// ���� �������� �������� ������� �������� ��� � XIV ���� � �����
		/*
		 * L1. [��������.] �������� ������������ �1�2 ... an. L2. [����� j.]
		 * ���������� j; <� � � 1. ���� ctj > aJ+i, ��������� j �� 1 ��������,
		 * ���� �� ����������� ������� aj < clj+\. ��������� ��������, ���� j �
		 * 0. (� ���� ����� j �������� ���������� ��������, ��� �������� ����
		 * �������� ��� ������������, ������� � a\...aj. �������������,
		 * ����������������� ��������� ������������ �������� �������� aj.) L3.
		 * [��������� aj] ���������� I <� �. ���� aj > �/, ��������� I �� 1
		 * ��������, ���� �� ����������� ������� aj < �/. ����� �������� �������
		 * aj �/. (��������� aj+i > � � � > ��, ������� �\ �������� ����������
		 * ��������� ������ aj5 ������� ����� ��������� �� �\.. .aj-i �
		 * ������������. ����� ������� �� ����� Gj+i > � � � > ai-i > ai > aj >
		 * a/+i > � � � > an; � ����� ������ ����� ��-i > � � � > ai-i > a>j >
		 * Q>i > > � � � > an.) L4. [�������� aJ+i ...an.\ ���������� k <� j + 1
		 * � / <� �. �����, ���� k < /, �������� ������� �-� �/, ����������
		 * fc<�fc + 1,/*�/ � 1� ���������, ���� �� ���������� ������� k > I.
		 * ��������� � LI. <p> 1223, 1232, 1322, 2123, 2132, 2213, 2231, 2312,*
		 * 2321, 3122, 3212, 3221
		 */
		boolean flag=true;
		final ArrayList<MyObject> ali1=new ArrayList<>();
		if(flag){
			flag=false;
		}else{
			ali=alix;
		}
		for(final MyObject object:ali){
			ali1.add(object);
		}
		// L1
		// L2
		int j=ali.size()-2;
		MyObject aj=ali1.get(j);
		MyObject ajp1=ali1.get(j+1);
		while(aj.compareTo(ajp1)>=0){
			aj=ali.get(j);
			ajp1=ali.get(j+1);
			if(aj.compareTo(ajp1)<0){
				break;
			}
			j--;
			if(j==0){
				hasNext=false;
			}
		}
		// L3
		int l=ali.size()-1;
		while(aj.compareTo(ali1.get(l))>=0){
			l--;
		}
		swoop(j,l,ali1);
		System.out.println(ali1);
		// L4
		int k=j+1;
		l=ali.size()-1;
		while(k>l){
			swoop(k++,l--,ali1);
		}
		//
		ali=ali1;
		return ali;
	}
	private void swoop(final int k,final int l,final ArrayList<MyObject> ali){
		final MyObject mok=ali.get(k);
		final MyObject mol=ali.get(l);
		ali.set(k,mol);
		ali.set(l,mok);
	}
	@Override
	public void remove(){
		// TODO Auto-generated method stub
	}
}
