import java.util.*;

public class DECAFTypes extends DECAFBaseVisitor<String> {
	public int scope_counter;
	public Stack<Integer> current_scope;
	public Map<String, Integer> MethodDeclarationTable;
		
	public DECAFTypes(){
		scope_counter = 0;
		current_scope = new Stack<Integer>();
		MethodDeclarationTable = new HashMap<String, Integer>();
	}
		
	//Declaration Scope
	
	@Override
	public String visitProgram(DECAFParser.ProgramContext ctx){
		System.out.println("visitProgram");
		//System.out.println(ctx.getText());
		scope_counter += 1;
		current_scope.push(scope_counter);
		System.out.println("--Scope counter : " + String.valueOf(scope_counter));
		String result = visitChildren(ctx);
		current_scope.pop();
		System.out.println(MethodDeclarationTable);
		return result;

	}

	@Override
	public String visitStructDeclaration(DECAFParser.StructDeclarationContext ctx){
		System.out.println("visitStructDeclaration");
		scope_counter += 1;
		current_scope.push(scope_counter);
		System.out.println("--Scope counter : " + String.valueOf(scope_counter));
		String result = visitChildren(ctx);
		return result;

	}
	
	@Override
	public String visitMethodDeclaration(DECAFParser.MethodDeclarationContext ctx){
		System.out.println("visitMethodDeclaration");
		String name;
		String signature = "";
		Integer childCount = ctx.getChildCount();
		name = ctx.getChild(1).getText();
		if(childCount > 5){
			for(int i = 0; i<childCount-5; i++){
				//First parameter is at position 3
				signature += visit(ctx.getChild(3 + i));
			}
		}
		scope_counter += 1;
		current_scope.push(scope_counter);
		System.out.println(name + " " + signature);
		MethodDeclarationTable.put(name+signature, scope_counter);
		System.out.println("--Scope counter : " + String.valueOf(scope_counter));
		String result = visitChildren(ctx);
		return result;

	}

	@Override
	public String visitIfBlock(DECAFParser.IfBlockContext ctx){
		System.out.println("visitIfBlock");
		scope_counter += 1;
		current_scope.push(scope_counter);
		System.out.println("--Scope counter : " + String.valueOf(scope_counter));
		String result = visitChildren(ctx);
		return result;
		
	}

	@Override
	public String visitWhileBlock(DECAFParser.WhileBlockContext ctx){
		System.out.println("visitWhileBlock");
		scope_counter += 1;
		current_scope.push(scope_counter);
		System.out.println("--Scope counter : " + String.valueOf(scope_counter));
		String result = visitChildren(ctx);
		return result;
	}

	//AddSubs and MulDiv operations

	@Override
	public String visitAddSubsExpression(DECAFParser.AddSubsExpressionContext ctx){
		System.out.println("visitAddSubsExpression");
		//System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			String addSubsExpression = visitChildren(ctx.addSubsExpression());
			String mulDivExpression = visitChildren(ctx.mulDivExpression());
			System.out.println("**addSubsExpressionType : "+addSubsExpression);
			System.out.println("**mulDivExpressionType : "+mulDivExpression);
			//Return Error if types are different
			return mulDivExpression;
		} else {
			String mulDivExpression = visitChildren(ctx.mulDivExpression());
			System.out.println("**mulDivExpressionType : "+mulDivExpression);
			return mulDivExpression;
		}
		
	}
	
	@Override
	public String visitMulDivExpression(DECAFParser.MulDivExpressionContext ctx){
		System.out.println("visitMulDivExpression");
		//System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			String mulDivExpression = visitChildren(ctx.mulDivExpression());
			String prExpression = visitChildren(ctx.prExpression());
			System.out.println("**mulDivExpressionType : "+mulDivExpression);
			System.out.println("**prExpressionType : "+prExpression);
			//Return Error if types are different
			return prExpression;
		} else {
			String prExpression = visitChildren(ctx.prExpression());
			System.out.println("**prExpressionType : "+prExpression);
			return prExpression;
		}
	}
	
	//Integer, Char and Boolean Literals
	
	@Override
	public String visitParameterType(DECAFParser.ParameterTypeContext ctx){
		System.out.println("__visitParameterType, " + ctx.getText());
		if(ctx.getText().equals("int")){
			return "Integer";
		}else if(ctx.getText().equals("char")){
			return "Char";
		}else if(ctx.getText().equals("boolean")){
			return "Boolean";
		}
		return "Error";
	}

	@Override 
	public String visitInt_literal(DECAFParser.Int_literalContext ctx){
		System.out.println("__visitInt_literal, " + ctx.getText());
		return "Integer";
	}
	@Override
	public String visitChar_literal(DECAFParser.Char_literalContext ctx){
		System.out.println("__visitCharLiteral, " + ctx.getText());
		return "Char";
	}
	
	@Override 
	public String visitBool_literal(DECAFParser.Bool_literalContext ctx){
		System.out.println("__visitBool_literal, " + ctx.getText());
		return "Boolean";
	}
}
