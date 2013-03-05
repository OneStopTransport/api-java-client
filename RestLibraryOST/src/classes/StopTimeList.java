package classes;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class StopTimeList {
	@SerializedName("Objects")
	private List<StopTime> objects = new ArrayList<StopTime>();
	@SerializedName("Meta")
	private Meta meta;	
	
	public StopTimeList(List<StopTime> objects, Meta meta) {
		super();
		this.objects = objects;
		this.meta = meta;
	}

	public List<StopTime> getObjects() {
		return objects;
	}

	public void setObjects(List<StopTime> objects) {
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
		return "StopTimeList [objects=" + objects + ", meta=" + meta + "]";
	}
	
}
