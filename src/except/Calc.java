package except;

public class Calc {
	public int add(int x,int y) throw �����Ѵ¿���{
		int result=x+y;
		
		if(result>100)
			throw new �����Ѵ¿���();
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
