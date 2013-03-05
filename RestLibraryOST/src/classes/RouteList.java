package classes;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class RouteList {
	@SerializedName("Objects")
	private List<RouteDetail> objects = new ArrayList<RouteDetail>();
	@SerializedName("Meta")
	private Meta meta;
	
	public void StopList(List<RouteDetail> objects, Meta meta) {
		this.objects = objects;
		this.meta = meta;
	}
	
	public List<RouteDetail> getObjects() {
		return objects;
	}

	public void setObjects(List<RouteDetail> objects) {
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
		return "RouteList [objects=" + objects + ", others=" + meta + "]";
	}
}
