package MediaManager

import repository1.MediaStore;
import repository1.AudioDB;
import repository1.Sound;


public class MediaManagerImpl implements MediaStore{
	AudioDB audioDB;

	public void setAudioDB(AudioDB audioDB) {
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}


	Sound sound;

	public void setSound(Sound sound) {
		Helper.assertNull(this.sound);
		this.sound = sound;
	}


	//Implementing download from interface MediaStore
	@Override
	public void download() {
		Helper.assertNotNull(this.mediaStore);
		// TODO: Insert code here
	}

	//Implementing upload from interface MediaStore
	@Override
	public void upload() {
		Helper.assertNotNull(this.mediaStore);
		// TODO: Insert code here
	}



}
