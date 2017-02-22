// Generated from DECAF.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DECAFParser}.
 */
public interface DECAFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DECAFParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DECAFParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DECAFParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DECAFParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DECAFParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(DECAFParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(DECAFParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(DECAFParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(DECAFParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(DECAFParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(DECAFParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(DECAFParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(DECAFParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(DECAFParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(DECAFParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(DECAFParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(DECAFParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(DECAFParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(DECAFParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DECAFParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DECAFParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DECAFParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DECAFParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(DECAFParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(DECAFParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(DECAFParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(DECAFParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(DECAFParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(DECAFParser.ReturnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DECAFParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DECAFParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(DECAFParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(DECAFParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(DECAFParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(DECAFParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(DECAFParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(DECAFParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(DECAFParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(DECAFParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#dotLocation}.
	 * @param ctx the parse tree
	 */
	void enterDotLocation(DECAFParser.DotLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#dotLocation}.
	 * @param ctx the parse tree
	 */
	void exitDotLocation(DECAFParser.DotLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#declaredVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredVariable(DECAFParser.DeclaredVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#declaredVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredVariable(DECAFParser.DeclaredVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DECAFParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DECAFParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariable(DECAFParser.ArrayVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariable(DECAFParser.ArrayVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#expressionInP}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInP(DECAFParser.ExpressionInPContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#expressionInP}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInP(DECAFParser.ExpressionInPContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#nExpression}.
	 * @param ctx the parse tree
	 */
	void enterNExpression(DECAFParser.NExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#nExpression}.
	 * @param ctx the parse tree
	 */
	void exitNExpression(DECAFParser.NExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DECAFParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DECAFParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(DECAFParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(DECAFParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(DECAFParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(DECAFParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpression(DECAFParser.RelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpression(DECAFParser.RelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubsExpression(DECAFParser.AddSubsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubsExpression(DECAFParser.AddSubsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(DECAFParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(DECAFParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#prExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrExpression(DECAFParser.PrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#prExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrExpression(DECAFParser.PrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(DECAFParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(DECAFParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#basic}.
	 * @param ctx the parse tree
	 */
	void enterBasic(DECAFParser.BasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#basic}.
	 * @param ctx the parse tree
	 */
	void exitBasic(DECAFParser.BasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(DECAFParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(DECAFParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#declaredMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredMethodCall(DECAFParser.DeclaredMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#declaredMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredMethodCall(DECAFParser.DeclaredMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#as_op}.
	 * @param ctx the parse tree
	 */
	void enterAs_op(DECAFParser.As_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#as_op}.
	 * @param ctx the parse tree
	 */
	void exitAs_op(DECAFParser.As_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#md_op}.
	 * @param ctx the parse tree
	 */
	void enterMd_op(DECAFParser.Md_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#md_op}.
	 * @param ctx the parse tree
	 */
	void exitMd_op(DECAFParser.Md_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#pr_op}.
	 * @param ctx the parse tree
	 */
	void enterPr_op(DECAFParser.Pr_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#pr_op}.
	 * @param ctx the parse tree
	 */
	void exitPr_op(DECAFParser.Pr_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(DECAFParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(DECAFParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(DECAFParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(DECAFParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(DECAFParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(DECAFParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DECAFParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DECAFParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(DECAFParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(DECAFParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(DECAFParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(DECAFParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DECAFParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(DECAFParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DECAFParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(DECAFParser.Bool_literalContext ctx);
}