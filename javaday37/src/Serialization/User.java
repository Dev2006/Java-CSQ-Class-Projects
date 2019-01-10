package Serialization;

import java.io.Serializable;

public class User implements Serializable{
private transient int  age;
private String name;
public User(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "User [age=" + age + ", name=" + name + "]";
}


}
