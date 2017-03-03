import java.util.*;

public class SymbolTable {
	public Integer scope_id;
	public SymbolTable parent;
	public ArrayList<SymbolTable> children;
	public Map<String, Symbol> map;

	public SymbolTable(Integer scope_id, SymbolTable parent){
		this.scope_id = scope_id;
		this.parent = parent;
		map = new HashMap<String, Symbol>();
		children = new ArrayList<SymbolTable>();
	}

	public void insert(String id, Symbol symb){
		map.put(id, symb);
	}

	public Integer lookup(String id, Integer level){
		if(this.map.containsKey(id)){
			return level+1;
		} else {
			if(this.parent != null){
				return this.parent.lookup(id, level+1);
			}else{
				return 0;
			}
		}
	}
       
	public void print(){
		System.out.println("Scope id "+String.valueOf(scope_id)+" : "+map);
	}	
}
