package bowlerStudioExtended;

import com.neuronrobotics.bowlerstudio.BowlerKernel;

public class MyNewFunction {
	public static boolean callMe() {
		BowlerKernel.speak("My special function is Awesome");
		return true;
	}
}
