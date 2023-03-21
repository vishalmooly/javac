class circle{
	public static final double DEFAULT_RADIUS=1.0;
	public static final String DEFAULT_COLOR="RED";
	private double radius;
	private String color;
	public circle(){
this.radius=DEFAULT_RADIUS;
this.color=DEFAULT_COLOR;
	}
	public circle(double radius){
this.radius=radius;
this.color=DEFAULT_COLOR;
	}
	public circle(double radius,String color){
this.radius=radius;
this.color=color;
	}
	public double getradius(){
		return this.radius;
	}
	public String getcolor(){
		return this.color;
	}
	public void setradius(double radius){
this.radius=radius;
	}
	public void setcolor(String color){
this.color=color;
	}
	public String toString(){
		return"CIRCLE=[RADIUS="+radius+",COLOR="+color+"]";
	}
	public double getarea(){
		return radius*radius*Math.PI;
	}
}

public class labprogram31{
	public static void main(String[]args){
		circle c1=new circle();
System.out.println(c1);
System.out.println(c1.toString());
		circle c2=new circle(5);
System.out.println(c2);
		circle c3=new circle(2.5,"BLUE");
System.out.println(c3);
		c1.setradius(3.5);
		c1.setcolor("GREEN");
System.out.println(c1);
System.out.println("THE RADIUS OF C1:"+c1.getradius());
System.out.println("THE COLOR OF C1:"+c1.getcolor());
System.out.println("THE AREA OF C2:"+c2.getarea());
	}
}
