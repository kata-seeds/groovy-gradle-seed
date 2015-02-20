all: dependencies test

test:
	./gradlew check

dependencies:
	./gradlew assemble

.PHONY: all dependencies test
