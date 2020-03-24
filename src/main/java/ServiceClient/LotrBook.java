package ServiceClient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LotrBook {

	@JsonProperty("name")
	private String name;

	@JsonProperty("_id")
	private String id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"DocsItem{" + 
			"name = '" + name + '\'' + 
			",_id = '" + id + '\'' + 
			"}";
		}
}