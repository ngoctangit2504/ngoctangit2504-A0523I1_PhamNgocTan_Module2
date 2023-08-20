package ss6_ke_thua.exercise.class_point_and_moveable_point;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x,float y,float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = this.getxSpeed();
        arr[1] = this.getySpeed();
        return arr;
    }

    @Override
    public String toString() {
        return super.toString()+" , speed = ("+getxSpeed()+" , "+getySpeed()+" )";
    }

    public void movablePoint(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
    }

    public static void main(String[] args) {
        Point demo = new MoveablePoint(1,5,6,8);
        System.out.println(demo.toString());
        Point demo1 = new Point(6,8);
        System.out.println(demo1.toString());
        demo1.setY(88);
        System.out.println(demo1.getY());
        
    }
}