TARGET =	Svg

# Directories
ROOT =		$(PWD)
SRCDIR = 	$(ROOT)/src
LIBDIR =	$(ROOT)/libs
CLASSDIR = 	$(ROOT)/classes
MAIN =		$(SRCDIR)/$(TARGET)
PARSER =	$(SRCDIR)/parser
INTERP =	$(SRCDIR)/interp
JAVADOC =	$(ROOT)/javadoc
BIN =		$(ROOT)/bin

# Executable
EXEC = 		$(BIN)/$(TARGET)
JARFILE =	$(BIN)/$(TARGET).jar
MANIFEST=	$(BIN)/$(TARGET)_Manifest.txt

# Libraries and Classpath
LIB_ANTLR =	$(LIBDIR)/antlr-3.4-complete.jar
LIB_CLI =	$(LIBDIR)/commons-cli-1.2.jar
CLASSPATH=	$(LIB_ANTLR):$(LIB_CLI)
JARPATH=	"$(LIB_ANTLR) $(LIB_CLI)"


# Distribution (tar) file
DATE= 		$(shell date +"%d%b%y")
DISTRIB=	$(TARGET)_$(DATE).tgz

# Classpath


# Flags
JFLAGS =	-classpath $(CLASSPATH) -d $(CLASSDIR)
DOCFLAGS =	-classpath $(CLASSPATH) -d $(JAVADOC) -private

# Source files
GRAMMAR = 		$(PARSER)/$(TARGET).g

MAIN_SRC =		$(MAIN)/$(TARGET).java

PARSER_SRC =	$(PARSER)/$(TARGET)Lexer.java \
				$(PARSER)/$(TARGET)Parser.java

DATA_SRC = 		$(INTERP)/data/Data.java \
				$(INTERP)/data/SvgArray.java \
				$(INTERP)/data/SvgBoolean.java \
				$(INTERP)/data/SvgFloat.java \
				$(INTERP)/data/SvgInt.java \
				$(INTERP)/data/SvgNumber.java \
				$(INTERP)/data/SvgObject.java \
				$(INTERP)/data/SvgString.java \
				$(INTERP)/data/SvgVoid.java

INTERP_SRC =	$(INTERP)/Interp.java \
				$(INTERP)/Stack.java \
				$(INTERP)/$(TARGET)Tree.java \
				$(INTERP)/SvgTreeAdaptor.java \
				$(INTERP)/AnimatedObject.java \
				$(INTERP)/Animation.java


ALL_SRC =		$(MAIN_SRC) $(PARSER_SRC) $(INTERP_SRC) $(DATA_SRC)

all: compile exec docs

compile:
	java -jar $(LIB_ANTLR) -o $(PARSER) $(GRAMMAR)
	if [ ! -e $(CLASSDIR) ]; then\
	  mkdir $(CLASSDIR);\
	fi
	javac $(JFLAGS) $(ALL_SRC)

docs:
	javadoc $(DOCFLAGS) $(ALL_SRC)

exec:
	if [ ! -e $(BIN) ]; then\
	  mkdir $(BIN);\
	fi
	echo "Main-Class: Svg.Svg" > $(MANIFEST)
	echo "Class-Path: $(JARPATH)" >> $(MANIFEST)
	cd $(CLASSDIR); jar -cmf $(MANIFEST) $(JARFILE) *
	printf "#!/bin/sh\n\n" > $(EXEC)
	printf 'exec java -enableassertions -jar $(JARFILE) "$$@"' >> $(EXEC)
	chmod a+x $(EXEC)

clean:
	rm -rf $(PARSER)/*.java $(PARSER)/*.tokens 
	rm -rf $(CLASSDIR)
	rm -rf $(JAVADOC)
	rm -rf $(BIN)

tar: clean
	cd ..; tar cvzf $(DISTRIB) $(TARGET); mv $(DISTRIB) $(TARGET); cd $(TARGET) 
