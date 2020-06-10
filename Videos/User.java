/**
 * @author KevHaes
 *
 */

package Videos;

import java.util.ArrayList;
import java.util.Date;

/////////// PARAMS ///////////

public class User {
	private String name;

	private String password;
	private Date timeStamp;
	private ArrayList<Video> videos = new ArrayList<Video>();

/////////// CONSTRUCTOR ///////////
	public User(String name, String password, Date timeStamp) {
		this.name = name;
		this.password = password;
	}

	public User() {
	};

/////////// GETTERS & SETTERS ///////////

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public ArrayList<Video> getVideos() {
		return videos;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

/////////// METHODS ///////////	

	// set name with check for empty input
	public void setCheckedName(String name) throws Exception {
		if (!InputMethods.inputIsOk(name)) {
			throw new Exception("this field can't be empty");
		} else {
			this.name = name;
		}
	}

	// set password with check for empty input
	public void setCheckedPass(String pass) throws Exception {
		if (!InputMethods.inputIsOk(pass)) {
			throw new Exception("this field can't be empty");
		} else {
			password = pass;
		}
	}

	// add video to a user
	public void addVideoToUser(Video video) {
		this.videos.add(video);
	}

	// see all videos
	public static String seeAllVideos(User user) {
		return "this are all your videos:\n" + user.videos;

	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", timeStamp=" + timeStamp + ", videos=" + videos
				+ "]";
	}
}
