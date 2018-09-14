package eu.csaware.stix2.pattern;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Stix2PatternParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntNegLiteral=1, IntPosLiteral=2, FloatNegLiteral=3, FloatPosLiteral=4, 
		HexLiteral=5, BinaryLiteral=6, StringLiteral=7, BoolLiteral=8, TimestampLiteral=9, 
		AND=10, OR=11, NOT=12, FOLLOWEDBY=13, LIKE=14, MATCHES=15, ISSUPERSET=16, 
		ISSUBSET=17, LAST=18, IN=19, START=20, STOP=21, SECONDS=22, TRUE=23, FALSE=24, 
		WITHIN=25, REPEATS=26, TIMES=27, IdentifierWithoutHyphen=28, IdentifierWithHyphen=29, 
		EQ=30, NEQ=31, LT=32, LE=33, GT=34, GE=35, QUOTE=36, COLON=37, DOT=38, 
		COMMA=39, RPAREN=40, LPAREN=41, RBRACK=42, LBRACK=43, PLUS=44, HYPHEN=45, 
		MINUS=46, POWER_OP=47, DIVIDE=48, ASTERISK=49, WS=50, COMMENT=51, LINE_COMMENT=52, 
		InvalidCharacter=53;
	public static final int
		RULE_pattern = 0, RULE_observationExpressions = 1, RULE_observationExpressionOr = 2, 
		RULE_observationExpressionAnd = 3, RULE_observationExpression = 4, RULE_comparisonExpression = 5, 
		RULE_comparisonExpressionAnd = 6, RULE_propTest = 7, RULE_startStopQualifier = 8, 
		RULE_withinQualifier = 9, RULE_repeatedQualifier = 10, RULE_objectPath = 11, 
		RULE_objectType = 12, RULE_firstPathComponent = 13, RULE_objectPathComponent = 14, 
		RULE_setLiteral = 15, RULE_primitiveLiteral = 16, RULE_orderableLiteral = 17;
	public static final String[] ruleNames = {
		"pattern", "observationExpressions", "observationExpressionOr", "observationExpressionAnd", 
		"observationExpression", "comparisonExpression", "comparisonExpressionAnd", 
		"propTest", "startStopQualifier", "withinQualifier", "repeatedQualifier", 
		"objectPath", "objectType", "firstPathComponent", "objectPathComponent", 
		"setLiteral", "primitiveLiteral", "orderableLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'AND'", "'OR'", 
		"'NOT'", "'FOLLOWEDBY'", "'LIKE'", "'MATCHES'", "'ISSUPERSET'", "'ISSUBSET'", 
		"'LAST'", "'IN'", "'START'", "'STOP'", "'SECONDS'", "'true'", "'false'", 
		"'WITHIN'", "'REPEATS'", "'TIMES'", null, null, null, null, "'<'", "'<='", 
		"'>'", "'>='", "'''", "':'", "'.'", "','", "')'", "'('", "']'", "'['", 
		"'+'", null, "'-'", "'^'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IntNegLiteral", "IntPosLiteral", "FloatNegLiteral", "FloatPosLiteral", 
		"HexLiteral", "BinaryLiteral", "StringLiteral", "BoolLiteral", "TimestampLiteral", 
		"AND", "OR", "NOT", "FOLLOWEDBY", "LIKE", "MATCHES", "ISSUPERSET", "ISSUBSET", 
		"LAST", "IN", "START", "STOP", "SECONDS", "TRUE", "FALSE", "WITHIN", "REPEATS", 
		"TIMES", "IdentifierWithoutHyphen", "IdentifierWithHyphen", "EQ", "NEQ", 
		"LT", "LE", "GT", "GE", "QUOTE", "COLON", "DOT", "COMMA", "RPAREN", "LPAREN", 
		"RBRACK", "LBRACK", "PLUS", "HYPHEN", "MINUS", "POWER_OP", "DIVIDE", "ASTERISK", 
		"WS", "COMMENT", "LINE_COMMENT", "InvalidCharacter"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Stix2Pattern.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Stix2PatternParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PatternContext extends ParserRuleContext {
		public ObservationExpressionsContext observationExpressions() {
			return getRuleContext(ObservationExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Stix2PatternParser.EOF, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			observationExpressions(0);
			setState(37);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObservationExpressionsContext extends ParserRuleContext {
		public ObservationExpressionOrContext observationExpressionOr() {
			return getRuleContext(ObservationExpressionOrContext.class,0);
		}
		public List<ObservationExpressionsContext> observationExpressions() {
			return getRuleContexts(ObservationExpressionsContext.class);
		}
		public ObservationExpressionsContext observationExpressions(int i) {
			return getRuleContext(ObservationExpressionsContext.class,i);
		}
		public TerminalNode FOLLOWEDBY() { return getToken(Stix2PatternParser.FOLLOWEDBY, 0); }
		public ObservationExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservationExpressionsContext observationExpressions() throws RecognitionException {
		return observationExpressions(0);
	}

	private ObservationExpressionsContext observationExpressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionsContext _localctx = new ObservationExpressionsContext(_ctx, _parentState);
		ObservationExpressionsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_observationExpressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			observationExpressionOr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObservationExpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_observationExpressions);
					setState(42);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(43);
					match(FOLLOWEDBY);
					setState(44);
					observationExpressions(3);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObservationExpressionOrContext extends ParserRuleContext {
		public ObservationExpressionAndContext observationExpressionAnd() {
			return getRuleContext(ObservationExpressionAndContext.class,0);
		}
		public List<ObservationExpressionOrContext> observationExpressionOr() {
			return getRuleContexts(ObservationExpressionOrContext.class);
		}
		public ObservationExpressionOrContext observationExpressionOr(int i) {
			return getRuleContext(ObservationExpressionOrContext.class,i);
		}
		public TerminalNode OR() { return getToken(Stix2PatternParser.OR, 0); }
		public ObservationExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservationExpressionOrContext observationExpressionOr() throws RecognitionException {
		return observationExpressionOr(0);
	}

	private ObservationExpressionOrContext observationExpressionOr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionOrContext _localctx = new ObservationExpressionOrContext(_ctx, _parentState);
		ObservationExpressionOrContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_observationExpressionOr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			observationExpressionAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObservationExpressionOrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_observationExpressionOr);
					setState(53);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(54);
					match(OR);
					setState(55);
					observationExpressionOr(3);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObservationExpressionAndContext extends ParserRuleContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public List<ObservationExpressionAndContext> observationExpressionAnd() {
			return getRuleContexts(ObservationExpressionAndContext.class);
		}
		public ObservationExpressionAndContext observationExpressionAnd(int i) {
			return getRuleContext(ObservationExpressionAndContext.class,i);
		}
		public TerminalNode AND() { return getToken(Stix2PatternParser.AND, 0); }
		public ObservationExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservationExpressionAndContext observationExpressionAnd() throws RecognitionException {
		return observationExpressionAnd(0);
	}

	private ObservationExpressionAndContext observationExpressionAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionAndContext _localctx = new ObservationExpressionAndContext(_ctx, _parentState);
		ObservationExpressionAndContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_observationExpressionAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			observationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObservationExpressionAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_observationExpressionAnd);
					setState(64);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(65);
					match(AND);
					setState(66);
					observationExpressionAnd(3);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObservationExpressionContext extends ParserRuleContext {
		public ObservationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpression; }
	 
		public ObservationExpressionContext() { }
		public void copyFrom(ObservationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObservationExpressionRepeatedContext extends ObservationExpressionContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public RepeatedQualifierContext repeatedQualifier() {
			return getRuleContext(RepeatedQualifierContext.class,0);
		}
		public ObservationExpressionRepeatedContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressionRepeated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressionRepeated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressionRepeated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObservationExpressionSimpleContext extends ObservationExpressionContext {
		public TerminalNode LBRACK() { return getToken(Stix2PatternParser.LBRACK, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Stix2PatternParser.RBRACK, 0); }
		public ObservationExpressionSimpleContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressionSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressionSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressionSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObservationExpressionCompoundContext extends ObservationExpressionContext {
		public TerminalNode LPAREN() { return getToken(Stix2PatternParser.LPAREN, 0); }
		public ObservationExpressionsContext observationExpressions() {
			return getRuleContext(ObservationExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Stix2PatternParser.RPAREN, 0); }
		public ObservationExpressionCompoundContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressionCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressionCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressionCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObservationExpressionWithinContext extends ObservationExpressionContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public WithinQualifierContext withinQualifier() {
			return getRuleContext(WithinQualifierContext.class,0);
		}
		public ObservationExpressionWithinContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressionWithin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressionWithin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressionWithin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObservationExpressionStartStopContext extends ObservationExpressionContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public StartStopQualifierContext startStopQualifier() {
			return getRuleContext(StartStopQualifierContext.class,0);
		}
		public ObservationExpressionStartStopContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObservationExpressionStartStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObservationExpressionStartStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObservationExpressionStartStop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservationExpressionContext observationExpression() throws RecognitionException {
		return observationExpression(0);
	}

	private ObservationExpressionContext observationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionContext _localctx = new ObservationExpressionContext(_ctx, _parentState);
		ObservationExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_observationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				_localctx = new ObservationExpressionSimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(LBRACK);
				setState(74);
				comparisonExpression(0);
				setState(75);
				match(RBRACK);
				}
				break;
			case LPAREN:
				{
				_localctx = new ObservationExpressionCompoundContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(LPAREN);
				setState(78);
				observationExpressions(0);
				setState(79);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ObservationExpressionStartStopContext(new ObservationExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_observationExpression);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						startStopQualifier();
						}
						break;
					case 2:
						{
						_localctx = new ObservationExpressionWithinContext(new ObservationExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_observationExpression);
						setState(85);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(86);
						withinQualifier();
						}
						break;
					case 3:
						{
						_localctx = new ObservationExpressionRepeatedContext(new ObservationExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_observationExpression);
						setState(87);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(88);
						repeatedQualifier();
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionAndContext comparisonExpressionAnd() {
			return getRuleContext(ComparisonExpressionAndContext.class,0);
		}
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(Stix2PatternParser.OR, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		return comparisonExpression(0);
	}

	private ComparisonExpressionContext comparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, _parentState);
		ComparisonExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_comparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95);
			comparisonExpressionAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
					setState(97);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(98);
					match(OR);
					setState(99);
					comparisonExpression(3);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionAndContext extends ParserRuleContext {
		public PropTestContext propTest() {
			return getRuleContext(PropTestContext.class,0);
		}
		public List<ComparisonExpressionAndContext> comparisonExpressionAnd() {
			return getRuleContexts(ComparisonExpressionAndContext.class);
		}
		public ComparisonExpressionAndContext comparisonExpressionAnd(int i) {
			return getRuleContext(ComparisonExpressionAndContext.class,i);
		}
		public TerminalNode AND() { return getToken(Stix2PatternParser.AND, 0); }
		public ComparisonExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterComparisonExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitComparisonExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitComparisonExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionAndContext comparisonExpressionAnd() throws RecognitionException {
		return comparisonExpressionAnd(0);
	}

	private ComparisonExpressionAndContext comparisonExpressionAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionAndContext _localctx = new ComparisonExpressionAndContext(_ctx, _parentState);
		ComparisonExpressionAndContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_comparisonExpressionAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			propTest();
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonExpressionAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpressionAnd);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					match(AND);
					setState(110);
					comparisonExpressionAnd(3);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropTestContext extends ParserRuleContext {
		public PropTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propTest; }
	 
		public PropTestContext() { }
		public void copyFrom(PropTestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropTestRegexContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode MATCHES() { return getToken(Stix2PatternParser.MATCHES, 0); }
		public TerminalNode StringLiteral() { return getToken(Stix2PatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(Stix2PatternParser.NOT, 0); }
		public PropTestRegexContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropTestOrderContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public OrderableLiteralContext orderableLiteral() {
			return getRuleContext(OrderableLiteralContext.class,0);
		}
		public TerminalNode GT() { return getToken(Stix2PatternParser.GT, 0); }
		public TerminalNode LT() { return getToken(Stix2PatternParser.LT, 0); }
		public TerminalNode GE() { return getToken(Stix2PatternParser.GE, 0); }
		public TerminalNode LE() { return getToken(Stix2PatternParser.LE, 0); }
		public TerminalNode NOT() { return getToken(Stix2PatternParser.NOT, 0); }
		public PropTestOrderContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestOrder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropTestLikeContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(Stix2PatternParser.LIKE, 0); }
		public TerminalNode StringLiteral() { return getToken(Stix2PatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(Stix2PatternParser.NOT, 0); }
		public PropTestLikeContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropTestEqualContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public PrimitiveLiteralContext primitiveLiteral() {
			return getRuleContext(PrimitiveLiteralContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Stix2PatternParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(Stix2PatternParser.NEQ, 0); }
		public TerminalNode NOT() { return getToken(Stix2PatternParser.NOT, 0); }
		public PropTestEqualContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropTestSetContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode IN() { return getToken(Stix2PatternParser.IN, 0); }
		public SetLiteralContext setLiteral() {
			return getRuleContext(SetLiteralContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Stix2PatternParser.NOT, 0); }
		public PropTestSetContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropTestIsSubsetContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode ISSUBSET() { return getToken(Stix2PatternParser.ISSUBSET, 0); }
		public TerminalNode StringLiteral() { return getToken(Stix2PatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(Stix2PatternParser.NOT, 0); }
		public PropTestIsSubsetContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestIsSubset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestIsSubset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestIsSubset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropTestParenContext extends PropTestContext {
		public TerminalNode LPAREN() { return getToken(Stix2PatternParser.LPAREN, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Stix2PatternParser.RPAREN, 0); }
		public PropTestParenContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropTestIsSupersetContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode ISSUPERSET() { return getToken(Stix2PatternParser.ISSUPERSET, 0); }
		public TerminalNode StringLiteral() { return getToken(Stix2PatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(Stix2PatternParser.NOT, 0); }
		public PropTestIsSupersetContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPropTestIsSuperset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPropTestIsSuperset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPropTestIsSuperset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropTestContext propTest() throws RecognitionException {
		PropTestContext _localctx = new PropTestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propTest);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PropTestEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				objectPath();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(117);
					match(NOT);
					}
				}

				setState(120);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				primitiveLiteral();
				}
				break;
			case 2:
				_localctx = new PropTestOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				objectPath();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(124);
					match(NOT);
					}
				}

				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				orderableLiteral();
				}
				break;
			case 3:
				_localctx = new PropTestSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				objectPath();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(131);
					match(NOT);
					}
				}

				setState(134);
				match(IN);
				setState(135);
				setLiteral();
				}
				break;
			case 4:
				_localctx = new PropTestLikeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				objectPath();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(138);
					match(NOT);
					}
				}

				setState(141);
				match(LIKE);
				setState(142);
				match(StringLiteral);
				}
				break;
			case 5:
				_localctx = new PropTestRegexContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				objectPath();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(145);
					match(NOT);
					}
				}

				setState(148);
				match(MATCHES);
				setState(149);
				match(StringLiteral);
				}
				break;
			case 6:
				_localctx = new PropTestIsSubsetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				objectPath();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(152);
					match(NOT);
					}
				}

				setState(155);
				match(ISSUBSET);
				setState(156);
				match(StringLiteral);
				}
				break;
			case 7:
				_localctx = new PropTestIsSupersetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				objectPath();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(159);
					match(NOT);
					}
				}

				setState(162);
				match(ISSUPERSET);
				setState(163);
				match(StringLiteral);
				}
				break;
			case 8:
				_localctx = new PropTestParenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				match(LPAREN);
				setState(166);
				comparisonExpression(0);
				setState(167);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartStopQualifierContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(Stix2PatternParser.START, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(Stix2PatternParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(Stix2PatternParser.StringLiteral, i);
		}
		public TerminalNode STOP() { return getToken(Stix2PatternParser.STOP, 0); }
		public StartStopQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startStopQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterStartStopQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitStartStopQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitStartStopQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartStopQualifierContext startStopQualifier() throws RecognitionException {
		StartStopQualifierContext _localctx = new StartStopQualifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_startStopQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(START);
			setState(172);
			match(StringLiteral);
			setState(173);
			match(STOP);
			setState(174);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithinQualifierContext extends ParserRuleContext {
		public TerminalNode WITHIN() { return getToken(Stix2PatternParser.WITHIN, 0); }
		public TerminalNode SECONDS() { return getToken(Stix2PatternParser.SECONDS, 0); }
		public TerminalNode IntPosLiteral() { return getToken(Stix2PatternParser.IntPosLiteral, 0); }
		public TerminalNode FloatPosLiteral() { return getToken(Stix2PatternParser.FloatPosLiteral, 0); }
		public WithinQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withinQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterWithinQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitWithinQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitWithinQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithinQualifierContext withinQualifier() throws RecognitionException {
		WithinQualifierContext _localctx = new WithinQualifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_withinQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(WITHIN);
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==IntPosLiteral || _la==FloatPosLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			match(SECONDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatedQualifierContext extends ParserRuleContext {
		public TerminalNode REPEATS() { return getToken(Stix2PatternParser.REPEATS, 0); }
		public TerminalNode IntPosLiteral() { return getToken(Stix2PatternParser.IntPosLiteral, 0); }
		public TerminalNode TIMES() { return getToken(Stix2PatternParser.TIMES, 0); }
		public RepeatedQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatedQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterRepeatedQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitRepeatedQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitRepeatedQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatedQualifierContext repeatedQualifier() throws RecognitionException {
		RepeatedQualifierContext _localctx = new RepeatedQualifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeatedQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(REPEATS);
			setState(181);
			match(IntPosLiteral);
			setState(182);
			match(TIMES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPathContext extends ParserRuleContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Stix2PatternParser.COLON, 0); }
		public FirstPathComponentContext firstPathComponent() {
			return getRuleContext(FirstPathComponentContext.class,0);
		}
		public ObjectPathComponentContext objectPathComponent() {
			return getRuleContext(ObjectPathComponentContext.class,0);
		}
		public ObjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObjectPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObjectPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObjectPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPathContext objectPath() throws RecognitionException {
		ObjectPathContext _localctx = new ObjectPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			objectType();
			setState(185);
			match(COLON);
			setState(186);
			firstPathComponent();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==LBRACK) {
				{
				setState(187);
				objectPathComponent(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode IdentifierWithoutHyphen() { return getToken(Stix2PatternParser.IdentifierWithoutHyphen, 0); }
		public TerminalNode IdentifierWithHyphen() { return getToken(Stix2PatternParser.IdentifierWithHyphen, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==IdentifierWithoutHyphen || _la==IdentifierWithHyphen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstPathComponentContext extends ParserRuleContext {
		public TerminalNode IdentifierWithoutHyphen() { return getToken(Stix2PatternParser.IdentifierWithoutHyphen, 0); }
		public TerminalNode StringLiteral() { return getToken(Stix2PatternParser.StringLiteral, 0); }
		public FirstPathComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstPathComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterFirstPathComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitFirstPathComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitFirstPathComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstPathComponentContext firstPathComponent() throws RecognitionException {
		FirstPathComponentContext _localctx = new FirstPathComponentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_firstPathComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==IdentifierWithoutHyphen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPathComponentContext extends ParserRuleContext {
		public ObjectPathComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPathComponent; }
	 
		public ObjectPathComponentContext() { }
		public void copyFrom(ObjectPathComponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexPathStepContext extends ObjectPathComponentContext {
		public TerminalNode LBRACK() { return getToken(Stix2PatternParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Stix2PatternParser.RBRACK, 0); }
		public TerminalNode IntPosLiteral() { return getToken(Stix2PatternParser.IntPosLiteral, 0); }
		public TerminalNode IntNegLiteral() { return getToken(Stix2PatternParser.IntNegLiteral, 0); }
		public TerminalNode ASTERISK() { return getToken(Stix2PatternParser.ASTERISK, 0); }
		public IndexPathStepContext(ObjectPathComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterIndexPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitIndexPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitIndexPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathStepContext extends ObjectPathComponentContext {
		public List<ObjectPathComponentContext> objectPathComponent() {
			return getRuleContexts(ObjectPathComponentContext.class);
		}
		public ObjectPathComponentContext objectPathComponent(int i) {
			return getRuleContext(ObjectPathComponentContext.class,i);
		}
		public PathStepContext(ObjectPathComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeyPathStepContext extends ObjectPathComponentContext {
		public TerminalNode IdentifierWithoutHyphen() { return getToken(Stix2PatternParser.IdentifierWithoutHyphen, 0); }
		public TerminalNode StringLiteral() { return getToken(Stix2PatternParser.StringLiteral, 0); }
		public KeyPathStepContext(ObjectPathComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterKeyPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitKeyPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitKeyPathStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPathComponentContext objectPathComponent() throws RecognitionException {
		return objectPathComponent(0);
	}

	private ObjectPathComponentContext objectPathComponent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjectPathComponentContext _localctx = new ObjectPathComponentContext(_ctx, _parentState);
		ObjectPathComponentContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_objectPathComponent, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				_localctx = new KeyPathStepContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(DOT);
				setState(196);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==IdentifierWithoutHyphen) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LBRACK:
				{
				_localctx = new IndexPathStepContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(LBRACK);
				setState(198);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntNegLiteral) | (1L << IntPosLiteral) | (1L << ASTERISK))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PathStepContext(new ObjectPathComponentContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_objectPathComponent);
					setState(202);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(203);
					objectPathComponent(4);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SetLiteralContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Stix2PatternParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Stix2PatternParser.RPAREN, 0); }
		public List<PrimitiveLiteralContext> primitiveLiteral() {
			return getRuleContexts(PrimitiveLiteralContext.class);
		}
		public PrimitiveLiteralContext primitiveLiteral(int i) {
			return getRuleContext(PrimitiveLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Stix2PatternParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Stix2PatternParser.COMMA, i);
		}
		public SetLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitSetLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitSetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetLiteralContext setLiteral() throws RecognitionException {
		SetLiteralContext _localctx = new SetLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setLiteral);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(LPAREN);
				setState(210);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(LPAREN);
				setState(212);
				primitiveLiteral();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(213);
					match(COMMA);
					setState(214);
					primitiveLiteral();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveLiteralContext extends ParserRuleContext {
		public OrderableLiteralContext orderableLiteral() {
			return getRuleContext(OrderableLiteralContext.class,0);
		}
		public TerminalNode BoolLiteral() { return getToken(Stix2PatternParser.BoolLiteral, 0); }
		public PrimitiveLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterPrimitiveLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitPrimitiveLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitPrimitiveLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveLiteralContext primitiveLiteral() throws RecognitionException {
		PrimitiveLiteralContext _localctx = new PrimitiveLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primitiveLiteral);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntNegLiteral:
			case IntPosLiteral:
			case FloatNegLiteral:
			case FloatPosLiteral:
			case HexLiteral:
			case BinaryLiteral:
			case StringLiteral:
			case TimestampLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				orderableLiteral();
				}
				break;
			case BoolLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(BoolLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderableLiteralContext extends ParserRuleContext {
		public TerminalNode IntPosLiteral() { return getToken(Stix2PatternParser.IntPosLiteral, 0); }
		public TerminalNode IntNegLiteral() { return getToken(Stix2PatternParser.IntNegLiteral, 0); }
		public TerminalNode FloatPosLiteral() { return getToken(Stix2PatternParser.FloatPosLiteral, 0); }
		public TerminalNode FloatNegLiteral() { return getToken(Stix2PatternParser.FloatNegLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Stix2PatternParser.StringLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(Stix2PatternParser.BinaryLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(Stix2PatternParser.HexLiteral, 0); }
		public TerminalNode TimestampLiteral() { return getToken(Stix2PatternParser.TimestampLiteral, 0); }
		public OrderableLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderableLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).enterOrderableLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stix2PatternListener ) ((Stix2PatternListener)listener).exitOrderableLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stix2PatternVisitor ) return ((Stix2PatternVisitor<? extends T>)visitor).visitOrderableLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderableLiteralContext orderableLiteral() throws RecognitionException {
		OrderableLiteralContext _localctx = new OrderableLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orderableLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntNegLiteral) | (1L << IntPosLiteral) | (1L << FloatNegLiteral) | (1L << FloatPosLiteral) | (1L << HexLiteral) | (1L << BinaryLiteral) | (1L << StringLiteral) | (1L << TimestampLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return observationExpressions_sempred((ObservationExpressionsContext)_localctx, predIndex);
		case 2:
			return observationExpressionOr_sempred((ObservationExpressionOrContext)_localctx, predIndex);
		case 3:
			return observationExpressionAnd_sempred((ObservationExpressionAndContext)_localctx, predIndex);
		case 4:
			return observationExpression_sempred((ObservationExpressionContext)_localctx, predIndex);
		case 5:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 6:
			return comparisonExpressionAnd_sempred((ComparisonExpressionAndContext)_localctx, predIndex);
		case 14:
			return objectPathComponent_sempred((ObjectPathComponentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean observationExpressions_sempred(ObservationExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean observationExpressionOr_sempred(ObservationExpressionOrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean observationExpressionAnd_sempred(ObservationExpressionAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean observationExpression_sempred(ObservationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparisonExpression_sempred(ComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comparisonExpressionAnd_sempred(ComparisonExpressionAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean objectPathComponent_sempred(ObjectPathComponentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00e9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5F\n\5\f\5\16\5I\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6T\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\br\n\b\f"+
		"\b\16\bu\13\b\3\t\3\t\5\ty\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u009c\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00a3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5"+
		"\r\u00bf\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cb"+
		"\n\20\3\20\3\20\7\20\u00cf\n\20\f\20\16\20\u00d2\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u00da\n\21\f\21\16\21\u00dd\13\21\3\21\3\21\5\21"+
		"\u00e1\n\21\3\22\3\22\5\22\u00e5\n\22\3\23\3\23\3\23\2\t\4\6\b\n\f\16"+
		"\36\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\t\3\2 !\3\2\"%\4\2"+
		"\4\4\6\6\3\2\36\37\4\2\t\t\36\36\4\2\3\4\63\63\4\2\3\t\13\13\2\u00f3\2"+
		"&\3\2\2\2\4)\3\2\2\2\6\64\3\2\2\2\b?\3\2\2\2\nS\3\2\2\2\f`\3\2\2\2\16"+
		"k\3\2\2\2\20\u00ab\3\2\2\2\22\u00ad\3\2\2\2\24\u00b2\3\2\2\2\26\u00b6"+
		"\3\2\2\2\30\u00ba\3\2\2\2\32\u00c0\3\2\2\2\34\u00c2\3\2\2\2\36\u00ca\3"+
		"\2\2\2 \u00e0\3\2\2\2\"\u00e4\3\2\2\2$\u00e6\3\2\2\2&\'\5\4\3\2\'(\7\2"+
		"\2\3(\3\3\2\2\2)*\b\3\1\2*+\5\6\4\2+\61\3\2\2\2,-\f\4\2\2-.\7\17\2\2."+
		"\60\5\4\3\5/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2"+
		"\2\2\63\61\3\2\2\2\64\65\b\4\1\2\65\66\5\b\5\2\66<\3\2\2\2\678\f\4\2\2"+
		"89\7\r\2\29;\5\6\4\5:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\7\3\2"+
		"\2\2><\3\2\2\2?@\b\5\1\2@A\5\n\6\2AG\3\2\2\2BC\f\4\2\2CD\7\f\2\2DF\5\b"+
		"\5\5EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\t\3\2\2\2IG\3\2\2\2JK\b"+
		"\6\1\2KL\7-\2\2LM\5\f\7\2MN\7,\2\2NT\3\2\2\2OP\7+\2\2PQ\5\4\3\2QR\7*\2"+
		"\2RT\3\2\2\2SJ\3\2\2\2SO\3\2\2\2T]\3\2\2\2UV\f\5\2\2V\\\5\22\n\2WX\f\4"+
		"\2\2X\\\5\24\13\2YZ\f\3\2\2Z\\\5\26\f\2[U\3\2\2\2[W\3\2\2\2[Y\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_]\3\2\2\2`a\b\7\1\2ab\5\16"+
		"\b\2bh\3\2\2\2cd\f\4\2\2de\7\r\2\2eg\5\f\7\5fc\3\2\2\2gj\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2i\r\3\2\2\2jh\3\2\2\2kl\b\b\1\2lm\5\20\t\2ms\3\2\2\2no\f"+
		"\4\2\2op\7\f\2\2pr\5\16\b\5qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17"+
		"\3\2\2\2us\3\2\2\2vx\5\30\r\2wy\7\16\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2"+
		"z{\t\2\2\2{|\5\"\22\2|\u00ac\3\2\2\2}\177\5\30\r\2~\u0080\7\16\2\2\177"+
		"~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\t\3\2\2\u0082"+
		"\u0083\5$\23\2\u0083\u00ac\3\2\2\2\u0084\u0086\5\30\r\2\u0085\u0087\7"+
		"\16\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\7\25\2\2\u0089\u008a\5 \21\2\u008a\u00ac\3\2\2\2\u008b\u008d\5"+
		"\30\r\2\u008c\u008e\7\16\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\20\2\2\u0090\u0091\7\t\2\2\u0091\u00ac\3"+
		"\2\2\2\u0092\u0094\5\30\r\2\u0093\u0095\7\16\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\21\2\2\u0097\u0098\7"+
		"\t\2\2\u0098\u00ac\3\2\2\2\u0099\u009b\5\30\r\2\u009a\u009c\7\16\2\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\23"+
		"\2\2\u009e\u009f\7\t\2\2\u009f\u00ac\3\2\2\2\u00a0\u00a2\5\30\r\2\u00a1"+
		"\u00a3\7\16\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\7\t\2\2\u00a6\u00ac\3\2\2\2\u00a7"+
		"\u00a8\7+\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\7*\2\2\u00aa\u00ac\3\2\2"+
		"\2\u00abv\3\2\2\2\u00ab}\3\2\2\2\u00ab\u0084\3\2\2\2\u00ab\u008b\3\2\2"+
		"\2\u00ab\u0092\3\2\2\2\u00ab\u0099\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab\u00a7"+
		"\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\7\t\2\2\u00af"+
		"\u00b0\7\27\2\2\u00b0\u00b1\7\t\2\2\u00b1\23\3\2\2\2\u00b2\u00b3\7\33"+
		"\2\2\u00b3\u00b4\t\4\2\2\u00b4\u00b5\7\30\2\2\u00b5\25\3\2\2\2\u00b6\u00b7"+
		"\7\34\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\7\35\2\2\u00b9\27\3\2\2\2\u00ba"+
		"\u00bb\5\32\16\2\u00bb\u00bc\7\'\2\2\u00bc\u00be\5\34\17\2\u00bd\u00bf"+
		"\5\36\20\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\31\3\2\2\2\u00c0"+
		"\u00c1\t\5\2\2\u00c1\33\3\2\2\2\u00c2\u00c3\t\6\2\2\u00c3\35\3\2\2\2\u00c4"+
		"\u00c5\b\20\1\2\u00c5\u00c6\7(\2\2\u00c6\u00cb\t\6\2\2\u00c7\u00c8\7-"+
		"\2\2\u00c8\u00c9\t\7\2\2\u00c9\u00cb\7,\2\2\u00ca\u00c4\3\2\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\f\5\2\2\u00cd\u00cf\5\36"+
		"\20\6\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7+\2\2"+
		"\u00d4\u00e1\7*\2\2\u00d5\u00d6\7+\2\2\u00d6\u00db\5\"\22\2\u00d7\u00d8"+
		"\7)\2\2\u00d8\u00da\5\"\22\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7*\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0"+
		"\u00d5\3\2\2\2\u00e1!\3\2\2\2\u00e2\u00e5\5$\23\2\u00e3\u00e5\7\n\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00e7\t"+
		"\b\2\2\u00e7%\3\2\2\2\30\61<GS[]hsx\177\u0086\u008d\u0094\u009b\u00a2"+
		"\u00ab\u00be\u00ca\u00d0\u00db\u00e0\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}