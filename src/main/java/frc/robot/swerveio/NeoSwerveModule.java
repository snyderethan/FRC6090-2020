package frc.robot.swerveio;

import com.revrobotics.CANSparkMax;

public class NeoSwerveModule extends AbstractSwerveModule implements MultiEncoderModule {

    public NeoSwerveModule (int canId) {
        
    }


    @Override
    public void switchEncoder() {
        // TODO Auto-generated method stub

    }

    @Override
    public Encoder getEncoder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setPivotMotorSpeed(double speed) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setDriveMotorSpeed(double speed) {
        // TODO Auto-generated method stub

    }

    @Override
    public double getPivotMotorSpeed() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getDriveMotorSpeed() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getPivotMotorEncoder() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getDriveMotorEncoder() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void zeroPivotEncoder() {
        // TODO Auto-generated method stub

    }

    @Override
    public void zeroDriveEncoder() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stopPivotMotor() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stopDriveMotor() {
        // TODO Auto-generated method stub

    }
}