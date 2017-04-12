package readingdifferentfileformats;

public class GotClassFile {

	private String id;
	private String url;
	private String name;
	private String season;
	private String number;
	private String airdate;
	private String airstamp;
	private String airtime;
	private String runtime;
	private String summary;

	public GotClassFile(String id, String url, String name, String season, String number, String airdate,
			String airstamp, String airtime, String runtime, String summary) {
		this.id = id;
		this.url = url;
		this.name = name;
		this.season = season;
		this.number = number;
		this.airdate = airdate;
		this.airstamp = airstamp;
		this.airtime = airtime;
		this.runtime = runtime;
		this.summary = summary;

	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getSeason() {
		return season;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setAirdate(String airdate) {
		this.airdate = airdate;
	}

	public String getAirdate() {
		return airdate;
	}

	public void setAirstamp(String airstamp) {
		this.airstamp = airstamp;
	}

	public String getAirstamp() {
		return airstamp;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setAirtime(String airtime) {
		this.airtime = airtime;
	}

	public String getAirtime() {
		return airtime;
	}

	public void setsummary(String summary) {
		this.summary = summary;
	}

	public String getsummary() {
		return summary;
	}

}
