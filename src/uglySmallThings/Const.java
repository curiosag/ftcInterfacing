package uglySmallThings;

public class Const {

	public static final String rulename_sql_stmt = "sql_stmt";
	
	/**
	 * debug switches
	 */
	public static final boolean debugQueryHandler = false;
	public static final boolean debugCursorContextListener = true;
	public static final boolean debugSyntaxElementListener = true;
	public static final boolean debugNameRecognition = false;
	public static final boolean debugCursorContext = true;
	
	/**
	 *  snippets
	 */
	public static final String paramNameTable = "t";
	public static final String paramNameColumn = "c";
	public static final String snippetParameterIndicator = "${";
	
	public static final char quoteChar = '\'';
	public static int defaultQueryLimit = 1000;

	public static final int MAX_LOGSIZE = 1024 * 5;
	public static final String PREF_ID_CMDHISTORY = "commandHistory";

	public static final int LEN_TABLEID = 39;

	
}
