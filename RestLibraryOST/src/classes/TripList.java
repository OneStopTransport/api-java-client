package classes;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TripList {
	@SerializedName("Objects")
	private List<Trip> objects = new ArrayList<Trip>();
	@SerializedName("Meta")
	private Meta meta;
	public TripList(List<Trip> objects, Meta meta) {
		super();
		this.objects = objects;
		this.meta = meta;
	}
	public List<Trip> getObjects() {
		return objects;
	}
	public void setObjects(List<Trip> objects) {
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
		return "TripList [objects=" + objects + ", meta=" + meta + "]";
	}	
}
