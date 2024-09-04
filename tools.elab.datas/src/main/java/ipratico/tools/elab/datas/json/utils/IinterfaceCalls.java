package ipratico.tools.elab.datas.json.utils;

import java.util.List;

public interface IinterfaceCalls {
	public boolean execute();
	public <T> List<T> getList(Class<T> clazz);
}
