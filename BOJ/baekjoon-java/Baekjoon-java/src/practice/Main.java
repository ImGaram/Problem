package practice;

public class Main {
	public static void main(String[] args) {
		Info a = new Info();
		Info b = new Info("±èÃ¶¼ö",22);
		Info c = new Info("ÀÓ°¡¶÷",20);
		
		b.setAge(18);
		
		System.out.println(a.name+" "+a.getAge());
		System.out.println(b.name+" "+b.getAge());
		System.out.println(c.name+" "+c.getAge());
	}
}

class Info{
	String name;
	private int age;
	
	Info(){
		this("-",0);
	}
	Info(String name, int age){
		this.name=name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
