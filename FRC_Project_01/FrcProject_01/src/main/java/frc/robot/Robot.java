package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot 
{
	Motors motorObject;
	Joysticks joystick;
	Boolean joysick;
	//This function is run whenever the robot starts. This function is used for any initialization of code
	@Override
	public void robotInit() 
	{
		joystick = new Joysticks();
		motorObject = new Motors();
		joysick = true;

	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() 
	{
		motorObject.leftMotor.set(.5);
		motorObject.rightMotor.set(-.5);
	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() 
	{
		
	}

	@Override
	public void teleopInit() 
	{
		motorObject.leftMotor.set(.5);
		motorObject.rightMotor.set(-.5);
	}
	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{
		joystick.updateMainController();
		if (joystick.buttonA){
			if(joysick){
		motorObject.leftMotor.set(-.5);
		motorObject.rightMotor.set(.5);
		joysick = false;
			}
			else{
				motorObject.leftMotor.set(.5);
				motorObject.rightMotor.set(-.5);
				joysick = true;
					}
	}
	}

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}
