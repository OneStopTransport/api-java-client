package classes;

import com.google.gson.annotations.SerializedName;

public class Route {
	
	@SerializedName("id")
	private long id;
	@SerializedName("route_short_name")
	private String short_name;
	
	public Route(long id, String short_name) {
		super();
		this.id = id;
		this.short_name = short_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	@Override
	public String toString() {
		return short_name;
	}
		
}
