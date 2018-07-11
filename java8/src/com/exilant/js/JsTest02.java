package com.exilant.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest02 {
public static void main(String[] args) throws FileNotFoundException, ScriptException {
	ScriptEngineManager engineManager=new ScriptEngineManager();
	ScriptEngine nashorn=engineManager.getEngineByName("nashorn");
	nashorn.eval(new FileReader("external.js"));
	System.out.println(nashorn.eval("fntest()"));
}
}
