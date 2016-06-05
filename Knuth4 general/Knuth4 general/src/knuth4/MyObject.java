/**
 * 
 */
package knuth4;
/**
 * @author gu_
 * @param <T>
 */
public class MyObject<T> implements Comparable<T>{
	static int	index	=0;
	Object		o		=null;
	Integer		i		=null;
	/**
	 * 
	 */
	public MyObject(){}
	public MyObject(final Object o){
		this.o=o;
		i=index++;
	}
	public int compareTo(final MyObject arg0){
		return i.compareTo(arg0.i);
	}
	@Override
	public int compareTo(final T o){
		return 0;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return o.toString()+"->"+i+" ";
	}
}
