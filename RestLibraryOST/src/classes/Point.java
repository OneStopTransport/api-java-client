package classes;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class Point {

	@SerializedName("distance")	
	String type;
	@SerializedName("coordinates")
	float [] coordinates;
	
	public Point(String type, float[] coordinates) {
		super();		
		this.type = type;
		this.coordinates = coordinates;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(float[] coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return "Point [type=" + type + ", coordinates="
				+ Arrays.toString(coordinates) + "]";
	}
}
