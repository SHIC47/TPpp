public class Lab3 {
    public static void main(String[] args) {
        System.out.println("input coords of first point");
        Point3d first=Point3d.getPoint();
        System.out.println("input coords of second point");
        Point3d second=Point3d.getPoint();
        System.out.println("input coords of third point");
        Point3d third=Point3d.getPoint();
        double l12= Point3d.distanceTo(first,second);
        double l13= Point3d.distanceTo(first,third);
        double l23=Point3d.distanceTo(second,third);
        System.out.println("Area = "+ computeArea(l12,l13,l23));
    }

    public static double computeArea(double r12,double r13, double r23){
        double p=(r12+r13+r23)/2;
        double S=Math.sqrt(p*(p-r12)*(p-r13)*(p-r23));
        return S;
    }
}