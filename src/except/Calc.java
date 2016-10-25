package except;

public class Calc {
	public int add(int x,int y) throw 백을넘는오류{
		int result=x+y;
		
		if(result>100)
			throw new 백을넘는오류();
		return result;
		
	}
	
public int sub(int x,int y){
	int result=x-y;
	return result;
	}
public int mulit(int x,int y){
	int result=x*y;
	return result;
}
public int div(int x,int y){
	int result=x/y;
	return result;
}
}
