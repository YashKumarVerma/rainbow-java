Runner.class: Runner.java packages/rainbow/rainbow.class
	javac Runner.java

packages/rainbow/rainbow.class: packages/rainbow/rainbow.java 
	javac packages/rainbow/rainbow.java

run:
	java -cp . Runner

clean:
	rm -rf *.class
	rm -rf packages/*/*.class