package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
			
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
		public void Horoscope(Zodiac zodiac) {
			switch(zodiac) {
				case ARIES:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Mar. 21 - Apr. 19. You are bold.");
					break;
				case TAURUS:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Apr. 20 - May 20. You are serene.");
					break;
				case GEMINI:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between May 21 - Jun. 20. You are ambitious.");
					break;
				case CANCER:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Jun. 21 - Jul. 22. You are intuitive.");
					break;
				case LEO:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Jul. 23 - Aug. 22. You are proud.");
					break;
				case VIRGO:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Aug. 23 - Sept. 22. You are logical.");
					break;
				case LIBRA:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Sept. 23 - Oct. 22. You are balanced.");
					break;
				case SCORPIO:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Oct. 22 - Nov. 21. You are emotionaly strong.");
					break;
				case SAGITTARIUS:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Nov. 22 - Dec. 21. You are adventurous.");
					break;
				case CAPRICORN:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Dec. 22 - Jan. 19. You are nagivational.");
					break;
				case AQUARIUS:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Jan. 20 - Feb. 18. You are humanitarian.");
					break;
				default:
					JOptionPane.showMessageDialog(null, zodiac + ": You were born between Feb. 19 - Mar. 20. You are experienced.");
					break;
			}
		}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope hs1 = new _00_Horoscope();
		hs1.Horoscope(Zodiac.ARIES);
		hs1.Horoscope(Zodiac.TAURUS);
		hs1.Horoscope(Zodiac.GEMINI);
		hs1.Horoscope(Zodiac.CANCER);
		hs1.Horoscope(Zodiac.LEO);
		hs1.Horoscope(Zodiac.VIRGO);
		hs1.Horoscope(Zodiac.LIBRA);
		hs1.Horoscope(Zodiac.SCORPIO);
		hs1.Horoscope(Zodiac.SAGITTARIUS);
		hs1.Horoscope(Zodiac.CAPRICORN);
		hs1.Horoscope(Zodiac.AQUARIUS);
		hs1.Horoscope(Zodiac.PISCES);
	}
}
