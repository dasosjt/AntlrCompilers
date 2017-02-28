public class Symbol {
	public String id;
	public Boolean isStruct;
	public Boolean isMethod;
	public Boolean isVar;
	public String[] parameters;
	public Integer scope;
	public Integer parentScope;
	public String returnType;
	
	//Struct Constructor
	public Symbol(String id, Integer scope, Integer parentScope){
		this.id = id;
		this.isStruct = true;
		this.scope = scope;
		this.parentScope = parentScope;
	}
	
	//Method Constructor
	public Symbol(String id, Integer scope, Integer parentScope, String[] parameters, String returnType){
		this.id = id;
		this.isMethod = true;
		this.scope = scope;
		this.parentScope = parentScope;
		this.parameters = parameters;
		this.returnType = returnType;
	}

	//Variable Constructor
	public Symbol(String id, Integer scope, Integer parentScope, String returnType){
		this.id = id;
		this.isVar = true;
		this.scope = scope; 
		this.parentScope = parentScope;
		this.returnType = returnType;
	}	
}
