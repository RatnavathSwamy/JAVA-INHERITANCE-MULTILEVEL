package multilevelinheritance;

public class Mainmultilevelinheritance {
public static void main(String[] args)
{
	child2 obj=new child2();
	obj.child2method();

	System.out.println(obj.child1method());
	obj.parentmethod();
	
}
}
