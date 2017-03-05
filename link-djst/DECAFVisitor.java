// Generated from DECAF.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DECAFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DECAFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DECAFParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DECAFParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DECAFParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(DECAFParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(DECAFParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(DECAFParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(DECAFParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(DECAFParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(DECAFParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(DECAFParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DECAFParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DECAFParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(DECAFParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(DECAFParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(DECAFParser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DECAFParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(DECAFParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(DECAFParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(DECAFParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#elseTailBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseTailBlock(DECAFParser.ElseTailBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(DECAFParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#dotLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotLocation(DECAFParser.DotLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#declaredVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredVariable(DECAFParser.DeclaredVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DECAFParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#arrayVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariable(DECAFParser.ArrayVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#expressionInP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInP(DECAFParser.ExpressionInPContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#nExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpression(DECAFParser.NExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(DECAFParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(DECAFParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#equalsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpression(DECAFParser.EqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#relationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpression(DECAFParser.RelationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#addSubsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubsExpression(DECAFParser.AddSubsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(DECAFParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#prExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrExpression(DECAFParser.PrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#basicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpression(DECAFParser.BasicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#basic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic(DECAFParser.BasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(DECAFParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#declaredMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredMethodCall(DECAFParser.DeclaredMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#as_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_op(DECAFParser.As_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#md_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd_op(DECAFParser.Md_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#pr_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_op(DECAFParser.Pr_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(DECAFParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(DECAFParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(DECAFParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DECAFParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(DECAFParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(DECAFParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DECAFParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(DECAFParser.Bool_literalContext ctx);
}