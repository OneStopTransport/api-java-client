package classes;

import com.google.gson.annotations.SerializedName;

public class StopTime {
	@SerializedName("pickup_type")	
	private int pickup_type;	
	@SerializedName("drop_off_type") 
	private int drop_off_type;
	@SerializedName("stop_sequence")
	private int stop_sequence;
	@SerializedName("point")
	private int stop_id;
	@SerializedName("arrival_times")
	private String arrival_times;
	@SerializedName("stop_headsign")
	private String stop_headsign;
	@SerializedName("trip_id")
	private int trip_id;
	@SerializedName("id")
	private int id;
	@SerializedName("departure_times")
	private String departure_times;
	@SerializedName("shape_dist_traveled")
	private float shape_dist_traveled;
	public StopTime(int pickup_type, int drop_off_type, int stop_sequence,
			int stop_id, String arrival_times, String stop_headsign,
			int trip_id, int id, String departure_times,
			float shape_dist_traveled) {
		super();
		this.pickup_type = pickup_type;
		this.drop_off_type = drop_off_type;
		this.stop_sequence = stop_sequence;
		this.stop_id = stop_id;
		this.arrival_times = arrival_times;
		this.stop_headsign = stop_headsign;
		this.trip_id = trip_id;
		this.id = id;
		this.departure_times = departure_times;
		this.shape_dist_traveled = shape_dist_traveled;
	}
	public int getPickup_type() {
		return pickup_type;
	}
	public void setPickup_type(int pickup_type) {
		this.pickup_type = pickup_type;
	}
	public int getDrop_off_type() {
		return drop_off_type;
	}
	public void setDrop_off_type(int drop_off_type) {
		this.drop_off_type = drop_off_type;
	}
	public int getStop_sequence() {
		return stop_sequence;
	}
	public void setStop_sequence(int stop_sequence) {
		this.stop_sequence = stop_sequence;
	}
	public int getStop_id() {
		return stop_id;
	}
	public void setStop_id(int stop_id) {
		this.stop_id = stop_id;
	}
	public String getArrival_times() {
		return arrival_times;
	}
	public void setArrival_times(String arrival_times) {
		this.arrival_times = arrival_times;
	}
	public String getStop_headsign() {
		return stop_headsign;
	}
	public void setStop_headsign(String stop_headsign) {
		this.stop_headsign = stop_headsign;
	}
	public int getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(int trip_id) {
		this.trip_id = trip_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeparture_times() {
		return departure_times;
	}
	public void setDeparture_times(String departure_times) {
		this.departure_times = departure_times;
	}
	public float getShape_dist_traveled() {
		return shape_dist_traveled;
	}
	public void setShape_dist_traveled(float shape_dist_traveled) {
		this.shape_dist_traveled = shape_dist_traveled;
	}
	@Override
	public String toString() {
		return "StopTime [pickup_type=" + pickup_type + ", drop_off_type="
				+ drop_off_type + ", stop_sequence=" + stop_sequence
				+ ", stop_id=" + stop_id + ", arrival_times=" + arrival_times
				+ ", stop_headsign=" + stop_headsign + ", trip_id=" + trip_id
				+ ", id=" + id + ", departure_times=" + departure_times
				+ ", shape_dist_traveled=" + shape_dist_traveled + "]";
	}
}
