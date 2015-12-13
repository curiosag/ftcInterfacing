package interfaces;

import structures.Completions;

public interface CompletionsSource {
	public Completions get(String query, int cursorPos);
}
