public class Q16 {
    int x;
    int y;

    //Constructor 1
    public Q16() {

    }

    //Constructor 2
    Q16(int x, int y) {
        this.x = x;
        this.y = y;

    }

    //METHOD 1
    public int getX(){
        return this.x;
    }

    //METHOD 2
    public int getY(){
        return this.y;
    }

    //METHOD 3
    public void setX(int x){
        this.x=x;
    }

    //METHOD 4
    public void setY(int y){
        this.y= y;
    }

    public double distance(){
        return Math.sqrt((0-this.getX())* (0-this.getX()) + (0-this.getY()) * (0-this.getY()));

    }

    public double distance (int x, int y){
        return Math.sqrt((x-this.getX())* (x-this.getX()) + (y-this.getY()) * (y-this.getY()));

    }

    public double distance (Q16 second){
        return Math.sqrt((second.getX()-this.getX())* (second.getX()-this.getX()) + (second.getY()-this.getY()) * (second.getY()-this.getY()));
    }

    public static void main(String[] args) {
        Q16 first = new Q16(6, 5);
        Q16 second = new Q16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Q16 point = new Q16();
        System.out.println("distance()= " + point.distance());
    }
}
