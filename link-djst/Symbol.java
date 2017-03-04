import java.util.*;

public class Symbol {
	public String id;
	public Boolean isStruct;
	public Boolean isMethod;
	public Boolean isVar;
	public Boolean isArray;
	public Integer arraySize;
	public ArrayList<String> parameters;
	public String returnType;
	
	//Struct Constructor
	public Symbol(String id, String returnType){
		this.id = id;
		this.isStruct = true;
	}
	
	//Method Constructor
	public Symbol(String id,  ArrayList<String> parameters, String returnType){
		this.id = id;
		this.isMethod = true;
		this.parameters = parameters;
		this.returnType = returnType;
	}

	//Variable Constructor
	public Symbol(String id, Boolean isArray, Integer arraySize, String returnType){
		this.id = id;
		this.isVar = true;
		this.isArray = isArray;
		this.arraySize = arraySize;
		this.returnType = returnType;
	}	
}
