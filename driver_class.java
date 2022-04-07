
public class driver_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TRIANGLE tg1=new TRIANGLE();
		tg1.testTriangle();
		long chuvi;
		chuvi= tg1.perimeter();
		System.out.print("\nChu vi cua tam giac la:"+chuvi+"\n");
		double dientich;
		dientich= tg1.Area();
		System.out.print("Dien tich cua tam giac la:"+dientich);
		
	}

}
