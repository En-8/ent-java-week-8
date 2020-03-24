package ServiceClient;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("pages")
	private Pages pages;

	@JsonProperty("docs")
	private List<LotrBook> docs;

	@JsonProperty("items")
	private Items items;

	public void setPages(Pages pages){
		this.pages = pages;
	}

	public Pages getPages(){
		return pages;
	}

	public void setDocs(List<LotrBook> docs){
		this.docs = docs;
	}

	public List<LotrBook> getDocs(){
		return docs;
	}

	public void setItems(Items items){
		this.items = items;
	}

	public Items getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"pages = '" + pages + '\'' + 
			",docs = '" + docs + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}