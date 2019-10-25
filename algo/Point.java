package org.eclipse.model;

public class Point {
private double abs;
private double ord;

public Point(double abs, double ord) {
	this.abs = abs;
	this.ord = ord;
}

public double getAbs() {
	return abs;
}

public void setAbs(double abs) {
	this.abs = abs;
}

public double getOrd() {
	return ord;
}

public void setOrd(double ord) {
	this.ord = ord;
}

public double calculerDistance(Point p)
{
	/*vous pouvez décomposer la formule en plusieurs instructions comme suit
	 * double x1=this.abs;
	double x2=p.getAbs();
	double y1=this.ord;
	double y2=p.getOrd();
	double result=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	*/
	
	return Math.sqrt(Math.pow(this.abs-p.getAbs(),2)+Math.pow(this.ord-p.getOrd(),2));
}
public Point calculerMilieu(Point p)
{
	return new Point((this.abs+p.getAbs())/2,(this.ord+p.getOrd())/2);
}

@Override
public String toString() {
	return "Point[" + abs + "," + ord + "]";
}

}
