package com.ttdev.biz;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import com.ttdev.biz.ProductQueryComplexType.QueryItem;
import com.ttdev.biz.ProductQueryResult.ResultItem;

public class BizServiceImpl implements BizService {

	@Override
	@WebResult(name = "productQueryResult", targetNamespace = "http://svashishtha.com/ws", partName = "parameters")
	@WebMethod(action = "http://svashishtha.com/ws/BizService/NewOperation")
	public ProductQueryResult query(
			@WebParam(partName = "parameters", name = "productQuery", targetNamespace = "http://svashishtha.com/ws") ProductQueryComplexType parameters) {
		ProductQueryResult result = new ProductQueryResult();
		List<QueryItem> queryItem = parameters.getQueryItem();
		for (QueryItem item : queryItem) {
			if (item.getQty() <= 200) {
				ResultItem resultItem = new ResultItem();
				resultItem.setProductId(item.getProductId());
				resultItem.setPrice(20);
				result.getResultItem().add(resultItem);
			}
		}
		return result;
	}
}