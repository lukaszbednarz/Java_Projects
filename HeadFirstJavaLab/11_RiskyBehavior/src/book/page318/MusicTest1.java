package book.page318;

import javax.sound.midi.*;

public class MusicTest1 {
	public void play() {
		 /* UNHANDLED EXCEPTION: Uncomment to test */
		//Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("We got a sequencer");
	} // close play

	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	} // close main
} // close class
