package javaClassesAndObjects;

/**
 * Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
	 state (on/off), 
	 current volume, 
	 current channel, 
	 increase and decrease volume and 
	 change channel
	 turn it on and off.
	     
	Design this class, create an instance, turn on, increase and decrease the volume, change channels..get information about state, volume and channel..finally turn it off.

 * @author shuraut
 *
 */

public class Television {

	private boolean state=false;
	private int currentVolume=0;
	private int currentChannel=0;
	
	public static final int INCREASE=1;
	public static final int DECREASE=-1;
	
	public void changeVolume(int volumeAction){
		if(volumeAction==INCREASE){
			this.currentVolume++;
		}else if(volumeAction==DECREASE && currentVolume>=0){
			this.currentVolume--;
		}
	}

	public void changeChannel(int channelAction){
		if(channelAction==INCREASE){
			this.currentChannel++;
		}else if(channelAction==DECREASE && currentChannel>=0){
			this.currentChannel--;
		}
	}

	public void changeState(){
		this.state=!state;
	}
}
