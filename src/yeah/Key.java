package yeah;


/**
 * The Key enum. This enum has all of the keys that I could find online.
 * @author Leon Montealegre
 * @version 0.01
 */
public enum Key {
    LEFT_MOUSE_BUTTON(0),
	BACKSPACE(8),
	TAB(9),
	CLEAR(12),
	ENTER(13),
	SHIFT(16),
	CONTROL(17),
	ALT(18),
	PAUSE(19),
	CAPS_LOCK(20),
	KANA_HANGUEL_HANGUL(21),
	JUNJA(23),
	FINAL(24),
	HANJA_KANJI(25),
	ESCAPE(27),
	CONVERT(28),
	NONCONVERT(29),
	ACCEPT(30),
	MODECHANGE(31),
	SPACEBAR(32),
	PAGE_UP(33),
	PAGE_DOWN(34),
	END(35),
	HOME(36),
	LEFT_ARROW(37),
	UP_ARROW(38),
	RIGHT_ARROW(39),
	DOWN_ARROW(40),
	SELECT(41),
	PRINT(42),
	EXECUTE(43),
	SNAPSHOT(44),
	INSERT(45),
	DELETE(46),
	KEYBOARD_0(48),
	KEYBOARD_1(49),
	KEYBOARD_2(50),
	KEYBOARD_3(51),
	KEYBOARD_4(52),
	KEYBOARD_5(53),
	KEYBOARD_6(54),
	KEYBOARD_7(55),
	KEYBOARD_8(56),
	KEYBOARD_9(57),
	A(65),
	B(66),
	C(67),
	D(68),
	E(69),
	F(70),
	G(71),
	H(72),
	I(73),
	J(74),
	K(75),
	L(76),
	M(77),
	N(78),
	O(79),
	P(80),
	Q(81),
	R(82),
	S(83),
	T(84),
	U(85),
	V(86),
	W(87),
	X(88),
	Y(89),
	Z(90),
	LEFT_WINDOW_KEY(91),
	RIGHT_WINDOW_KEY(92),
	APPLICATION_KEY(93),
	SLEEP(95),
	NUM_0(96),
	NUM_1(97),
	NUM_2(98),
	NUM_3(99),
	NUM_4(100),
	NUM_5(101),
	NUM_6(102),
	NUM_7(103),
	NUM_8(104),
	NUM_9(105),
	NUM_MULTIPLY(106),
	NUM_ADD(107),
	SEPARATOR(108),
	NUM_SUBTRACT(109),
	NUM_DECIMAL_POINT(110),
	NUM_DIVIDE(111),
	F1(112),
	F2(113),
	F3(114),
	F4(115),
	F5(116),
	F6(117),
	F7(118),
	F8(119),
	F9(120),
	F10(121),
	F11(122),
	F12(123),
	NUM_LOCK(144),
	SCROLL_LOCK(145),
	LEFT_SHIFT(160),
	RIGHT_SHIFT(161),
	LEFT_CONTROL(162),
	RIGHT_CONTROL(163),
	LEFT_MENU(164),
	RIGHT_MENU(165),
	BROWSER_BACK(166),
	BROWSER_FORWARD(167),
	BROWSER_REFRESH(168),
	BROWSER_STOP(169),
	BROWSER_SEARCH(170),
	BROWSER_FAVORITES(171),
	BROWSER_HOME(172),
	VOLUME_MUTE(173),
	VOLUME_DOWN(174),
	VOLUME_UP(175),
	MEDIA_NEXT_TRACK(176),
	MEDIA_PREVIOUS_TRACK(177),
	MEDIA_STOP(178),
	MEDIA_PLAY_PAUSE(179),
	LAUNCH_MAIL(180),
	LAUNCH_MEDIA(181),
	LAUNCH_APPS(182),
	LAUNCH_APPS2(183),
	SEMI_COLON(186),
	EQUAL_SIGN(187),
	COMMA(188),
	DASH(189),
	PERIOD(190),
	FORWARD_SLASH(191),
	GRAVE_ACCENT(192),
	OPEN_BRACKET(219),
	BACK_SLASH(220),
	CLOSE_BRACKET(221),
	SINGLE_QUOTE(222);
	
	/**
	 * The numerical value of the key.
	 */
	public final int keyValue;
	
	/**
	 * Creates a new key.
	 * @param keyValue The value of the key.
	 */
	private Key(int keyValue) {
		this.keyValue = keyValue;
	}
	public static Key getKey(int code) {
        switch(code) {
            case  0: return LEFT_MOUSE_BUTTON;
        }
        return null;
    }
}
	
	
