TEST = test

all:
	javac src/*.java
	mkdir build
	mv *.class build

clean:
	rm -rf build