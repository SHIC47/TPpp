import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class  Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        xCoord = 0;
        yCoord = 0;
        zCoord = 0;
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double x) {
        xCoord = x;
    }

    public void setY(double y) {
        yCoord = y;
    }

    public void setZ(double z) {
        zCoord = z;
    }

    public static double distanceTo(Point3d firstPoint, Point3d secondPoint) {
        return sqrt(pow((firstPoint.getX() + secondPoint.getX()), 2) + pow((firstPoint.getY() + secondPoint.getY()), 2) +
                pow(firstPoint.getZ() + secondPoint.getZ(), 2));
    }

    private static double scanADouble(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    public static Point3d getPoint(){
        System.out.print("input x: ");
        double x=scanADouble();
        System.out.print("input y: ");
        double y=scanADouble();
        System.out.print("input z: ");
        double z=scanADouble();
        return new Point3d(x,y,z);
    }
}