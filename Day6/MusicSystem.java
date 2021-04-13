package Day6;

public class MusicSystem {

	private boolean button;

	public MusicSystem(boolean button) {
		this.button=button;
		// TODO Auto-generated constructor stub
	}

	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

public String startmusic(boolean pbutton)
{
	if(pbutton)
	{
	 String a="ON";
	 return a;
	}
	
	else 
	{
		String c="OFF";
		return c;
	}
}
}