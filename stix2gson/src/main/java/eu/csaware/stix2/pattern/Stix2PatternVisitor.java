package eu.csaware.stix2.pattern;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Stix2PatternParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Stix2PatternVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(Stix2PatternParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#observationExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressions(Stix2PatternParser.ObservationExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#observationExpressionOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressionOr(Stix2PatternParser.ObservationExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#observationExpressionAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressionAnd(Stix2PatternParser.ObservationExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code observationExpressionRepeated}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressionRepeated(Stix2PatternParser.ObservationExpressionRepeatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code observationExpressionSimple}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressionSimple(Stix2PatternParser.ObservationExpressionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code observationExpressionCompound}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressionCompound(Stix2PatternParser.ObservationExpressionCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code observationExpressionWithin}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressionWithin(Stix2PatternParser.ObservationExpressionWithinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code observationExpressionStartStop}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservationExpressionStartStop(Stix2PatternParser.ObservationExpressionStartStopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(Stix2PatternParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#comparisonExpressionAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionAnd(Stix2PatternParser.ComparisonExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestEqual}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestEqual(Stix2PatternParser.PropTestEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestOrder}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestOrder(Stix2PatternParser.PropTestOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestSet}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestSet(Stix2PatternParser.PropTestSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestLike}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestLike(Stix2PatternParser.PropTestLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestRegex}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestRegex(Stix2PatternParser.PropTestRegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestIsSubset}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestIsSubset(Stix2PatternParser.PropTestIsSubsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestIsSuperset}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestIsSuperset(Stix2PatternParser.PropTestIsSupersetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propTestParen}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropTestParen(Stix2PatternParser.PropTestParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#startStopQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartStopQualifier(Stix2PatternParser.StartStopQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#withinQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithinQualifier(Stix2PatternParser.WithinQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#repeatedQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatedQualifier(Stix2PatternParser.RepeatedQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#objectPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPath(Stix2PatternParser.ObjectPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(Stix2PatternParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#firstPathComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstPathComponent(Stix2PatternParser.FirstPathComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexPathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexPathStep(Stix2PatternParser.IndexPathStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathStep(Stix2PatternParser.PathStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyPathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyPathStep(Stix2PatternParser.KeyPathStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#setLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLiteral(Stix2PatternParser.SetLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveLiteral(Stix2PatternParser.PrimitiveLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Stix2PatternParser#orderableLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderableLiteral(Stix2PatternParser.OrderableLiteralContext ctx);
}