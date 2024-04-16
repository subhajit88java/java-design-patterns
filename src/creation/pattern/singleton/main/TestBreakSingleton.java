package creation.pattern.singleton.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import creation.pattern.singleton.model.BreakSingletonCloning;
import creation.pattern.singleton.model.BreakSingletonDeserialization;
import creation.pattern.singleton.model.BreakSingletonReflection;
import creation.pattern.singleton.model.RemediateSingletonReflection;

public class TestBreakSingleton {

	public static void main(String[] args) {
		//breakSingletonUsingReflection();
		//remediateSingletonUsingReflection();
		//breakSingletonUsingDeserialization();
		//remediateSingletonUsingDeserialization();
		//breakSingletonUsingCloning();
		remediateSingletonUsingCloning();
	}

	private static void breakSingletonUsingReflection() {
		BreakSingletonReflection obj1 = BreakSingletonReflection.getInstance();
		BreakSingletonReflection obj2 = BreakSingletonReflection.getInstance();
		BreakSingletonReflection obj3 = null;
		BreakSingletonReflection obj4 = null;

		System.out.println("obj1 address : " + System.identityHashCode(obj1));
		System.out.println("obj2 address : " + System.identityHashCode(obj2));
		obj1.setId(100);
		obj2.setId(200);
		System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());


		try {
			for (Constructor c : BreakSingletonReflection.class.getDeclaredConstructors()) {
				c.setAccessible(true);
				obj3 = (BreakSingletonReflection) c.newInstance();
				obj4 = (BreakSingletonReflection) c.newInstance();
			}
		} catch (Exception e) {
		}
		
		System.out.println("obj3 address : " + System.identityHashCode(obj3));
		System.out.println("obj4 address : " + System.identityHashCode(obj4));
		obj3.setId(300);
		obj4.setId(400);
		System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());
		System.out.println("obj3 id : " + obj3.getId());
		System.out.println("obj4 id : " + obj4.getId());

	}
	
	private static void remediateSingletonUsingReflection() {
		RemediateSingletonReflection obj1 = RemediateSingletonReflection.INSTANCE;
		RemediateSingletonReflection obj2 = RemediateSingletonReflection.INSTANCE;
		
		System.out.println("obj1 address : " + System.identityHashCode(obj1));
		System.out.println("obj2 address : " + System.identityHashCode(obj2));
		
		obj1.setId(100);
		obj2.setId(200);
		
		System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());

	}
	
	private static void breakSingletonUsingDeserialization() {
		BreakSingletonDeserialization obj1 = BreakSingletonDeserialization.getInstance();
		BreakSingletonDeserialization obj2 = BreakSingletonDeserialization.getInstance();
		
		System.out.println("obj1 address : " + System.identityHashCode(obj1));
		System.out.println("obj2 address : " + System.identityHashCode(obj2));
		obj1.setId(100);
		obj2.setId(200);
		System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());
		
		// Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("obj1.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj1);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deserialize
        BreakSingletonDeserialization obj3 = null;
        try {
            FileInputStream fileIn = new FileInputStream("obj1.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj3 = (BreakSingletonDeserialization) in.readObject();
            obj3.setId(300);
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        
        System.out.println("obj3 address : " + System.identityHashCode(obj3));
        System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());
        System.out.println("obj3 id : " + obj3.getId());
		
	}
	
	private static void remediateSingletonUsingDeserialization() {
		BreakSingletonDeserialization obj1 = BreakSingletonDeserialization.getInstance();
		BreakSingletonDeserialization obj2 = BreakSingletonDeserialization.getInstance();
		
		System.out.println("obj1 address : " + System.identityHashCode(obj1));
		System.out.println("obj2 address : " + System.identityHashCode(obj2));
		obj1.setId(100);
		obj2.setId(200);
		System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());
		
		// Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("obj1.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj1);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deserialize
        BreakSingletonDeserialization obj3 = null;
        try {
            FileInputStream fileIn = new FileInputStream("obj1.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj3 = (BreakSingletonDeserialization) in.readObject();
            obj3.setId(300);
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        
        System.out.println("obj3 address : " + System.identityHashCode(obj3));
        System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());
        System.out.println("obj3 id : " + obj3.getId());
		
	}
	
	private static void breakSingletonUsingCloning() {
		BreakSingletonCloning obj1 = BreakSingletonCloning.getInstance();
		BreakSingletonCloning obj2 = BreakSingletonCloning.getInstance();
		
		System.out.println("obj1 address : " + System.identityHashCode(obj1));
		System.out.println("obj2 address : " + System.identityHashCode(obj2));
		obj1.setId(100);
		obj2.setId(200);
		System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());
		
		try {
			BreakSingletonCloning obj3 = (BreakSingletonCloning)obj1.clone();
			System.out.println("obj3 address : " + System.identityHashCode(obj3));
			obj3.setId(300);
			System.out.println("obj1 id : " + obj1.getId());
			System.out.println("obj2 id : " + obj2.getId());
			System.out.println("obj3 id : " + obj3.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void remediateSingletonUsingCloning() {
		BreakSingletonCloning obj1 = BreakSingletonCloning.getInstance();
		BreakSingletonCloning obj2 = BreakSingletonCloning.getInstance();
		
		System.out.println("obj1 address : " + System.identityHashCode(obj1));
		System.out.println("obj2 address : " + System.identityHashCode(obj2));
		obj1.setId(100);
		obj2.setId(200);
		System.out.println("obj1 id : " + obj1.getId());
		System.out.println("obj2 id : " + obj2.getId());
		
		try {
			BreakSingletonCloning obj3 = (BreakSingletonCloning)obj1.clone();
			System.out.println("obj3 address : " + System.identityHashCode(obj3));
			obj3.setId(300);
			System.out.println("obj1 id : " + obj1.getId());
			System.out.println("obj2 id : " + obj2.getId());
			System.out.println("obj3 id : " + obj3.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
