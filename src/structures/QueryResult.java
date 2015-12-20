package structures;

import javax.swing.table.TableModel;

import com.google.common.base.Optional;

import cg.common.check.Check;
import cg.common.http.HttpStatus;

public class QueryResult {

	public final HttpStatus status; 
	public final Optional<TableModel> data;
	public final Optional<String> errorInfo;
	
	public QueryResult(HttpStatus status, TableModel data, String errorInfo)
	{
		Check.notNull(status);
		this.status = status;
		this.data = Optional.fromNullable(data);
		this.errorInfo = Optional.fromNullable(errorInfo);
	}
	
}
