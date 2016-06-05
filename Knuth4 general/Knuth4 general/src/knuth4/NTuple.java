/**
 * 
 */
package knuth4;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author gu_
 * @param <ali>
 */
public class NTuple<ali> implements Iterator<Object>{
	ArrayList<ArrayList<Object>>	symbolPlace	=null;
	ArrayList<Integer>				ali			=new ArrayList<>();
	ArrayList<Integer>				aliEnd		=new ArrayList<>();
	//
	public NTuple(final ArrayList<ArrayList<Object>> symbolPlace){
		this.symbolPlace=symbolPlace;
		final int n=symbolPlace.size();
		for(int i=0;i<n;i++){
			ali.add(0);
		}
		ali.set(0,-1);
		for(int i=0;i<n;i++){
			aliEnd.add(new Integer(symbolPlace.get(i).size())-1);
		}
	}
	/*
	 * (non-Javadoc)
	 * @see knuth4.Combo#next()
	 */
	@Override
	public ArrayList<Integer> next(){
		for(int i=0;i<ali.size();i++){
			final int n=ali.get(i).intValue()+1;
			if(n<=aliEnd.get(i)){
				ali.set(i,n);
				return ali;
			}else{
				ali.set(i,0);
			}
		}
		return null;
	}
	/*
	 * (non-Javadoc)
	 * @see knuth4.Combo#remove()
	 */
	@Override
	public void remove(){}
	@Override
	public boolean hasNext(){
		final int n=ali.size();
		for(int i=0;i<n;i++){
			if(!ali.get(i).equals(aliEnd.get(i))){ return true; }
		}
		return false;
	}
}
