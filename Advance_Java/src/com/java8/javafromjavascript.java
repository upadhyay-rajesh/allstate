package com.java8;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class javafromjavascript {
	public static void main(String arg[])throws Exception{
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("javafromjavascript.js"));

		Invocable invocable = (Invocable) engine;

		Object result = invocable.invokeFunction("fun1", "Peter Parker");
		System.out.println(result);
		System.out.println(result.getClass());

		// Hi there from Javascript, Peter Parker
		// greetings from javascript
		// class java.lang.String
	}
}
