package classes;

import com.google.gson.annotations.SerializedName;

public class RouteDetail extends Route {

	@SerializedName("route_color")
	private String color;
	@SerializedName("route_text_color")
	private String text_color;
	@SerializedName("route_url")
	private String url;
	@SerializedName("route_long_name")
	private String long_name;
	@SerializedName("route_desc")
	private String desc;
	@SerializedName("route_type")
	private int type;
	@SerializedName("agency")
	private Agency agency;
	
	public RouteDetail(long id, String short_name, String color,
			String text_color, String url, String long_name, String desc,
			int type, Agency agency) {
		super(id, short_name);
		this.color = color;
		this.text_color = text_color;
		this.url = url;
		this.long_name = long_name;
		this.desc = desc;
		this.type = type;
		this.agency = agency;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getText_color() {
		return text_color;
	}

	public void setText_color(String text_color) {
		this.text_color = text_color;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLong_name() {
		return long_name;
	}

	public void setLong_name(String long_name) {
		this.long_name = long_name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	@Override
	public String toString() {
		return super.toString()+", RouteDetail [color=" + color + ", text_color=" + text_color
				+ ", url=" + url + ", long_name=" + long_name + ", desc="
				+ desc + ", type=" + type + ", agency=" + agency + "]";
	}
}
