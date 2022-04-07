
public class TRIANGLE {
	private int edge1;
	private int edge2;
	private int edge3;
//constructor 
	public TRIANGLE()
	{
		this.edge1=5;
		this.edge2=7;
		this.edge3=9;
	}
	public TRIANGLE(int edge1, int edge2, int edge3)
	{
		this.edge1=edge1;
		this.edge2=edge2;
		this.edge3=edge3;
	}
	public TRIANGLE(TRIANGLE triangle1)
	{
		this.edge1=triangle1.edge1;
		this.edge2=triangle1.edge2;
		this.edge3=triangle1.edge3;
		
	}
	public int getEdge1()
	{
		return this.edge1;
	}
	public void setEdge1(int Edge1)
	{
		this.edge1=Edge1;
	}
	public int getEdge2()
	{
		return this.edge2;
	}
	public void setEdge2 (int Edge2)
	{
		this.edge1=Edge2;
	}
	public int getEdge3()
	{
		return this.edge3;
	}
	public void setEdge3 (int Edge3)
	{
		this.edge1=Edge3;
	}
	public long perimeter()
	{
		long cv=0;
		cv=this.edge1+this.edge2+this.edge3;
		return cv;
	}
	public double Area()
	{
		double s=0;
		int p=(this.edge1+this.edge2+this.edge3)/2;
		s=Math.sqrt((p*(p-this.edge1)*(p-this.edge2)*(p-this.edge3)));
		return s;
	}
	public void testTriangle()
	{
		if((this.edge1<this.edge2+this.edge3) && (this.edge2<this.edge1+this.edge3) && (this.edge3<this.edge1+this.edge2))
		{
			if((this.edge1*this.edge1==this.edge2*this.edge2+this.edge3*this.edge3)|| (this.edge2*this.edge2==this.edge1*this.edge1+this.edge3*this.edge3)||(this.edge3*this.edge3==this.edge1*this.edge1+this.edge2*this.edge2))
			{
				System.out.print("Day la tam giac vuong ");
			}
			else if(this.edge1==this.edge2 && this.edge2==this.edge3)
			{
				System.out.print("Day la tam giac deu");
			}
			else if(this.edge1==this.edge2 || this.edge1==this.edge3 || this.edge2==this.edge3)
			{
				System.out.print("Day la tam giac can");
			}
			else if((this.edge1*this.edge1>this.edge2*this.edge2+this.edge3*this.edge3)|| (this.edge2*this.edge2>this.edge1*this.edge1+this.edge3*this.edge3)||(this.edge3*this.edge3>this.edge1*this.edge1+this.edge2*this.edge2))
			{
				System.out.print("Day la tam giac tù");
			}
			else
			{
				System.out.print("Day la tam giac nhon");
			}
		}
		else
		{
			System.out.print("3 canh ko tao thanh tam giac !!!");
		}
	}
}
