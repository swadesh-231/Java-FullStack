public class CircleBasic {
    public static void main(String[] args) {
        double area = getArea();
        System.out.println("Area is "+area);
    }
    static double  getArea(){
        double radius=10.4;
        double area=3.14*radius*radius;
        return area;
    }

}