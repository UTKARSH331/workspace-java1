package interface4;

public interface dpCalc {
	int docalc(int a, int b);

}
class Driver67 {
	dpCalc d1 = (a,b) ->{int result = (a+b); return result;};
	int a = d1.docalc(4, 50);
	//System.out.pri
}
