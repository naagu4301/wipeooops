package wipro_oops.com;

public class box {
	 int h,w,d;
public box(int h,int w,int d){
	this.h=h;;
	this.w=w;
	this.d=d;
}
public int volume() {
	int v;
	v=h*w*d;
	return v;
}
public static void main(String[] args) {
	box b=new box(2,2,2);
	System.out.println(b.volume());
}
}
