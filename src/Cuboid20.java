
public class Cuboid20 extends Rectangle20 {

        double height;


        public Cuboid20 (double width, double length, double height) {
            super(5, 10);

            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }


        public double getHeight() {
            return this.height;
        }


        public double getVolume() {
            double volume = super.getArea() * this.height;
            return volume;
        }
    }

