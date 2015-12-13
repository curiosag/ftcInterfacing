package interfaces;

import java.util.List;

public interface SyntaxElementSource {
	public List<SyntaxElement> get(String query);
}
