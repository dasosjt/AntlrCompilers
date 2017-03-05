import java.util.*;

public class DECAFTypes extends DECAFBaseVisitor<String> {
	public Integer scope_counter;
	public Stack<SymbolTable> symbolTablePerScope;
	public ArrayList<SymbolTable> symbolTablePerScopeArray;
	public SymbolTable globalTable;
		
	public DECAFTypes(){
		scope_counter = 0;
		symbolTablePerScope = new Stack<SymbolTable>();
		symbolTablePerScopeArray = new ArrayList<SymbolTable>();
		scope_counter += 1;
		globalTable = new SymbolTable(scope_counter, null);
	}
		
	//Declaration Scope
	
	@Override
	public String visitProgram(DECAFParser.ProgramContext ctx){
		System.out.println("visitProgram");
		//System.out.println(ctx.getText());
		symbolTablePerScope.push(globalTable);
		System.out.println("--Scope counter : " + String.valueOf(scope_counter));
		String result = visitChildren(ctx);
		if(symbolTablePerScope.peek().lookup("main", 0) == 1){
			symbolTablePerScope.pop();
			//System.out.println("Symbol Table "+SymbolTable);
			return result;
		} else {
			return "Error";
		}

	}


	@Override
	public String visitStructDeclaration(DECAFParser.StructDeclarationContext ctx){
		System.out.println("visitStructDeclaration");
		String id = ctx.getChild(1).getText();		
		System.out.println("--Scope counter : "+scope_counter);
		if(symbolTablePerScope.peek().lookup(id, 0) == 0){
			//scope counter plus;
			//
			scope_counter += 1;
			//father
			SymbolTable symbTable = new SymbolTable(scope_counter, symbolTablePerScope.peek());
			symbolTablePerScope.peek().insert(id, new Symbol(id, symbTable, id));
			symbolTablePerScope.peek().print();
			//children
			symbolTablePerScope.peek().children.add(symbTable);
			//new current symbTable
			symbolTablePerScope.push(symbTable);
		} else {
			return "Error";
		}
		String result = visitChildren(ctx);
		symbolTablePerScope.pop();
		return result;

	}
	
	@Override
	public String visitMethodDeclaration(DECAFParser.MethodDeclarationContext ctx){
		System.out.println("visitMethodDeclaration");
		ArrayList<String> parameters = new ArrayList<String>();
		String signature = "";
		String id = ctx.getChild(1).getText();
		String varType = ctx.getChild(0).getText();
		//We want the production that has x parameters, so x = childCount - 5
		//The number 5 is because of the normal parameters that always appear
		if(ctx.getChildCount() > 5){
			Integer i = 0;
			while(i<ctx.getChildCount()-5){
				//Until we see "," then we can say that the signature has multiple parameters
				if(!ctx.getChild(3+i).getText().equals(",")){
					System.out.println("Parameter " + i + " " + ctx.getChild(3+i).getText());
					//Simple Parameter
					if(ctx.getChild(3+i).getChildCount() == 2){
						parameters.add(ctx.getChild(3+i).getChild(0).getText());
						signature += ctx.getChild(3+i).getChild(0).getText();
					} else { //[] Parameter
						String temp_parameter = ctx.getChild(3+i).getChild(0).getText();
						temp_parameter += ctx.getChild(3+i).getChild(2).getText();
						temp_parameter += ctx.getChild(3+i).getChild(3).getText();
						parameters.add(temp_parameter);
						signature += temp_parameter;

					}
				}
				i++;
			}
		}

		if(signature.equals("")){
			System.out.println("Method : "+ id + ", no Signature ");
		} else {
			System.out.println("Method : "+ id + ", Signature: " + signature);
		}
		id = id + signature;
		scope_counter += 1;
		if(symbolTablePerScope.peek().lookup(id, 0) == 0){
			symbolTablePerScope.peek().insert(id, new Symbol(id, parameters, varType));
			symbolTablePerScope.peek().print();
			//father
			SymbolTable symbTable = new SymbolTable(scope_counter, symbolTablePerScope.peek());
			//children
			symbolTablePerScope.peek().children.add(symbTable);
			//new current symbTable
			symbolTablePerScope.push(symbTable);
		} else {
			return "Error";
		}
		System.out.println("--Scope counter : "+scope_counter);
		String result = visitChildren(ctx);
		symbolTablePerScope.pop();
		return result;
	}

