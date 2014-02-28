import com.sun.jndi.url.iiop.iiopURLContext;

/**
 * Created by KaZimad on 28.02.14.
 */
public class Main {
    public static class Point {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public  Point() {
            this(0, 0);     // вызов конструктора с двумя параметрами
        }

//                public double distance (Point A, Point B){
//            double disX = (A.x - B.x);
//            double disY = (A.y - B.y);
//return disX;
//                    return disY;
//        }
        public Point distanceToZero( Point A){
            double coordX = Math.abs(x);
            double coordY = Math.abs(y);
            return new Point();
        }
        public Point shiftX(Point A, double shift){
            double ShiftX = A.x + shift;
            return new Point(ShiftX,A.y);

        }
        public Point shiftY(Point A, double shift){
            double ShiftX = A.x + shift;
            return new Point(ShiftX,A.y);

        }
    }
    public static  void main (String [] args ){
        Point A = new Point(2,3);
        Point B = new Point(11,5);
        System.out.println(A);
        System.out.print(A.shiftX(A,2));

    }


}

