package com.ct.user.exception;

public class PatientNotFoundException extends RuntimeException {

	public PatientNotFoundException() {
		super();
	}

	public PatientNotFoundException(long id) {
		super("Could Not Find Patient : " + id);
	}
}
