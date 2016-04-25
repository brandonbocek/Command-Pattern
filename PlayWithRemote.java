package Command;
import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args){
		
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		onPressed = new DeviceButton(offCommand);
		onPressed.press();
		
		TurnTVUp vollUpCommand = new TurnTVUp(newDevice);
		onPressed = new DeviceButton(vollUpCommand);
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff allOffComm = new TurnItAllOff(allDevices);
		DeviceButton turnThemOff = new DeviceButton(allOffComm);
		turnThemOff.press();
		
		turnThemOff.pressUndo();
		
	}
	
}
