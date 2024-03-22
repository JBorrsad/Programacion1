import java.awt.*;



public abstract class Figura{

        private Point centro;
        private Color color;

        /**
         * Constructor de la clase Figura
         * Toda figura tiene un centro y un color
         *
         */
        public Figura(int x, int y, Color c) {
Point centro= new Point(x,y);
this.color=c;
        }


        /**
         *
         *  Accesor para el centro de la figura
         *  @return el centro de la figura
         */
        public Point getCentro() {
return centro;
        }

        public Color getColor() {
return color;
        }

        public abstract double getArea();
        public abstract double getPerimetro();
        public String toString() {
return super.toString();
        }


}
