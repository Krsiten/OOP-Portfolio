public class Bulb { 
	boolean lightSwitch;

	public Bulb(boolean onOff) {
		lightSwitch = onOff;
	}
	
	public void setOnOff(boolean flick) {
		this.lightSwitch = flick;
	}
	
	public String switchOn() {
		if (lightSwitch == true) {
			return ("""
					           :
 				       '.  _  .'
					      -=  (~)  =-   
					       .'  #  '.
					""");
			
		} else {
			return ("""
					           
					           _  
					          (~)     
					           #    
					""");
		}	
	}
}