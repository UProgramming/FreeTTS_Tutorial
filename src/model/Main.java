package model;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoiceManager vm = VoiceManager.getInstance();
		Voice voice = vm.getVoice("kevin");
		voice.setPitch(110.00f);
		voice.setRate(120.00f);
		voice.allocate();
		voice.speak("hello you have developed your first freetts program in java");

	}

}
