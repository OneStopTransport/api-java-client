package classes;

import java.util.List;
import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class StopList {

	@SerializedName("Objects")
	private List<Stop> objects = new ArrayList<Stop>();
	@SerializedName("Meta")
	private Meta meta;
	
	public StopList(List<Stop> objects, Meta meta) {
		this.objects = objects;
		this.meta = meta;
	}
	
	public List<Stop> getObjects() {
		return objects;
	}

	public void setObjects(List<Stop> objects) {
		this.objects = objects;
	}
	
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@Override
	public String toString() {
		return "StopList [objects=" + objects + ", meta=" + meta + "]";
	}
		
}
