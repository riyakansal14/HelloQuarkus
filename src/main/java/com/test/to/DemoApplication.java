package com.test.to;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class DemoApplication {

	public static void main(String[] args) {
		Quarkus.run(args);
	}

}
