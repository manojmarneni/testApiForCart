package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-17T08:29:13.704Z")

public class NotFoundException extends ApiException {
	private int code;
	public NotFoundException (int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
