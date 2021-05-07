###############################################################################
# Project properties                                                          #
###############################################################################
NAME=KLinguaMachina
VERSION=0.1.0-SNAPSHOT

###############################################################################
# Project paths                                                               #
###############################################################################
DIST=build/distributions

###############################################################################
# Tools and configuration                                                     #
###############################################################################
GRADLE=./gradlew
GRADLE_ARGS=-Pversion=$(VERSION)

###############################################################################
# Targets                                                                     #
###############################################################################

.PHONY: build test clean repl

build:
	@$(GRADLE) $(GRADLE_ARGS) build -x test --warning-mode all

test:
	@$(GRADLE) $(GRADLE_ARGS) test --warning-mode all

clean:
	@rm -r ./build

repl: build
	@tar -xf $(DIST)/$(NAME)-$(VERSION).tar -C $(DIST)
	@$(DIST)/$(NAME)-$(VERSION)/bin/$(NAME)
	@rm -r $(DIST)/$(NAME)-$(VERSION)

