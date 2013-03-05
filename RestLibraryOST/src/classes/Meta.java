package classes;

import com.google.gson.annotations.SerializedName;

public class Meta {
	@SerializedName("next_page")
	private String next;
	public Meta(String next) {
		super();
		this.next = next;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Meta [next=" + next + "]";
	}

}
