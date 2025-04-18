package ipratico.tools.elab.datas.config;

public class UseDatabase {
	protected static Boolean databaseActive= null;
	
	public UseDatabase() {
		if (ConfigLoader.getProperty("ipratico.is.database.active") == null ||
				ConfigLoader.getProperty("ipratico.is.database.active").equals("") ||
				ConfigLoader.getProperty("ipratico.is.database.active").equalsIgnoreCase("T")
				)
		{
			databaseActive = true;
		}
		else {
			databaseActive = false;
		}
	}
	
	public static boolean isActiveDatabase() {
		if (databaseActive == null) {
			new UseDatabase();
		}
		return databaseActive;
	}
}
