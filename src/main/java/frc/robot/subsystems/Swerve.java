// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Swerve extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  SwerveDriveKinematics kinematics;
  public Swerve() {
    kinematics = new SwerveDriveKinematics(
      new Translation2d(0, 0),
      new Translation2d(0, 0),
      new Translation2d(0, 0),
      new Translation2d(0, 0));
    )
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public void testDrive(){
    ChassisSpeeds testSpeeds = new ChassisSpeeds(1, 1, 0.16);
    SwerveModuleState[] SwerveModuleStates = kinematics.toSwerveModuleStates(testSpeeds);
  }
 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
