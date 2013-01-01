package com.svashishtha.service.img;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;

public class ImageServiceImpl implements ImageService {

	@Override
	@Oneway
	@RequestWrapper(localName = "uploadImage", targetNamespace = "urn:svashishtha.com:service/img", className = "com.svashishtha.service.img.UploadImage")
	@WebMethod(action = "urn:svashishtha.com:service/img/uploadImage")
	public void uploadImage(
			@WebParam(name = "productId", targetNamespace = "") String productId,
			@WebParam(name = "image", targetNamespace = "") byte[] image) {
		try {
			FileOutputStream out = new FileOutputStream(productId + ".jpg");
			out.write(image);
			out.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
