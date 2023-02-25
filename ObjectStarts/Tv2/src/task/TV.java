package task;

public class TV {

	int cha=1;
	int vl=1;
	boolean on=true;
	
	public TV() {
		
	}
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	public void setChannel(int newCha) {
		if(on && cha>1 && cha<=120) {
			cha = newCha;
		}
	}
	public void setVl(int newVL) {
		if(on && vl>=1 && vl<=7) {
			vl = newVL;
		}
	}
	public void channelUp() {
		if(on && cha<120) {
			cha++;
		}
	}
	public void channelDown() {
		if(on && cha>1) {
			cha--;
		}
	}
	public void volUp() {
		if(on&& vl<7) {
			vl++;
		}
	}
	public void volDown() {
		if(on && vl>1) {
			vl--;
		}
	}
}
