import java.util.*;

public class Symbol {
	public String id;
	public Boolean isStruct;
	public Boolean isMethod;
	public Boolean isVar;
	public Boolean isArray;
	public Integer arraySize;
	public ArrayList<String> parameters;
	public Integer scope;
	public Integer parentScope;
	public String returnType;
	
	//Struct Constructor
	public Symbol(String id, Integer scope, Integer parentScope, String returnType){
		this.id = id;
		this.isStruct = true;
		this.scope = scope;
		this.parentScope = parentScope;
	}
	
	//Method Constructor
	public Symbol(String id, Integer scope, Integer parentScope, ArrayList<String> parameters, String returnType){
		this.id = id;
		this.isMethod = true;
		this.scope = scope;
		this.parentScope = parentScope;
		this.parameters = parameters;
		this.returnType = returnType;
	}

	//Variable Constructor
	public Symbol(String id, Boolean isArray, Integer arraySize, Integer scope, Integer parentScope, String returnType){
		this.id = id;
		this.isVar = true;
		this.isArray = isArray;
		this.arraySize = arraySize;
		this.scope = scope; 
		this.parentScope = parentScope;
		this.returnType = returnType;
	}	
}
