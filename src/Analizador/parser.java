
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizador;

import java_cup.runtime.*;
import Errores.Exception_;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\004\000\002\002\011\000\002\003" +
    "\004\000\002\003\003\000\002\004\004\000\002\004\004" +
    "\000\002\004\004\000\002\011\006\000\002\007\010\000" +
    "\002\005\004\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\003\000\002\005" +
    "\003\000\002\005\005\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\030\005\001\002\000\004\002\056\001" +
    "\002\000\004\027\006\001\002\000\004\005\007\001\002" +
    "\000\004\006\010\001\002\000\004\031\011\001\002\000" +
    "\010\003\013\020\014\026\020\001\002\000\012\003\013" +
    "\020\014\026\020\032\055\001\002\000\004\004\053\001" +
    "\002\000\004\007\030\001\002\000\004\004\027\001\002" +
    "\000\012\003\ufffe\020\ufffe\026\ufffe\032\ufffe\001\002\000" +
    "\004\004\026\001\002\000\004\025\021\001\002\000\004" +
    "\023\022\001\002\000\004\005\023\001\002\000\004\021" +
    "\024\001\002\000\004\006\025\001\002\000\004\004\ufff9" +
    "\001\002\000\012\003\ufffd\020\ufffd\026\ufffd\032\ufffd\001" +
    "\002\000\012\003\ufffc\020\ufffc\026\ufffc\032\ufffc\001\002" +
    "\000\014\005\033\012\031\015\035\016\032\021\036\001" +
    "\002\000\014\005\033\012\031\015\035\016\032\021\036" +
    "\001\002\000\016\006\ufff2\010\ufff2\011\ufff2\012\ufff2\013" +
    "\ufff2\014\ufff2\001\002\000\014\005\033\012\031\015\035" +
    "\016\032\021\036\001\002\000\014\010\040\011\037\012" +
    "\041\013\043\014\042\001\002\000\016\006\ufff3\010\ufff3" +
    "\011\ufff3\012\ufff3\013\ufff3\014\ufff3\001\002\000\016\006" +
    "\ufff0\010\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0\001\002" +
    "\000\014\005\033\012\031\015\035\016\032\021\036\001" +
    "\002\000\004\004\ufffa\001\002\000\014\005\033\012\031" +
    "\015\035\016\032\021\036\001\002\000\014\005\033\012" +
    "\031\015\035\016\032\021\036\001\002\000\014\005\033" +
    "\012\031\015\035\016\032\021\036\001\002\000\016\006" +
    "\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5\014\ufff5\001\002" +
    "\000\016\006\ufff4\010\ufff4\011\ufff4\012\ufff4\013\ufff4\014" +
    "\ufff4\001\002\000\016\006\ufff6\010\ufff6\011\ufff6\012\ufff6" +
    "\013\043\014\042\001\002\000\016\006\ufff7\010\ufff7\011" +
    "\ufff7\012\ufff7\013\043\014\042\001\002\000\014\006\051" +
    "\011\037\012\041\013\043\014\042\001\002\000\016\006" +
    "\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1\001\002" +
    "\000\016\006\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014" +
    "\ufff8\001\002\000\012\003\ufffb\020\ufffb\026\ufffb\032\ufffb" +
    "\001\002\000\012\003\uffff\020\uffff\026\uffff\032\uffff\001" +
    "\002\000\004\002\000\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\003\011\004\015\007\016\011\014\001" +
    "\001\000\010\004\053\007\016\011\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\033\001\001\000\004\005\051\001\001\000\002\001" +
    "\001\000\004\005\047\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\046\001\001\000" +
    "\002\001\001\000\004\005\045\001\001\000\004\005\044" +
    "\001\001\000\004\005\043\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible
    public static ArrayList<Exception_> Traduccion = new ArrayList<Exception_>();
    public static ArrayList<Exception_> erroresSintacticos = new ArrayList<Exception_>(); //ArrayList del los errores sintacticos
    
    public void syntax_error(Symbol s){
        erroresSintacticos.add(new Exception_("Sintáctico", "Error Recuperable de sintaxis: "+ s.value , Integer.toString(s.left), Integer.toString(s.right) ));
        System.out.println("Error R de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error NR de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= VOID MAIN PAR_IZQ PAR_DER CHR_IZQ instrucciones CHR_DER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instrucciones instruccion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruccion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= sentencia PTCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= sumar PTCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= error PTCOMA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // sumar ::= REVALUAR COR_IZQ expresion COR_DER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    System.out.println("El valor de la expresión es: "+a);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sumar",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // sentencia ::= IMPRIMIR PUNTO WRITE PAR_IZQ CADENA PAR_DER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    //Traduccion.add(new Exception_("Sintáctico", "Error Recuperable de sintaxis: "+ s.value , Integer.toString(s.left), Integer.toString(s.right) ));
    System.out.println("print("+a+")");
    

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresion ::= MENOS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=a*-1; System.out.println("operación umenos"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= expresion MAS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=a+b;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= expresion MENOS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=a-b;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= expresion POR expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=a*b;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= expresion DIV expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=a/b;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= ENTERO 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Double(a);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= DECIMAL 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Double(a);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=a;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= CADENA 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}