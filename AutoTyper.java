

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class AutoTyper {

	public static void typeString(String str) throws AWTException, InterruptedException {
		Scanner in = new Scanner(System.in);
		int keycode = 0;
		Robot bot = new Robot();


		for(int i = 0; i < str.length(); i++ ) {
			bot.delay(((int)(Math.random() * (55 - 25) + 25)));
			char c = str.charAt(i);


			// Symbols

			if(c == ' ') keycode = 32;
			if(c == ',') keycode = 44;
			if(c == '<') {
				keycode = 44;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '-') keycode = 45;
			if(c == '_') {
				keycode = 45;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '.') keycode = 46;
			if(c == '>') {
				keycode = 46;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '/') keycode = 47;
			if(c == '?') {
				keycode = 47;
				bot.keyPress(KeyEvent.VK_SHIFT);

			}
			if(c == ')') {
				keycode = 48;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '!') {
				keycode = 49;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '@') {
				keycode = 50;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '#') {
				keycode = 51;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '$') {
				keycode = 52;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '%') {
				keycode = 53;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '^') {
				keycode = 54;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '&') {
				keycode = 55;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '*') {
				keycode = 56;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '(') {
				keycode = 57;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == ';') keycode = 59;
			if(c == ':') {
				keycode = 59;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '=') keycode = 61;
			if(c == '+') {
				keycode = 61;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '[') keycode = 91;
			if(c == '{') {
				keycode = 91;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == '|') {
				keycode = 92;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == ']') keycode = 93;
			if(c == '}') {
				keycode = 93;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}

			//Numbers

			if(c == '0') keycode = 48;
			if(c == '1') keycode = 49;
			if(c == '2') keycode = 50;
			if(c == '3') keycode = 51;
			if(c == '4') keycode = 52;
			if(c == '5') keycode = 53;
			if(c == '6') keycode = 54;
			if(c == '7') keycode = 55;
			if(c == '8') keycode = 56;
			if(c == '9') keycode = 57;

			// Lower case letters

			if(c == 'a') keycode = 65;
			if(c == 'b') keycode = 66;
			if(c == 'c') keycode = 67;
			if(c == 'd') keycode = 68;
			if(c == 'e') keycode = 69;
			if(c == 'f') keycode = 70;
			if(c == 'g') keycode = 71;
			if(c == 'h') keycode = 72;
			if(c == 'i') keycode = 73;
			if(c == 'j') keycode = 74;
			if(c == 'k') keycode = 75;
			if(c == 'l') keycode = 76;
			if(c == 'm') keycode = 77;
			if(c == 'n') keycode = 78;
			if(c == 'o') keycode = 79;
			if(c == 'p') keycode = 80;
			if(c == 'q') keycode = 81;
			if(c == 'r') keycode = 82;
			if(c == 's') keycode = 83;
			if(c == 't') keycode = 84;
			if(c == 'u') keycode = 85;
			if(c == 'v') keycode = 86;
			if(c == 'w') keycode = 87;
			if(c == 'x') keycode = 88;
			if(c == 'y') keycode = 89;
			if(c == 'z') keycode = 90;

			// Uppercase letters
			if(c == 'A') {
				keycode = 65;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'B') {
				keycode = 66;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'C') {
				keycode = 67;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'D') {
				keycode = 68;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'E') {
				keycode = 69;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'F') {
				keycode = 70;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'G') {
				keycode = 71;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'H') {
				keycode = 72;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'I') {
				keycode = 73;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'J') {
				keycode = 74;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'K') {
				keycode = 75;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'L') {
				keycode = 76;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'M') {
				keycode = 77;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'N') {
				keycode = 78;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'O') {
				keycode = 79;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'P') {
				keycode = 80;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'Q') {
				keycode = 81;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'R') {
				keycode = 82;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'S') {
				keycode = 83;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'T') {
				keycode = 84;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'U') {
				keycode = 85;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'V') {
				keycode = 86;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'W') {
				keycode = 87;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'X') {
				keycode = 88;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'Y') {
				keycode = 89;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			if(c == 'Z') {
				keycode = 90;
				bot.keyPress(KeyEvent.VK_SHIFT);
			}
			bot.keyPress(keycode);
			bot.keyRelease(keycode);
			bot.keyRelease(KeyEvent.VK_SHIFT);
		}
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
	}
}
























