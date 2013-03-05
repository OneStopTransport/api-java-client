package classes;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Stop {
	@SerializedName("distance")	
	private String distance;	
	@SerializedName("stop_url") 
	private String url;
	@SerializedName("stop_code")
	private String code;
	@SerializedName("point")
	private Point point;
	@SerializedName("stop_desc")
	private String desc;
	@SerializedName("parent_station_id")
	private int parent_station_id;
	@SerializedName("_routes")
	private List<Route> routes = new ArrayList<Route>();
	@SerializedName("stop_name")
	private String name;
	@SerializedName("id")
	private int id;
	@SerializedName("location_type")
	private boolean location_type;
	
	public Stop(String distance, String url, String code, Point point,
			String desc, int parent_station_id, List<Route> routes, String name, int id,
			boolean location_type) {
		super();
		this.distance = distance;
		this.url = url;
		this.code = code;
		this.point = point;
		this.desc = desc;
		this.parent_station_id = parent_station_id;
		this.routes = routes;
		this.name = name;
		this.id = id;
		this.location_type = location_type;
	}
	public String getDistance() {		
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getParent_station_id() {
		return parent_station_id;
	}
	public void setParent_station_id(int parent_station_id) {
		this.parent_station_id = parent_station_id;
	}
	public List<Route> getRoutes() {
		return routes;
	}
	public String getStringRoutes() {
		String routesStr = "";
		for (int i=0; i<routes.size(); i++)
			routesStr+=routes.get(i)+"\n";
		return routesStr.substring(0, routesStr.length()-1);
	}
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isLocation_type() {
		return location_type;
	}
	public void setLocation_type(boolean location_type) {
		this.location_type = location_type;
	}
	
	@Override
	public String toString() {
		return "Stop [distance=" + distance + ", url=" + url + ", code=" + code
				+ ", point=" + point + ", desc=" + desc
				+ ", parent_station_id=" + parent_station_id + ", routes="
				+ routes + ", name=" + name + ", id=" + id + ", location_type="
				+ location_type + "]";
	}
}
