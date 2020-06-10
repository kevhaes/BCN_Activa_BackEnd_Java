/**
 * @author KevHaes
 *
 */

package Videos;

import java.util.ArrayList;
import java.util.List;

public class Video {

/////////// PARAMS ///////////

	private String url;
	private String title;
	private List<String> tags = new ArrayList<String>();

/////////// CONSTRUCTORS ///////////

	public Video(String title, String url, List<String> tags) {
		this.url = url;
		this.title = title;
		this.tags = tags;
	}

	public Video(String title, String url) {
		this.url = url;
		this.title = title;
	}

	public Video() {
	};

/////////// GETTER SETTERS ///////////

	public List<String> getTags() {
		return tags;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

/////////// METHODS ///////////

	// set title with check for empty input
	public void setCheckedTitle(String title) throws Exception {
		if (!InputMethods.inputIsOk(title)) {
			throw new Exception("this field can't be empty");
		} else {
			this.title = title;
		}
	}

	// set tags
	public void setTags(String tag) {
		this.tags.add(tag);
	}

	// set URL with check for empty input
	public void setCheckedUrl(String url) throws Exception {
		if (!InputMethods.inputIsOk(url)) {
			throw new Exception("this field can't be empty");
		} else {
			this.url = url;
		}
	}

	// create a video and add video to the current user
	public static void createVideoAndAddToCurrentUser(User user) {
		// create video
		Video newVideo1 = new Video();

		// set title to video
		boolean checkDone;
		do {
			checkDone = false;
			try {
				String title = InputMethods.scannAnswer("what is your video title?");
				newVideo1.setCheckedTitle(title);
				checkDone = true;
			} catch (Exception ex) {
				System.out.println("Couldn't add title:\n" + ex);
			}
		} while (!checkDone);

		// set URL to video
		do {
			checkDone = false;
			try {
				String url = InputMethods.scannAnswer("what is your video url?");
				newVideo1.setCheckedUrl(url);
				checkDone = true;
			} catch (Exception ex) {
				System.out.println("Couldn't add url:\n" + ex);
			}
		} while (!checkDone);

		// Menu to choose between: adding one or more tags or
		String answer;
		do {
			answer = InputMethods.scannAnswer("to add a tag type T to exit type X").toUpperCase();
			switch (answer) {
			case "T":
				String tag = InputMethods.scannAnswer("insert your tag");
				newVideo1.setTags(tag);
				break;
			case "X":
				break;
			default:
				System.out.println("This was not a correct answer");
				break;
			}
		} while (!(answer.equals("X")));

		// add video to User
		user.addVideoToUser(newVideo1);

		// inform video is created
		System.out.println("Video succesfull created : " + newVideo1.toString());

	}

	@Override
	public String toString() {
		return "Video [url=" + url + ", title=" + title + ", tags=" + tags + "]";

	}
}
