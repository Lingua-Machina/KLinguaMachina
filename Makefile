GRADLE=./gradlew

.PHONY: build test clean

build:
	@$(GRADLE) build --warning-mode all

test:
	@$(GRADLE) test

clean:
	@rm -r ./build

