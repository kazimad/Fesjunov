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

//
        public double distanceToZeroX( Point A){                // distance to zero by x-axis
            double coordX = Math.abs(A.x);

            return coordX;
        }

        public double distanceToZeroY( Point A){                // distance to zero by y-axis
            double coordY = Math.abs(A.y);

            return coordY;
        }
//        public Point shiftX(Point A, double shift){                 //  point Shifting by x-axis
//            double ShiftX = A.x + shift;
//            return new Point(ShiftX,A.y);
//
//        }

//        public Point shiftY(Point A, double shift){                     //  point Shifting by y-axis
//            double ShiftX = A.x + shift;
//            return new Point(ShiftX,A.x);
//
//        }
        public Point shiftY(Point A, double shift){                 //  point Shifting
            double ShiftY = A.y + shift;                          // in case if we need to return old Point
            Point A1 = new Point();
            A = A1;
            return A;

        }
        public Point shiftX(Point A, double shift){                 //  point Shifting
            double ShiftX = A.x + shift;                          // in case if we need to return old Point
            Point A1 = new Point();
            A = A1;
            return A;

        }

        public double getX(Point A){                                //  coordinates of the Point
            double getX = A.x;
            return getX;
        }
        public double getY(Point A){                                //  coordinates of the Point
            double getY = A.y;
            return getY;
        }

        public double distanceX (Point A, Point B){             // distance between two points X-axis
            double distanceX = Math.abs(A.x - B.x);
            return distanceX;
        }
        public double distanceY (Point A, Point B){                 // distance between two points X-axis
            double distanceY = Math.abs(A.y - B.y);
            return distanceY;
        }

        public double howLongToA_X(Point A){
            double HowLong = Math.abs(this.x - A.x);                // distance from A point to B Point
            return HowLong;
        }
        public double howLongToA_Y(Point A){
            double HowLong = Math.abs(this.y - A.y);                    // distance from A point to B Point
            return HowLong;
        }

    }
    public static  void main (String [] args ){
        Point A = new Point(-2,3);
        Point B = new Point(11,5);
        System.out.println(A.getX(A));
        System.out.println(A.getY(A));
        A.shiftY(A, 5);
        System.out.println(A.getY(A));
        System.out.println(A.howLongToA_X(B));
        System.out.println(A.distanceX(A, B));


    }


}

