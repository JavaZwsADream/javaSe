package com.day02.afternoon.reflectionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
	
	
	public static void main(String[] args) {
		
		
		String name;
		if(args.length>0)
			name=args[0];
		else
		{
		Scanner in = new Scanner(System.in);	
		System.out.println("enter class name(eg: java.util.Date)");
		name=in.next();	
		}
		
		try {
			Class c1=Class.forName(name);
			Class supercl = c1.getSuperclass();
			String modifiers = Modifier.toString(c1.getModifiers());
			if(modifiers.length()>0)
		    System.out.println(modifiers+" ");
			System.out.println("class "+name);
			if(supercl!=null && supercl!=Object.class)
				System.out.println("extends "+supercl.getName());
			System.out.println("\n{\n");
			pointConstuctors(c1);
			System.out.println();
			printMethods(c1);
			System.out.println();
			printFields(c1);
			System.out.println("}");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
  
private static void printFields(Class c1) {
		Field[] Fields = c1.getDeclaredFields();
		for (Field field : Fields) {
			Class<?> type = field.getType();
			String name = field.getName();
			System.out.println(" ");
			String modifier = Modifier.toString(field.getModifiers());
			System.out.println(type.getName()+" "+name+";");
		}
		
	}

private static void printMethods(Class c1) {
		Method[] methods = c1.getDeclaredMethods();
		for (Method m : methods) {
			
			Class returnType = m.getReturnType();
			String name = m.getName();
			System.out.println(" ");
			String modifies = Modifier.toString(m.getModifiers());
			if(modifies.length()>0)
				System.out.println(modifies+" ");
			System.out.println(returnType.getName()+" "+name+"(");
			Class<?>[] parameterTypes = m.getParameterTypes();
			for(int i=0;i<parameterTypes.length;i++)
			{
				if(i>0)
					System.out.println(parameterTypes[i].getName());
				
			
			}
			System.out.println(");");
		}
		
	}

/**
    * 打印出类的所有构造器
    * @param c1
    */
	private static void pointConstuctors(Class c1) {
		Constructor[] constructors = c1.getDeclaredConstructors();
		for (Constructor c : constructors) {
			String name=c.getName();
			System.out.println(" ");
			String modifies=Modifier.toString(c.getModifiers());
			if(modifies.length()>0)
				System.out.println(modifies+" ");
			System.out.println(name+"(");
			//print parameter types
			Class[] paramTypes = c.getParameterTypes();
			for(int i=0;i<paramTypes.length;i++)
			{
				if(i>0)
					System.out.println(", ");
				System.out.println(paramTypes[i].getName());
			}
			System.out.println(");");
		}
	}

}