	@Override
	public String visitParameterDeclaration(DECAFParser.ParameterDeclarationContext ctx){
		System.out.println("visitParameterDeclaration");
		String varType = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		//parameterType ID LCORCH RCORCH
		if((symbolTablePerScope.peek().lookup(id, 0) == 0) || (symbolTablePerScope.peek().lookup(id, 0) != 1)){//Can't be declared in the same scope
			//or Could have never been declared
			if(ctx.getChildCount() == 4){
				varType = varType + "[]";
				symbolTablePerScope.peek().insert(id, new Symbol(id, true, 0, varType));
			} else { //parameterType ID
				symbolTablePerScope.peek().insert(id, new Symbol(id, false, 0, varType));
			}
			symbolTablePerScope.peek().print();
			return "";
		} else {
			return "Error";
		}
	}
	
	@Override
	public String visitVarDeclaration(DECAFParser.VarDeclarationContext ctx){
		System.out.println("visitVarDeclaration");
		String varType = ctx.getChild(0).getText();
		String id = ctx.getChild(1).getText();
		if((symbolTablePerScope.peek().lookup(id, 0) == 0) || (symbolTablePerScope.peek().lookup(id, 0) != 1)){
			//varType ID LCORCH NUM RCORCH DOTCOMMA
			if(ctx.getChildCount() == 6){
				Integer arraySize = Integer.parseInt(ctx.getChild(3).getText());
				varType = varType + "[]";
				symbolTablePerScope.peek().insert(id, new Symbol(id, true, arraySize, varType));
				symbolTablePerScope.peek().print();
			} else { //varType ID DOTCOMMA 
				SymbolTable symbolTable = new SymbolTable(scope_counter, symbolTablePerScope.peek());
				symbolTablePerScope.peek().insert(id, new Symbol(id, false, 0, varType));
				symbolTablePerScope.peek().print();
			}
			System.out.println(ctx.getText());
			String result = visitChildren(ctx);
			return result;
		} else {
			return "Error";
		}
	}

	//Im not pretty sure if new blocks marks a new scope
	@Override
	public String visitIfBlock(DECAFParser.IfBlockContext ctx){
		System.out.println("visitIfBlock");
		scope_counter += 1;
		System.out.println("--Scope counter : "+String.valueOf(scope_counter));
		//father
		SymbolTable symbTable = new SymbolTable(scope_counter, symbolTablePerScope.peek());
		//children
		symbolTablePerScope.peek().children.add(symbTable);
		//new current symbTable
		symbolTablePerScope.push(symbTable);
		//IF LPARENT orExpression RPARENT block elseBlock
		String bool = visit(ctx.getChild(2));
		System.out.println(bool);
		String block = visit(ctx.getChild(4));
		String elseBlock = visit(ctx.getChild(5));
		symbolTablePerScope.pop();
		if(!bool.equals("boolean")){
			System.out.println("Error boolean");
			return "Error";	
		}
		System.out.println("Its boolean");
		return "";
	}

	@Override
	public String visitWhileBlock(DECAFParser.WhileBlockContext ctx){
		System.out.println("visitWhileBlock");
		scope_counter += 1;
		System.out.println("--Scope counter : "+String.valueOf(scope_counter));
		//father
		SymbolTable symbTable = new SymbolTable(scope_counter, symbolTablePerScope.peek());
		//children
		symbolTablePerScope.peek().children.add(symbTable);
		//new current symbTable
		symbolTablePerScope.push(symbTable);
		//WHILE LPARENT orExpression RPARENT block
		String bool = visit(ctx.getChild(2));
		String block = visit(ctx.getChild(4));
		symbolTablePerScope.pop();
		if(!bool.equals("boolean")){
			System.out.println("Error boolean");
			return "Error";
		}
		System.out.println("Its boolean");
		return "";
	}

