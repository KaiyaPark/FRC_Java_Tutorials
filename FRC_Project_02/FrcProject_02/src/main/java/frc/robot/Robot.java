
package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot 
{	
	Encoders encodersObject = new Encoders();
	Motors motor = new Motors();
	//The speed of the robot while running the program
	double speed = 0.3;

	//This function is run whenever the robot starts. This function is used for any initialization of code
	@Override
	public void robotInit() 
	{
		encodersObject.resetEncoders();
	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() 
	{

	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() 
	{
		
	}

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{
		

	}

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
	public void movestraight(double rev){
	double leftEncoderValue = encodersObject.getLeftEncoder();
	double rightEncoderValue = encodersObject.getRightEncoder();
		if(leftEncoderValue <= rev*360 && rightEncoderValue<=rev*360){
			motor.leftMotor.set(-speed);
			motor.rightMotor.set(speed);
			if(leftEncoderValue != rightEncoderValue){
				if(leftEncoderValue>rightEncoderValue){
					motor.leftMotor.set(speed-.1);
				}
				else{
					motor.leftMotor.set(speed+.1);
				}
			}
		}
	}
}