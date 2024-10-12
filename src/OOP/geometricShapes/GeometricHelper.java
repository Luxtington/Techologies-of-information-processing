package OOP.geometricShapes;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class GeometricHelper
{
    public static int distanceBetweenTwoPoints(Point beginPoint, Point endPoint)
    {
        return (int)sqrt(pow((endPoint.x - beginPoint.x), 2) + pow((endPoint.y - beginPoint.y), 2));
    }
}