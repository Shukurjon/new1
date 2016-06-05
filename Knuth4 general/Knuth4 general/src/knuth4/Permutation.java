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
		// Ётот алгоритм придуман ѕандита Ќарайана еще в XIV веке в »ндии
		/*
		 * L1. [ѕосетить.] ѕосетить перестановку а1а2 ... an. L2. [Ќайти j.]
		 * ”становить j; <Ч п Ч 1. ≈сли ctj > aJ+i, уменьшать j на 1 повторно,
		 * пока не выполн€етс€ условие aj < clj+\. «авершить алгоритм, если j Ч
		 * 0. (¬ этом месте j €вл€етс€ наименьшим индексом, дл€ которого были
		 * посещены все перестановки, начина€ с a\...aj. —ледовательно,
		 * лексикографически следующа€ перестановка увеличит значение aj.) L3.
		 * [”величить aj] ”становить I <Ч п. ≈сли aj > а/, уменьшать I на 1
		 * повторно, пока не выполн€етс€ условие aj < а/. «атем помен€ть местами
		 * aj а/. (ѕоскольку aj+i > Х Х Х > ап, элемент а\ €вл€етс€ наименьшим
		 * элементом больше aj5 который может следовать за а\.. .aj-i в
		 * перестановке. ѕеред заменой мы имели Gj+i > Х Х Х > ai-i > ai > aj >
		 * a/+i > Х Х Х > an; а после замены имеем Ђя-i > Х Х Х > ai-i > a>j >
		 * Q>i > > Х Х Х > an.) L4. [ќбратить aJ+i ...an.\ ”становить k <Ч j + 1
		 * и / <Ч п. «атем, если k < /, помен€ть местами Ђ-ї а/, установить
		 * fc<Чfc + 1,/*Ч/ Ч 1и повтор€ть, пока не выполнитс€ условие k > I.
		 * ¬ернутьс€ к LI. <p> 1223, 1232, 1322, 2123, 2132, 2213, 2231, 2312,*
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
