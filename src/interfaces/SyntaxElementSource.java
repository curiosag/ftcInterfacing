package interfaces;

import java.util.List;

import structures.Completions;

public interface SyntaxElementSource {
	public List<SyntaxElement> get(String query);
	public Completions get(String query, int cursorPos);
}
