package ipratico.tools.elab.datas.service;

import java.util.List;

import ipratico.tools.elab.datas.enums.StatusNegozioConfigEnum;
import ipratico.tools.elab.datas.persitence.beans.NegozioConfigEntity;
import ipratico.tools.elab.datas.persitence.dao.NegozioConfigDao;

public class NegozioConfigService {
	public List<NegozioConfigEntity> getAllActive()
	{
		return NegozioConfigDao.getAllByStatus(StatusNegozioConfigEnum.TRUE.toString());
	}
}
