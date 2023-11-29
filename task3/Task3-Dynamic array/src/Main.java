import javax.management.DynamicMBean;

public class Main {
    public static void main(String[] args) {

DynamicArray  x =new DynamicArray(3);
x.insert(10);
x.insert(20);
x.insert(30);
x.insert(40);
x.insert(50);
x.printArray();
int arethere =x.indexOf(90);
if(arethere==-1){System.out.println("the number is not found");}
else {x.removeAT(arethere);}

x.printArray();
System.out.println(x.at(3));
System.out.println(x.max());
System.out.println(x.min(x.array));
x.remove(40);
x.printArray();
    }
}