package classes;

import com.google.gson.annotations.SerializedName;

public class Trip {
	@SerializedName("route_id")
	private long route_id; 
	@SerializedName("shape_id")	
	private int shape;	
	@SerializedName("trip_headsign") 
	private String headsign;
	@SerializedName("block_id")
	private int block_id;
	@SerializedName("travel")
	private String travel;
	@SerializedName("trip_short_name")
	private String short_name;
	@SerializedName("id")
	private int id;
	public Trip(long route_id, int shape, String headsign, int block_id,
			String travel, String short_name, int id) {
		super();
		this.route_id = route_id;
		this.shape = shape;
		this.headsign = headsign;
		this.block_id = block_id;
		this.travel = travel;
		this.short_name = short_name;
		this.id = id;
	}
	public long getRoute_id() {
		return route_id;
	}
	public void setRoute_id(long route_id) {
		this.route_id = route_id;
	}
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}
	public String getHeadsign() {
		return headsign;
	}
	public void setHeadsign(String headsign) {
		this.headsign = headsign;
	}
	public int getBlock_id() {
		return block_id;
	}
	public void setBlock_id(int block_id) {
		this.block_id = block_id;
	}
	public String getTravel() {
		return travel;
	}
	public void setTravel(String travel) {
		this.travel = travel;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Trip [route_id=" + route_id + ", shape=" + shape
				+ ", headsign=" + headsign + ", block_id=" + block_id
				+ ", travel=" + travel + ", short_name=" + short_name + ", id="
				+ id + "]";
	}	
}
