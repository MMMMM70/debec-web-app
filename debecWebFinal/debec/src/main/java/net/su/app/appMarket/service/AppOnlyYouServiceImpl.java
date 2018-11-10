package net.su.app.appMarket.service;

import java.util.List;

import javax.annotation.Resource;

import net.su.app.appMarket.dataAccessObject.AppOnlyYouDataAccessObject;
import net.su.logger.Logger;
import net.su.prodct.valueObject.ProdctValueObject;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AppOnlyYouServiceImpl implements AppOnlyYouService {
	
	@Resource
	private AppOnlyYouDataAccessObject appOnlyYouDAO;
	
	/**
    * 너.만.상 준비 상태를 조회하는 메서드
    *
    * @param    
    * @return  int
    * @exception  Exception
    */
	public int appOnlyYou(int custmrSeq) throws Exception {
		Logger.info(null);
		
		int onlyYouCount = appOnlyYouDAO.appOnlyYou(custmrSeq);
		return onlyYouCount;
	}
	

	/**
    * 너.만.상 상품 리스트를 조회하는 메서드
    *
    * @param   int
    * @return  List<ProdctValueObject>
    * @exception  Exception
    */
	public List<ProdctValueObject> appOnlyYouRead(@RequestParam(value="custmrSeq") int custmrSeq) throws Exception {
		Logger.info(null);
		
		List<ProdctValueObject> appOnlyYouList = appOnlyYouDAO.appOnlyYouRead(custmrSeq);
		return appOnlyYouList;
	}
}