	//assignation
	
	@Override 
	public String visitAssignation(DECAFParser.AssignationContext ctx){
		System.out.println("visitAssignation");
		System.out.println(String.valueOf(ctx.getChildCount()));
		//location EQ (expression | scan) DOTCOMMA
		String location = visit(ctx.getChild(0));
		String eq = ctx.getChild(1).getText();
		String expressionscan = visit(ctx.getChild(2));
		//print
		System.out.println("**locationType : "+location);
		System.out.println("**eq : "+eq);
		System.out.println("**(expression|scan)Type : "+expressionscan);
		//Return Error if types are different
		if(location.equals(expressionscan)){
			return location;
		} else {
			System.out.println("Error");
			return "Error";
		}
	}

	//AND, EQ, OR and RELATION operations
	
	@Override
	public String visitOrExpression(DECAFParser.OrExpressionContext ctx){
		System.out.println("visitOrExpression");
		System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			//orExpression OR andExpression
			String orExpression = visit(ctx.getChild(0));
			String or = visit(ctx.getChild(1));
			String andExpression = visit(ctx.getChild(2));
			//print
			System.out.println("**orExpressionType : "+orExpression);
			System.out.println("**or : "+or);
			System.out.println("**andExpressionType : "+andExpression);
			if(orExpression.equals(andExpression)){
				return orExpression;
			} else {
				return "Error";
			}
		} else {
			//andExpression
			String andExpression = visit(ctx.getChild(0));
			System.out.println("**andExpressionType : "+andExpression);
			return andExpression;
		}
	}

	@Override
	public String visitAndExpression(DECAFParser.AndExpressionContext ctx){
		System.out.println("visitAndExpression");
		System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			//andExpression AND equalsExpression
			String andExpression = visit(ctx.getChild(0));
			String and = visit(ctx.getChild(1));
			String equalsExpression = visit(ctx.getChild(2));
			//print 
			System.out.println("**andExpressionType : "+andExpression);
			System.out.println("**and : "+and);
			System.out.println("**equalsExpressionType : "+equalsExpression);
			if(andExpression.equals(equalsExpression)){
				return andExpression;
			} else {
				return "Error";
			}
		} else {
			//equalsExpression
			String equalsExpression = visitChildren(ctx);
			System.out.println("**equalsExpressionType :"+equalsExpression);
			return equalsExpression;
		}
	}

	@Override
	public String visitEqualsExpression(DECAFParser.EqualsExpressionContext ctx){
		System.out.println("visitEqualsExpression");
		System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			//equalsExpression eq_op relationExpression
			String equalsExpression = visit(ctx.getChild(0));
			String eq_op = visit(ctx.getChild(1));
			String relationExpression = visit(ctx.getChild(2));
			//print 
			System.out.println("**equalsExpressionType : "+equalsExpression);
			System.out.println("**eq_op : "+eq_op);
			System.out.println("**relationExpressionType : "+relationExpression);
			//both most be boolean
			if((equalsExpression.equals(relationExpression)) && (equalsExpression.equals("boolean"))){
				return equalsExpression;
			} else {
				return "Error";
			}
		} else {
			//relationExpression
			String relationExpression = visit(ctx.getChild(0));
			System.out.println("**relationExpressionType : "+relationExpression);
			return relationExpression;
		}
	}

	@Override
	public String visitRelationExpression(DECAFParser.RelationExpressionContext ctx){
		System.out.println("visitRelationExpression");
		System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			//relationExpression rel_op addSubsExpression
			String relationExpression = visit(ctx.getChild(0));
			String rel_op = visit(ctx.getChild(1));
			String addSubsExpression = visit(ctx.getChild(2));
			//print
			System.out.println("**relationExpresionType : "+relationExpression);
			System.out.println("**rel_op : "+rel_op);
			System.out.println("**addSubsExpression : "+addSubsExpression);
			if((relationExpression.equals(addSubsExpression)) && (relationExpression.equals("int"))){
				return relationExpression;
			} else {
				return "Error";
			}
		} else {
			//addSubsExpression
			String addSubsExpression = visit(ctx.getChild(0));
			System.out.println("**addSubsExpression : "+addSubsExpression);
			return addSubsExpression;
		}	
	}

	//AddSubs and MulDiv operations

	@Override
	public String visitAddSubsExpression(DECAFParser.AddSubsExpressionContext ctx){
		System.out.println("visitAddSubsExpression");
		System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			//addSubsExpression as_op mulDivExpression
			String addSubsExpression = visit(ctx.getChild(0));
			String as_op = ctx.getChild(1).getText();
			String mulDivExpression = visit(ctx.getChild(2));
			//print
			System.out.println("**addSubsExpressionType : "+addSubsExpression);
			System.out.println("**as_op : "+as_op);
			System.out.println("**mulDivExpressionType : "+mulDivExpression);
			//Return Error if types are different, and both most be int
			if((addSubsExpression.equals(mulDivExpression)) && (addSubsExpression.equals("int"))){
				return addSubsExpression;
			} else {
				return "Error";
			}
		} else {
			//MulDivExpression
			String mulDivExpression = visitChildren(ctx);
			System.out.println("**mulDivExpressionType : "+mulDivExpression);
			return mulDivExpression;
		}
		
	}
	
	@Override
	public String visitMulDivExpression(DECAFParser.MulDivExpressionContext ctx){
		System.out.println("visitMulDivExpression");
		System.out.println(String.valueOf(ctx.getChildCount()));
		if(ctx.getChildCount() == 3){
			//mulDivExpression md_op prExpression
			String mulDivExpression = visit(ctx.getChild(0));
			String md_op = ctx.getChild(1).getText();
			String prExpression = visit(ctx.getChild(2));
			//print
			System.out.println("**mulDivExpressionType : "+mulDivExpression);
			System.out.println("**md_op : " + md_op);
			System.out.println("**prExpressionType : "+prExpression);
			//Return Error if types are different, and both most be int
			if((mulDivExpression.equals(prExpression)) && (mulDivExpression.equals("int"))){
				return mulDivExpression;
			} else {
				return "Error";
			}
		} else {
			//prExpression
			String prExpression = visitChildren(ctx);
			System.out.println("**prExpressionType : "+prExpression);
			return prExpression;
		}
	}

	//Declared Method Call
	
	@Override
	public String visitDeclaredMethodCall(DECAFParser.DeclaredMethodCallContext ctx){
		System.out.println("visitDeclaredMethodCall");
		String id = ctx.getChild(0).getText();
		String signature = "";
		//We want the production that has x parameters, so x = childCount - 3
		//The number 3 is because of the normal tokens that always appear
		if(ctx.getChildCount() > 3){
			Integer i = 0;
			while(i<ctx.getChildCount()-3){
				//Until we see "," then we can say that the signature has multiple parameters
				if(!ctx.getChild(2+i).getText().equals(",")){
					System.out.println("Parameter " + i + " " + ctx.getChild(2+i).getText());
					signature += visit(ctx.getChild(2+i).getChild(0));
				}
				i++;
			}
		}

		if(signature.equals("")){
			System.out.println("Method : "+ id + ", no Signature ");
		} else {
			System.out.println("Method : "+ id + ", Signature: " + signature);
		}
		id = id + signature;
		if(symbolTablePerScope.peek().lookup(id, 0) != 0){
			Integer scope_number_up = symbolTablePerScope.peek().lookup(id, 0);
			System.out.println(String.valueOf(scope_number_up));
			return symbolTablePerScope.peek().getType(id, scope_number_up);
		}
		return "Error";

	}

	//Location
	
	@Override 
	public String visitLocation(DECAFParser.LocationContext ctx){
		System.out.println("visitLocation");
		if(ctx.getChild(0).getChildCount() == 3 && ctx.getChild(0).getChild(2).getChild(0).getChildCount() == 1){
			System.out.println("variable/arraVariable ( DOT Location )");
			String id = ctx.getChild(0).getChild(0).getChild(0).getText();
			//So.. we have to track down this variable in struct declaration..
			//and all the struct declaration belongs to the global scope.
			System.out.println("variable/arrayVariable ID : "+id);
			String var = visit(ctx.getChild(0).getChild(2));
			System.out.println("var : "+ var);
			globalTable.print();
			Integer level = symbolTablePerScope.peek().lookup(id, 0);
			if(level != 0){
				String structType = symbolTablePerScope.peek().getType(id, level);
				if(globalTable.lookupGlobal(structType)){
					System.out.println("Found "+ structType + " in GlobalTable");
					if(globalTable.searchSymbol(structType).variables.lookup(var, 0) == 1){
						System.out.println("we have found that symbol ID in its variables has the variable..\n so we need to return the type");
						Integer structVariableTypeLevel = globalTable.searchSymbol(structType).variables.lookup(var, 0);
						return globalTable.searchSymbol(structType).variables.getType(var, structVariableTypeLevel);
					}
				}
			}
		} else if(ctx.getChild(0).getChildCount() == 3 && ctx.getChild(0).getChild(2).getChild(0).getChildCount() == 3){
			System.out.println("looking for the real");
			return visit(ctx.getChild(0).getChild(2));
		} else {
			System.out.println("Just Location");
			String id = ctx.getChild(0).getChild(0).getText();
			System.out.println("Location ID : "+id);
			return id;
		}
		return "Error";

	}

	//Variable location
	
	@Override
	public String visitVariable(DECAFParser.VariableContext ctx){
		System.out.println("visitVariable");
		String id = ctx.getChild(0).getText();
		System.out.println(id);
		if(symbolTablePerScope.peek().lookup(id, 0) != 0){
			Integer scope_number_up = symbolTablePerScope.peek().lookup(id, 0);
			System.out.println(String.valueOf(scope_number_up));
			return symbolTablePerScope.peek().getType(id, scope_number_up);
		}
		return "Error";
	}

	@Override 
	public String visitArrayVariable(DECAFParser.ArrayVariableContext ctx){
		System.out.println("visitArrayVariable");
		String id = ctx.getChild(0).getText();
		String number = visit(ctx.getChild(2));
		if(number.equals("int")){
			if((symbolTablePerScope.peek().lookup(id, 0) != 0) && (number.equals("int"))){
				Integer scope_number_up = symbolTablePerScope.peek().lookup(id, 0);
				System.out.println(String.valueOf(scope_number_up));
				if(symbolTablePerScope.peek().isArray(id, scope_number_up)){
					return symbolTablePerScope.peek().getType(id, scope_number_up);
				}
			}
		}
		return "Error";
	}
	
	//Integer, Char and Boolean Literals
	
	@Override
	public String visitParameterType(DECAFParser.ParameterTypeContext ctx){
		System.out.println("__visitParameterType, " + ctx.getText());
		if(ctx.getText().equals("int")){
			return "int";
		}else if(ctx.getText().equals("char")){
			return "char";
		}else if(ctx.getText().equals("boolean")){
			return "boolean";
		}
		return "Error";
	}

	@Override 
	public String visitInt_literal(DECAFParser.Int_literalContext ctx){
		System.out.println("__visitInt_literal, " + ctx.getText());
		return "int";
	}
	@Override
	public String visitChar_literal(DECAFParser.Char_literalContext ctx){
		System.out.println("__visitCharLiteral, " + ctx.getText());
		return "char";
	}
	@Override 
	public String visitBool_literal(DECAFParser.Bool_literalContext ctx){
		System.out.println("__visitBool_literal, " + ctx.getText());
		return "boolean";
	}
}
