package com.jsbs.test.jni.utils;

public class UtilsJNI{
	
	/**
	 * Libreria a cargar para poder usar la llamadas a methodos nativos
	 */
	static{
		System.loadLibrary( "ndksample");
	}
	
	/**
	 * Methodo nativo que esta creado tambien en el fichero '*.c'
	 * que sea compilado para su posterior uso.
	 * @return
	 */
	public static native String getStringFromJNI();

}
