package frc.robot;
import frc.robot.LimelightHelpers;
import java.text.DecimalFormat;

public class limelight {

    public static double getX() {
        return LimelightHelpers.getTX("limelight");

    }

    public static double getY() {
        return LimelightHelpers.getTY("limelight");
    }

    public static double getArea() {
        return LimelightHelpers.getTA("limelight");
    }
    
    public static void target(){
        
        getX();
        getY();
        getArea();
        System.out.println("X: " + (int)getX() + " Y: " + (int)getY() + " Area: " + (int)getArea());
    }
}
