package structures;

import interfaces.SqlCompletionType;

public class CodeSnippetCompletion extends AbstractCompletion {

	public final String snippet;
	
	public CodeSnippetCompletion(SqlCompletionType completionType, String displayName, String snippet) {
		super(completionType, displayName, null);
		this.snippet = snippet;
	}

	@Override
	public String getPatch() {
		return snippet;
	}
	
}
