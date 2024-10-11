package OOP.geometricShapes;

public class Line
{
    public Point beginPoint;
    public Point endPoint;

    public Line(Point begin, Point end)
    {
        this.beginPoint = begin;
        this.endPoint = end;
    }

    public Line(int x1, int y1, int x2, int y2)
    {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public int length()
    {
        return GeometricHelper.distanceBetweenTwoPoints(beginPoint, endPoint);
    }

    public String toString() {
        return "Line from " + beginPoint + " to " + endPoint;
    }
}
