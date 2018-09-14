package eu.csaware.stix2.pattern;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Stix2PatternParser}.
 */
public interface Stix2PatternListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Stix2PatternParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Stix2PatternParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#observationExpressions}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressions(Stix2PatternParser.ObservationExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#observationExpressions}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressions(Stix2PatternParser.ObservationExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#observationExpressionOr}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionOr(Stix2PatternParser.ObservationExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#observationExpressionOr}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionOr(Stix2PatternParser.ObservationExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#observationExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionAnd(Stix2PatternParser.ObservationExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#observationExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionAnd(Stix2PatternParser.ObservationExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionRepeated}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionRepeated(Stix2PatternParser.ObservationExpressionRepeatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionRepeated}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionRepeated(Stix2PatternParser.ObservationExpressionRepeatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionSimple}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionSimple(Stix2PatternParser.ObservationExpressionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionSimple}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionSimple(Stix2PatternParser.ObservationExpressionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionCompound}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionCompound(Stix2PatternParser.ObservationExpressionCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionCompound}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionCompound(Stix2PatternParser.ObservationExpressionCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionWithin}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionWithin(Stix2PatternParser.ObservationExpressionWithinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionWithin}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionWithin(Stix2PatternParser.ObservationExpressionWithinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionStartStop}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionStartStop(Stix2PatternParser.ObservationExpressionStartStopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionStartStop}
	 * labeled alternative in {@link Stix2PatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionStartStop(Stix2PatternParser.ObservationExpressionStartStopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(Stix2PatternParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(Stix2PatternParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#comparisonExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionAnd(Stix2PatternParser.ComparisonExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#comparisonExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionAnd(Stix2PatternParser.ComparisonExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestEqual}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestEqual(Stix2PatternParser.PropTestEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestEqual}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestEqual(Stix2PatternParser.PropTestEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestOrder}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestOrder(Stix2PatternParser.PropTestOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestOrder}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestOrder(Stix2PatternParser.PropTestOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestSet}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestSet(Stix2PatternParser.PropTestSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestSet}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestSet(Stix2PatternParser.PropTestSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestLike}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestLike(Stix2PatternParser.PropTestLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestLike}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestLike(Stix2PatternParser.PropTestLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestRegex}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestRegex(Stix2PatternParser.PropTestRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestRegex}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestRegex(Stix2PatternParser.PropTestRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestIsSubset}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestIsSubset(Stix2PatternParser.PropTestIsSubsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestIsSubset}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestIsSubset(Stix2PatternParser.PropTestIsSubsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestIsSuperset}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestIsSuperset(Stix2PatternParser.PropTestIsSupersetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestIsSuperset}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestIsSuperset(Stix2PatternParser.PropTestIsSupersetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestParen}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestParen(Stix2PatternParser.PropTestParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestParen}
	 * labeled alternative in {@link Stix2PatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestParen(Stix2PatternParser.PropTestParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#startStopQualifier}.
	 * @param ctx the parse tree
	 */
	void enterStartStopQualifier(Stix2PatternParser.StartStopQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#startStopQualifier}.
	 * @param ctx the parse tree
	 */
	void exitStartStopQualifier(Stix2PatternParser.StartStopQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#withinQualifier}.
	 * @param ctx the parse tree
	 */
	void enterWithinQualifier(Stix2PatternParser.WithinQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#withinQualifier}.
	 * @param ctx the parse tree
	 */
	void exitWithinQualifier(Stix2PatternParser.WithinQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#repeatedQualifier}.
	 * @param ctx the parse tree
	 */
	void enterRepeatedQualifier(Stix2PatternParser.RepeatedQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#repeatedQualifier}.
	 * @param ctx the parse tree
	 */
	void exitRepeatedQualifier(Stix2PatternParser.RepeatedQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#objectPath}.
	 * @param ctx the parse tree
	 */
	void enterObjectPath(Stix2PatternParser.ObjectPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#objectPath}.
	 * @param ctx the parse tree
	 */
	void exitObjectPath(Stix2PatternParser.ObjectPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(Stix2PatternParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(Stix2PatternParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#firstPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterFirstPathComponent(Stix2PatternParser.FirstPathComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#firstPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitFirstPathComponent(Stix2PatternParser.FirstPathComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexPathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterIndexPathStep(Stix2PatternParser.IndexPathStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexPathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitIndexPathStep(Stix2PatternParser.IndexPathStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterPathStep(Stix2PatternParser.PathStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitPathStep(Stix2PatternParser.PathStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyPathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterKeyPathStep(Stix2PatternParser.KeyPathStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyPathStep}
	 * labeled alternative in {@link Stix2PatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitKeyPathStep(Stix2PatternParser.KeyPathStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#setLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSetLiteral(Stix2PatternParser.SetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#setLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSetLiteral(Stix2PatternParser.SetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveLiteral(Stix2PatternParser.PrimitiveLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveLiteral(Stix2PatternParser.PrimitiveLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stix2PatternParser#orderableLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOrderableLiteral(Stix2PatternParser.OrderableLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stix2PatternParser#orderableLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOrderableLiteral(Stix2PatternParser.OrderableLiteralContext ctx);
}