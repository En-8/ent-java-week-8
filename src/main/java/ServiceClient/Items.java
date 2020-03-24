package ServiceClient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items{

	@JsonProperty("total")
	private int total;

	@JsonProperty("end")
	private Object end;

	@JsonProperty("begin")
	private Object begin;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setEnd(Object end){
		this.end = end;
	}

	public Object getEnd(){
		return end;
	}

	public void setBegin(Object begin){
		this.begin = begin;
	}

	public Object getBegin(){
		return begin;
	}

	@Override
 	public String toString(){
		return 
			"Items{" + 
			"total = '" + total + '\'' + 
			",end = '" + end + '\'' + 
			",begin = '" + begin + '\'' + 
			"}";
		}
}