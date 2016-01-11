
package interfaces;

import java.io.IOException;
import java.util.Dictionary;
import java.util.List;

import structures.ConnectionStatus;
import structures.QueryResult;
import structures.TableInfo;


public interface Connector {

  void clearStoredLoginData();
	
  ConnectionStatus reset(Dictionary<String, String> connectionInfo) ;
	
  List<TableInfo> getTableInfo();

  String executeSql(String query) throws IOException;
  
  String execSql(String query);

  QueryResult fetch(String query);
  
  void deleteTable(String tableId) throws IOException;

  String renameTable(String tableId, String newName);

}
