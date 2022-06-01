/* The following code was generated by JFlex 1.4.3 on 31/05/22 08:34 PM */

package ejerciciojflex;
import ejerciciojflex.TokenP;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 31/05/22 08:34 PM from the specification file
 * <tt>C:/Users/Andrey McCarty/Desktop/Nueva carpeta (2)/Programa/ProyectoCompiKevinLanzasJirgortMcCarty/KevinLanzasQuenJirgortMcCartyProyectoCompi/Proyecto#1Compi_Kevin_Jirgort/src/ejerciciojflex/AnalizadorLexico.flex</tt>
 */
public class AnalizadorLexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\33\1\46\2\0\1\45\22\0\1\33\1\41\1\0\1\43"+
    "\1\31\1\31\1\40\1\30\1\32\1\32\1\34\1\35\1\32\1\36"+
    "\1\44\1\37\1\27\11\26\1\32\1\31\1\42\1\24\1\42\1\31"+
    "\1\31\32\25\1\32\1\0\1\32\3\0\1\6\1\14\1\16\1\20"+
    "\1\4\1\5\1\13\1\17\1\11\1\25\1\22\1\7\1\25\1\12"+
    "\1\15\1\23\1\25\1\2\1\10\1\1\1\3\1\25\1\21\3\25"+
    "\1\32\1\40\1\32\1\31\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\15\3\1\4\1\5\2\2\1\6\1\7"+
    "\2\10\2\11\1\12\1\13\2\14\10\3\1\15\11\3"+
    "\1\12\7\0\1\7\7\3\1\16\10\3\1\17\2\20"+
    "\2\0\1\7\1\1\3\3\1\21\5\3\2\0\7\3"+
    "\1\0\1\3\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249"+
    "\0\u0270\0\u0297\0\u02be\0\47\0\47\0\47\0\u02e5\0\47"+
    "\0\u0249\0\u0249\0\47\0\u030c\0\47\0\u0333\0\u035a\0\u0381"+
    "\0\u03a8\0\u03cf\0\u03f6\0\u041d\0\u0444\0\234\0\u046b\0\u0492"+
    "\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3\0\47"+
    "\0\u05ca\0\u0297\0\u05f1\0\u0618\0\u063f\0\u0666\0\u068d\0\u06b4"+
    "\0\u06db\0\u0702\0\u0729\0\u0750\0\u0777\0\u079e\0\u07c5\0\234"+
    "\0\u07ec\0\u0813\0\u083a\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd"+
    "\0\u05ca\0\u0924\0\47\0\u094b\0\u0972\0\u0999\0\u09c0\0\u09e7"+
    "\0\u0a0e\0\u0a35\0\234\0\u0a5c\0\u0a83\0\u0aaa\0\u0ad1\0\u0af8"+
    "\0\u0b1f\0\u0b46\0\u0b6d\0\u0b94\0\u0bbb\0\u0be2\0\u0c09\0\u0c30"+
    "\0\u0c57\0\u0c7e\0\u0ca5\0\u0924";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\5\1\10"+
    "\1\11\1\12\1\5\1\13\1\5\1\14\1\5\1\15"+
    "\1\16\1\5\1\17\1\20\1\5\1\21\1\22\1\23"+
    "\1\2\1\24\1\25\2\26\1\21\1\27\1\30\1\31"+
    "\1\32\1\33\1\2\1\34\1\35\50\0\1\5\1\36"+
    "\21\5\1\0\2\5\21\0\3\5\1\37\17\5\1\0"+
    "\2\5\21\0\23\5\1\0\2\5\21\0\6\5\1\40"+
    "\14\5\1\0\2\5\21\0\5\5\1\41\1\42\5\5"+
    "\1\43\6\5\1\0\2\5\21\0\1\44\17\5\1\45"+
    "\2\5\1\0\2\5\21\0\4\5\1\46\4\5\1\47"+
    "\11\5\1\0\2\5\21\0\2\5\1\50\20\5\1\0"+
    "\2\5\21\0\1\5\1\51\12\5\1\52\6\5\1\0"+
    "\2\5\21\0\5\5\1\40\10\5\1\53\4\5\1\0"+
    "\2\5\21\0\3\5\1\54\10\5\1\55\6\5\1\0"+
    "\2\5\21\0\16\5\1\56\4\5\1\0\2\5\21\0"+
    "\1\5\1\57\21\5\1\0\2\5\44\0\1\60\50\0"+
    "\2\21\14\0\1\61\30\0\2\62\14\0\1\61\3\0"+
    "\23\63\1\64\1\63\2\65\1\0\2\65\1\0\5\65"+
    "\2\66\1\65\37\0\1\67\2\0\1\70\55\0\1\35"+
    "\1\0\2\5\1\71\20\5\1\0\2\5\21\0\1\72"+
    "\22\5\1\0\2\5\21\0\7\5\1\73\13\5\1\0"+
    "\2\5\21\0\6\5\1\74\14\5\1\0\2\5\21\0"+
    "\14\5\1\75\6\5\1\0\2\5\21\0\1\5\1\46"+
    "\21\5\1\0\2\5\21\0\1\5\1\76\21\5\1\0"+
    "\2\5\21\0\10\5\1\77\12\5\1\0\2\5\21\0"+
    "\1\100\22\5\1\0\2\5\21\0\6\5\1\101\14\5"+
    "\1\0\2\5\21\0\3\5\1\102\17\5\1\0\2\5"+
    "\21\0\14\5\1\103\6\5\1\0\2\5\21\0\5\5"+
    "\1\104\15\5\1\0\2\5\21\0\4\5\1\105\16\5"+
    "\1\0\2\5\21\0\2\5\1\106\20\5\1\0\2\5"+
    "\21\0\10\5\1\107\12\5\1\0\2\5\21\0\10\5"+
    "\1\110\12\5\1\0\2\5\46\0\2\111\20\0\23\65"+
    "\1\64\3\65\1\112\10\65\2\66\1\65\27\0\1\65"+
    "\23\0\23\65\1\64\3\65\1\113\10\65\2\66\1\65"+
    "\4\0\23\65\1\66\3\65\1\113\10\65\2\66\1\65"+
    "\3\0\34\114\1\0\12\114\1\0\23\115\1\0\1\115"+
    "\17\0\1\116\1\25\1\0\3\5\1\117\17\5\1\0"+
    "\2\5\21\0\2\5\1\120\20\5\1\0\2\5\21\0"+
    "\3\5\1\46\17\5\1\0\2\5\21\0\7\5\1\71"+
    "\13\5\1\0\2\5\21\0\5\5\1\47\15\5\1\0"+
    "\2\5\21\0\10\5\1\121\12\5\1\0\2\5\21\0"+
    "\1\122\22\5\1\0\2\5\21\0\6\5\1\123\14\5"+
    "\1\0\2\5\21\0\5\5\1\124\15\5\1\0\2\5"+
    "\21\0\6\5\1\125\14\5\1\0\2\5\21\0\1\5"+
    "\1\100\21\5\1\0\2\5\21\0\5\5\1\126\15\5"+
    "\1\0\2\5\21\0\13\5\1\127\7\5\1\0\2\5"+
    "\21\0\6\5\1\73\14\5\1\0\2\5\21\0\11\5"+
    "\1\130\11\5\1\0\2\5\50\0\1\131\16\0\34\114"+
    "\1\132\12\114\1\0\23\115\1\0\2\115\4\0\1\70"+
    "\61\0\1\25\1\0\1\3\3\5\1\133\16\5\1\0"+
    "\2\5\21\0\1\5\1\134\21\5\1\0\2\5\21\0"+
    "\11\5\1\135\11\5\1\0\2\5\21\0\15\5\1\136"+
    "\5\5\1\0\2\5\21\0\21\5\1\46\1\5\1\0"+
    "\2\5\21\0\3\5\1\137\17\5\1\0\2\5\21\0"+
    "\2\5\1\140\20\5\1\0\2\5\21\0\6\5\1\141"+
    "\14\5\1\0\2\5\21\0\1\46\22\5\1\0\2\5"+
    "\21\0\23\142\1\0\1\142\21\0\34\114\1\132\2\114"+
    "\1\25\7\114\1\0\5\5\1\41\15\5\1\0\2\5"+
    "\21\0\11\5\1\46\11\5\1\0\2\5\21\0\12\5"+
    "\1\100\10\5\1\0\2\5\21\0\16\5\1\46\4\5"+
    "\1\0\2\5\21\0\5\5\1\143\15\5\1\0\2\5"+
    "\21\0\6\5\1\130\14\5\1\0\2\5\21\0\3\5"+
    "\1\100\17\5\1\0\2\5\50\0\1\144\17\0\11\5"+
    "\1\100\11\5\1\0\2\5\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3276];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\21\1\3\11\1\1\1\11\2\1\1\11"+
    "\1\1\1\11\22\1\1\11\7\0\23\1\1\11\2\0"+
    "\13\1\2\0\7\1\1\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
 
 

 private boolean _existenTokens = false;
 
 public boolean existenTokens(){
 return this._existenTokens;
 }
 


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
      this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
     
 this._existenTokens = false;
 

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public TokenP yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { TokenP t = new TokenP(yytext(),yytext(), "FLOTANTE");
 this._existenTokens = true;
 return t;
          }
        case 19: break;
        case 9: 
          { TokenP t = new TokenP(yytext(),yytext(), "EXPRESION_LOGICA");
 this._existenTokens = true;
 return t;
          }
        case 20: break;
        case 3: 
          { TokenP t = new TokenP(yytext(),yytext(), "IDENTIFICADOR");
 this._existenTokens = true;
 return t;
          }
        case 21: break;
        case 14: 
          { TokenP t = new TokenP(yytext(),yytext(), "TIPO_DATO");
 this._existenTokens = true;
 return t;
          }
        case 22: break;
        case 5: 
          { TokenP t = new TokenP(yytext(),yytext(), "ENTERO");
 this._existenTokens = true;
 return t;
          }
        case 23: break;
        case 12: 
          { TokenP t = new TokenP("Enter","Enter", "NUEVA_LINEA");
 this._existenTokens = true;
 return t;
          }
        case 24: break;
        case 18: 
          { TokenP t = new TokenP(yytext(),yytext(), "CHAR");
 this._existenTokens = true;
 return t;
          }
        case 25: break;
        case 1: 
          { TokenP t = new TokenP(yytext(),yytext(), "BOOLEAN");
 this._existenTokens = true;
 return t;
          }
        case 26: break;
        case 10: 
          { TokenP t = new TokenP(yytext(),yytext(), "COMPARADOR");
 this._existenTokens = true;
 return t;
          }
        case 27: break;
        case 6: 
          { TokenP t = new TokenP(yytext(),yytext(), "SEPARADOR");
 this._existenTokens = true;
 return t;
          }
        case 28: break;
        case 4: 
          { TokenP t = new TokenP(yytext(),yytext(), "ASIGNACION");
 this._existenTokens = true;
 return t;
          }
        case 29: break;
        case 2: 
          { /*String errLex = "Error lexico, caracter irreconocible: '"+yytext()+"' en la linea: "+(yyline+1)+" y columna: "+(yycolumn+1) ;
System.err.println(errLex);*/
          }
        case 30: break;
        case 16: 
          { TokenP t = new TokenP(yytext(),yytext(), "STRING");
 this._existenTokens = true;
 return t;
          }
        case 31: break;
        case 11: 
          { TokenP t = new TokenP(yytext(),yytext(), "FINAL_EXPRESION");
 this._existenTokens = true;
 return t;
          }
        case 32: break;
        case 13: 
          { TokenP t = new TokenP(yytext(),yytext(), "ESTRUCTURA_CONTROL");
 this._existenTokens = true;
 return t;
          }
        case 33: break;
        case 8: 
          { TokenP t = new TokenP(yytext(),yytext(), "OPERADOR");
 this._existenTokens = true;
 return t;
          }
        case 34: break;
        case 17: 
          { TokenP t = new TokenP(yytext(),yytext(), "NULO");
 this._existenTokens = true;
 return t;
          }
        case 35: break;
        case 7: 
          { 
          }
        case 36: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
