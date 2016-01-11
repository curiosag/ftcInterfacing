package structures;

import com.google.common.base.Optional;

import cg.common.http.HttpStatus;

public class ConnectionStatus {

	public final HttpStatus status;
	public Optional<String> message = Optional.absent();
	
	public ConnectionStatus(HttpStatus status, String message) {
		this(status);
		this.message = Optional.fromNullable(message);
	}
	
	public ConnectionStatus(HttpStatus status) {
		this.status = status;
	}
	
	public ConnectionStatus(Exception e) {
		this.status = HttpStatus.SC_METHOD_FAILURE;
		this.message = Optional.of(e.getClass().getSimpleName() + " " + e.getMessage());
	}
	
}
