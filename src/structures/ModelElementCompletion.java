package structures;

import interfaces.SqlCompletionType;

public class ModelElementCompletion extends AbstractCompletion {

	public ModelElementCompletion(SqlCompletionType completionType, String displayName, AbstractCompletion parent) {
		super(completionType, displayName, parent);
	}

}
