package ServiceClient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pages{

	@JsonProperty("next")
	private int next;

	@JsonProperty("current")
	private int current;

	@JsonProperty("total")
	private Object total;

	@JsonProperty("hasPrev")
	private boolean hasPrev;

	@JsonProperty("prev")
	private int prev;

	@JsonProperty("hasNext")
	private boolean hasNext;

	public void setNext(int next){
		this.next = next;
	}

	public int getNext(){
		return next;
	}

	public void setCurrent(int current){
		this.current = current;
	}

	public int getCurrent(){
		return current;
	}

	public void setTotal(Object total){
		this.total = total;
	}

	public Object getTotal(){
		return total;
	}

	public void setHasPrev(boolean hasPrev){
		this.hasPrev = hasPrev;
	}

	public boolean isHasPrev(){
		return hasPrev;
	}

	public void setPrev(int prev){
		this.prev = prev;
	}

	public int getPrev(){
		return prev;
	}

	public void setHasNext(boolean hasNext){
		this.hasNext = hasNext;
	}

	public boolean isHasNext(){
		return hasNext;
	}

	@Override
 	public String toString(){
		return 
			"Pages{" + 
			"next = '" + next + '\'' + 
			",current = '" + current + '\'' + 
			",total = '" + total + '\'' + 
			",hasPrev = '" + hasPrev + '\'' + 
			",prev = '" + prev + '\'' + 
			",hasNext = '" + hasNext + '\'' + 
			"}";
		}
}