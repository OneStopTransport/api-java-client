package classes;

import com.google.gson.annotations.SerializedName;

public class Agency {
	@SerializedName("id")
	private long id;
	@SerializedName("agency_phone")
	private String phone;
	@SerializedName("agency_url")
	private String url;
	@SerializedName("agency_name")
	private String name;
	@SerializedName("agency_timezone")
	private String timezone;
	@SerializedName("agency_lang")
	private String lang;
	
	public Agency(long id, String phone, String url, String name,
			String timezone, String lang) {
		super();
		this.id = id;
		this.phone = phone;
		this.url = url;
		this.name = name;
		this.timezone = timezone;
		this.lang = lang;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Agency [id=" + id + ", phone=" + phone + ", url=" + url
				+ ", name=" + name + ", timezone=" + timezone + ", lang="
				+ lang + "]";
	}
}
