package ss6_ke_thua.exercise.class_point2d_and_class_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setZ(z);
        this.setXY(x, y);
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = this.getX();
        arr[1] = this.getY();
        arr[2] = this.getZ();
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() + "Class Point3D " + " Z = " + z;
    }

    public static void main(String[] args) {
        Point2D demo = new Point3D(5, 6, 8);
        System.out.println(demo.toString());
    }
}