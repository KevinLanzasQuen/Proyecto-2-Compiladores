/* The following code was generated by JFlex 1.4.3 on 24/05/22 04:44 PM */

package ejerciciojflex;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 24/05/22 04:44 PM from the specification file
 * <tt>C:/Users/kevin/OneDrive/Desktop/ProyectoCompi/KevinLanzasQuenJirgortMcCartyProyectoCompi/Proyecto#1Compi_Kevin_Jirgort/src/ejerciciojflex/AnalizadorLexicoCup.flex</tt>
 */
class AnalizadorLexicoCup implements java_cup.runtime.Scanner {

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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 36, 43,  0,  0, 42,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    36, 38, 22, 40, 35, 35, 37, 21, 28, 27, 23, 24, 33, 25, 41, 26, 
    20, 19, 19, 19, 19, 19, 19, 19, 19, 19, 34, 35, 39, 17, 39, 35, 
    35, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 
    18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 31,  0, 32,  0,  0, 
     0,  6,  9, 12, 14,  4,  5, 16, 13, 15, 18, 46,  7, 44, 11, 10, 
    47, 18,  2,  8,  1,  3, 18, 45, 18, 18, 18, 30, 37, 29, 35,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\13\3\1\4\2\5\1\2\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\2\24\1\25\1\26\1\23"+
    "\23\3\1\27\1\3\1\25\2\0\1\5\4\0\1\30"+
    "\1\0\1\23\12\3\1\31\11\3\1\32\1\0\1\33"+
    "\1\1\1\34\2\0\3\3\1\35\2\3\1\36\1\37"+
    "\5\3\1\40\1\41\1\42\2\3\1\0\1\33\3\0"+
    "\1\43\5\3\1\44\2\3\1\45\3\3\6\0\1\46"+
    "\1\47\1\3\2\0\1\50\1\51\2\3\3\52\1\33"+
    "\1\1\1\34\5\0\1\53\1\52\1\0\1\33\6\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[167];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\u0330\0\60\0\u0360\0\u0390\0\u03c0\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\u0270\0\u0270\0\60\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0"+
    "\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630"+
    "\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\300"+
    "\0\u07b0\0\60\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0"+
    "\0\u0900\0\60\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20"+
    "\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\300\0\u0b70"+
    "\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0"+
    "\0\300\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0e40"+
    "\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\300\0\300\0\u0f60"+
    "\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\300\0\300\0\300\0\u1050"+
    "\0\u1080\0\u10b0\0\u10e0\0\u1110\0\u1140\0\u1170\0\300\0\u11a0"+
    "\0\u11d0\0\u1200\0\u1230\0\u1260\0\300\0\u1290\0\u12c0\0\300"+
    "\0\u12f0\0\u1320\0\u1350\0\u1380\0\u13b0\0\u13e0\0\u1410\0\u1440"+
    "\0\u1470\0\300\0\300\0\u14a0\0\u14d0\0\u1500\0\300\0\300"+
    "\0\u1530\0\u1560\0\u1590\0\u15c0\0\u15f0\0\u1620\0\u1650\0\u1680"+
    "\0\u16b0\0\u16e0\0\u1710\0\u1740\0\u1770\0\300\0\u17a0\0\u17d0"+
    "\0\u1800\0\u1830\0\u1860\0\u1890\0\u18c0\0\u18f0\0\u1920";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[167];
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
    "\1\11\1\5\1\12\1\13\1\5\1\14\1\15\1\5"+
    "\1\16\1\5\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\2\1\37\1\40\1\41\1\42\1\43"+
    "\1\2\1\44\1\37\1\45\1\46\1\5\1\47\61\0"+
    "\1\5\1\50\11\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\3\5\1\52\7\5\1\51\4\5\1\0"+
    "\3\5\27\0\4\5\1\0\13\5\1\51\4\5\1\0"+
    "\3\5\27\0\4\5\1\0\6\5\1\53\4\5\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\1\0\5\5\1\54"+
    "\1\55\2\5\1\56\1\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\1\57\12\5\1\51\4\5\1\0"+
    "\3\5\27\0\1\5\1\60\2\5\1\0\1\5\1\61"+
    "\7\5\1\62\1\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\2\5\1\63\10\5\1\51\4\5\1\0"+
    "\3\5\27\0\4\5\1\0\5\5\1\64\5\5\1\51"+
    "\1\65\3\5\1\0\3\5\27\0\4\5\1\0\3\5"+
    "\1\66\5\5\1\67\1\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\4\5\1\70\5\5\1\71\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\21\0\1\72\52\0"+
    "\1\73\6\0\2\17\24\0\1\74\22\0\1\73\6\0"+
    "\2\75\24\0\1\74\7\0\20\76\1\0\1\76\17\0"+
    "\2\76\2\0\1\76\5\0\4\76\1\0\20\77\1\100"+
    "\3\77\2\0\15\77\1\0\1\77\2\101\1\77\3\0"+
    "\4\77\30\0\1\102\60\0\1\102\55\0\1\103\2\0"+
    "\1\104\100\0\1\37\5\0\5\5\1\105\5\5\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\1\0\13\5\1\51"+
    "\1\106\3\5\1\0\3\5\27\0\4\5\1\0\1\5"+
    "\1\107\11\5\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\2\5\1\110\10\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\11\5\1\111\1\5\1\51\4\5"+
    "\1\0\3\5\27\0\4\5\1\0\1\112\4\5\1\113"+
    "\5\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\7\5\1\114\3\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\6\5\1\115\4\5\1\51\4\5\1\0"+
    "\3\5\27\0\4\5\1\0\11\5\1\116\1\5\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\1\0\1\5\1\117"+
    "\11\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\1\5\1\120\11\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\13\5\1\51\2\5\1\121\1\5\1\0"+
    "\3\5\27\0\4\5\1\0\3\5\1\122\7\5\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\1\0\11\5\1\123"+
    "\1\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\6\5\1\124\4\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\7\5\1\125\3\5\1\51\4\5\1\0"+
    "\3\5\27\0\4\5\1\0\5\5\1\126\5\5\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\1\0\4\5\1\127"+
    "\6\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\2\5\1\130\10\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\1\131\12\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\12\0\1\132\70\0\2\133\56\0\2\75"+
    "\24\0\1\74\33\0\1\134\33\0\20\77\1\100\3\77"+
    "\1\0\1\135\17\77\2\101\1\77\3\0\4\77\21\0"+
    "\1\77\37\0\20\77\1\101\3\77\1\0\1\135\17\77"+
    "\2\101\1\77\3\0\4\77\27\136\1\0\30\136\1\0"+
    "\20\137\1\0\1\137\27\0\1\44\1\37\4\137\1\0"+
    "\13\5\1\51\2\5\1\140\1\5\1\0\3\5\27\0"+
    "\4\5\1\0\13\5\1\51\2\5\1\141\1\5\1\0"+
    "\3\5\27\0\4\5\1\0\13\5\1\51\2\5\1\142"+
    "\1\5\1\0\3\5\27\0\4\5\1\0\3\5\1\143"+
    "\7\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\13\5\1\51\4\5\1\0\3\5\27\0\1\144\3\5"+
    "\1\0\2\5\1\145\10\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\13\5\1\51\1\5\1\146\2\5"+
    "\1\0\3\5\27\0\4\5\1\0\3\5\1\147\7\5"+
    "\1\51\4\5\1\0\3\5\27\0\4\5\1\0\7\5"+
    "\1\110\3\5\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\5\5\1\150\5\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\13\5\1\51\2\5\1\151\1\5"+
    "\1\0\3\5\27\0\4\5\1\0\1\152\12\5\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\1\0\5\5\1\153"+
    "\5\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\6\5\1\154\4\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\6\5\1\155\4\5\1\51\4\5\1\0"+
    "\3\5\27\0\4\5\1\0\3\5\1\156\7\5\1\51"+
    "\4\5\1\0\3\5\27\0\4\5\1\0\1\5\1\157"+
    "\11\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\5\5\1\160\5\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\10\5\1\161\2\5\1\51\4\5\1\0"+
    "\3\5\27\0\4\5\54\0\1\162\17\0\1\73\6\0"+
    "\2\163\47\0\1\73\10\0\1\164\46\0\1\73\11\0"+
    "\1\165\31\0\27\136\1\166\30\136\1\0\20\137\1\0"+
    "\3\137\17\0\1\104\7\0\4\137\1\0\12\5\1\167"+
    "\1\51\4\5\1\0\3\5\27\0\4\5\1\0\6\5"+
    "\1\170\4\5\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\12\5\1\171\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\1\3\3\5\1\172\6\5\1\51\4\5"+
    "\1\0\3\5\27\0\4\5\1\0\5\5\1\173\5\5"+
    "\1\51\4\5\1\0\3\5\27\0\4\5\1\0\1\5"+
    "\1\174\11\5\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\1\175\12\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\12\5\1\176\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\13\5\1\177\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\13\5\1\51\4\5\1\0\3\5"+
    "\27\0\2\5\1\200\1\5\1\0\3\5\1\201\7\5"+
    "\1\51\4\5\1\0\3\5\27\0\4\5\1\0\2\5"+
    "\1\202\10\5\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\6\5\1\203\4\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\6\0\1\204\65\0\1\73\6\0\2\163"+
    "\24\0\1\205\7\0\20\206\1\0\1\206\17\0\2\206"+
    "\2\0\1\206\5\0\4\206\1\0\20\207\1\210\3\207"+
    "\2\0\15\207\1\0\1\207\2\211\1\207\3\0\4\207"+
    "\27\136\1\166\2\136\1\37\25\136\1\0\3\5\1\212"+
    "\7\5\1\51\4\5\1\0\3\5\27\0\4\5\1\0"+
    "\1\213\12\5\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\5\5\1\54\5\5\1\51\4\5\1\0\3\5"+
    "\27\0\4\5\1\0\13\5\1\51\4\5\1\0\1\5"+
    "\2\214\1\215\1\216\25\0\4\5\1\0\12\5\1\217"+
    "\1\51\4\5\1\0\3\5\27\0\4\5\1\0\13\5"+
    "\1\51\3\5\1\157\1\0\3\5\27\0\4\5\1\0"+
    "\11\5\1\111\1\5\1\51\1\220\3\5\1\0\3\5"+
    "\27\0\4\5\1\0\5\5\1\221\5\5\1\51\4\5"+
    "\1\0\3\5\27\0\4\5\1\0\6\5\1\222\4\5"+
    "\1\51\4\5\1\0\3\5\27\0\4\5\1\0\3\5"+
    "\1\157\7\5\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\20\223\1\0\1\223\1\224\1\225\1\215\1\216"+
    "\25\0\4\223\23\0\2\226\60\0\1\227\33\0\20\207"+
    "\1\210\3\207\1\0\1\230\17\207\2\211\1\207\3\0"+
    "\4\207\21\0\1\207\37\0\20\207\1\211\3\207\1\0"+
    "\1\230\17\207\2\211\1\207\3\0\4\207\1\0\13\5"+
    "\1\51\4\5\1\0\1\5\2\214\24\0\1\231\2\0"+
    "\4\5\1\0\20\232\1\0\1\232\17\0\2\232\2\0"+
    "\1\232\5\0\4\232\1\0\20\233\1\234\3\233\2\0"+
    "\15\233\1\0\1\233\2\235\1\233\3\0\4\233\1\0"+
    "\12\5\1\157\1\51\4\5\1\0\3\5\27\0\4\5"+
    "\1\0\1\236\12\5\1\51\4\5\1\0\3\5\27\0"+
    "\4\5\1\0\13\223\1\237\4\223\1\0\3\223\27\0"+
    "\4\223\14\0\1\73\6\0\2\224\24\0\1\231\22\0"+
    "\1\73\6\0\2\240\24\0\1\231\31\0\2\241\60\0"+
    "\1\164\60\0\1\165\54\0\2\242\60\0\1\243\33\0"+
    "\20\233\1\234\3\233\1\0\1\243\17\233\2\235\1\233"+
    "\3\0\4\233\21\0\1\233\37\0\20\233\1\235\3\233"+
    "\1\0\1\243\17\233\2\235\1\233\3\0\4\233\1\0"+
    "\11\223\1\244\1\223\1\237\4\223\1\0\3\223\27\0"+
    "\4\223\23\0\2\240\24\0\1\231\31\0\2\241\24\0"+
    "\1\205\22\0\1\73\6\0\2\242\47\0\1\73\44\0"+
    "\13\223\1\237\4\223\1\0\3\223\27\0\1\245\3\223"+
    "\1\0\5\223\1\246\5\223\1\237\4\223\1\0\3\223"+
    "\27\0\4\223\1\0\13\223\1\237\4\223\1\0\1\223"+
    "\2\247\1\215\1\216\25\0\4\223\1\0\13\223\1\237"+
    "\4\223\1\0\1\223\2\247\24\0\1\231\2\0\4\223";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6480];
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
    "\1\1\1\11\20\1\1\11\3\1\12\11\2\1\1\11"+
    "\26\1\1\11\2\0\1\1\4\0\1\11\1\0\26\1"+
    "\1\0\3\1\2\0\22\1\1\0\1\1\3\0\15\1"+
    "\6\0\3\1\2\0\12\1\5\0\2\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[167];
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
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexicoCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  AnalizadorLexicoCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
        case 27: 
          { return new Symbol(sym.Flotante, yychar, yyline, yytext());
          }
        case 44: break;
        case 42: 
          { return new Symbol(sym.Parametros, yychar, yyline, yytext());
          }
        case 45: break;
        case 24: 
          { return new Symbol(sym.DecInc, yychar, yyline, yytext());
          }
        case 46: break;
        case 28: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 47: break;
        case 26: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 48: break;
        case 41: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 49: break;
        case 37: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 50: break;
        case 30: 
          { return new Symbol(sym.Read, yychar, yyline, yytext());
          }
        case 51: break;
        case 21: 
          { return new Symbol(sym.Comparador, yychar, yyline, yytext());
          }
        case 52: break;
        case 31: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 53: break;
        case 14: 
          { return new Symbol(sym.LlaveA, yychar, yyline, yytext());
          }
        case 54: break;
        case 3: 
          { return new Symbol(sym.Id, yychar, yyline, yytext());
          }
        case 55: break;
        case 10: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 56: break;
        case 39: 
          { return new Symbol(sym.Print, yychar, yyline, yytext());
          }
        case 57: break;
        case 1: 
          { return new Symbol(sym.Char, yychar, yyline, yytext());
          }
        case 58: break;
        case 4: 
          { return new Symbol(sym.Asig, yychar, yyline, yytext());
          }
        case 59: break;
        case 35: 
          { return new Symbol(sym.main, yychar, yyline, yytext());
          }
        case 60: break;
        case 29: 
          { return new Symbol(sym.Boolean, yychar, yyline, yytext());
          }
        case 61: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 62: break;
        case 25: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 63: break;
        case 9: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 64: break;
        case 43: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 65: break;
        case 15: 
          { return new Symbol(sym.CorcheteA, yychar, yyline, yytext());
          }
        case 66: break;
        case 12: 
          { return new Symbol(sym.ParentesisA, yychar, yyline, yytext());
          }
        case 67: break;
        case 32: 
          { return new Symbol(sym.Nulo, yychar, yyline, yytext());
          }
        case 68: break;
        case 13: 
          { return new Symbol(sym.LlaveC, yychar, yyline, yytext());
          }
        case 69: break;
        case 18: 
          { return new Symbol(sym.DosPuntos, yychar, yyline, yytext());
          }
        case 70: break;
        case 34: 
          { return new Symbol(sym.Tipo, yychar, yyline, yytext());
          }
        case 71: break;
        case 40: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 72: break;
        case 23: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 73: break;
        case 5: 
          { return new Symbol(sym.Entero, yychar, yyline, yytext());
          }
        case 74: break;
        case 33: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 75: break;
        case 2: 
          { String errLex = "Error , caracter irreconocible: '"+yytext()+"' en la linea: "+(yyline+1)+" y columna: "+(yycolumn+1) ;
System.err.println(errLex);
          }
        case 76: break;
        case 7: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 77: break;
        case 8: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 78: break;
        case 22: 
          { return new Symbol(sym.ExprFinal, yychar, yyline, yytext());
          }
        case 79: break;
        case 16: 
          { return new Symbol(sym.CorcheteC, yychar, yyline, yytext());
          }
        case 80: break;
        case 11: 
          { return new Symbol(sym.ParentesisC, yychar, yyline, yytext());
          }
        case 81: break;
        case 38: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 82: break;
        case 19: 
          { /*Ignore*/
          }
        case 83: break;
        case 17: 
          { return new Symbol(sym.Coma, yychar, yyline, yytext());
          }
        case 84: break;
        case 36: 
          { return new Symbol(sym.Float, yychar, yyline, yytext());
          }
        case 85: break;
        case 20: 
          { return new Symbol(sym.ExprLogica, yychar, yyline, yytext());
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
