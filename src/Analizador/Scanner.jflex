package Analizador;
import java_cup.runtime.Symbol;
import Errores.Exception_;
import Tokems.Tokems;
import java.util.ArrayList;

%%

%{
    public static ArrayList<Tokems> lexemas = new ArrayList<Tokems>();
    //se agrega el codigo que necesite en java
    public static ArrayList<Exception_> erroreslexicos = new ArrayList<Exception_>(); //estatico para que no se borre
%}

%class scanner  // definir como trabajara el scanner 
%cup            // trabajar con cup 
%public         // tipo publico
%line           // conteo de lineas - linea por linea
%char           // caracter por caracter
%unicode        // tipo de codigicacion para que acepte la  ñ u otro caracter
%ignorecase     // case insensitive 

%init{ 
	yyline = 1; 
	yychar = 1; 
%init} 

//simbolos
PAR_IZQ   = "("
PAR_DER   = ")"
CHR_IZQ   = "{"
CHR_DER   = "}"
COR_IZQ  = "["
COR_DER  = "]" 
PTCOMA  = ";"
PUNTO = "."
IGUAL  = "="
MAS = "+"
MENOS = "-"
POR = "*"
DIV = "/"
DIFERENTE = "!="
COMMA = ","
DOSPT = ":"
TITLE = "\"Titulo\""
EJEX = "EjeX"
EJEY = "EjeY"


//palabras reservadas



//expresiones
ENTERO  = [0-9]+   
DECIMAL = [0-9]+("."[  |0-9]+)?
CADENA = [\"][^\"\n]+[\"]
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
ID = [a-zA-Z_][a-zA-Z0-9_]*
COMENTAR = "//" .* ("\n"|"")

//RESERVADAS
VOID = "void"
MAIN = "main"
IMPRIMIR = "Console"
WRITE = "Write"
PRUEBA = "int"
VARCHAR = "char"
VARBOOL = "bool"
VARSTRING = "string"
VARDOUBLE = "double"
RIF = "if"
IGUALDAD = "=="
MENOR_QUE = "<"
MAYOR_QUE = ">"
MENOR_IGUAL = "<="
MAYOR_IGUAL = ">="
DESIF = "else"
BOOLTRUE = "True"
BOOLFAL = "False"
REVALUAR = "Evaluar"
ENCICLADO = "while"
OR = "||"
AND = "&&"
RSWITCH = "switch"
RCASE = "case"
RBREAK = "break"


%%

//RESERVADAS
<YYINITIAL> {REVALUAR}  {lexemas.add(new Tokems(yytext(), "REVALUAR", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.REVALUAR, yyline, yychar,yytext());  }
<YYINITIAL> {ENCICLADO}  {lexemas.add(new Tokems(yytext(),"ENCICLADO", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.ENCICLADO, yyline, yychar,yytext());  }
<YYINITIAL> {PRUEBA}  {lexemas.add(new Tokems(yytext(),"PRUEBA" , Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.PRUEBA, yyline, yychar,yytext());  }
<YYINITIAL> {VARBOOL}  {lexemas.add(new Tokems(yytext(),"VARBOOL", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.VARBOOL, yyline, yychar,yytext());  }
<YYINITIAL> {VARCHAR}  {lexemas.add(new Tokems(yytext(),"VARCHAR", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.VARCHAR, yyline, yychar,yytext());  }
<YYINITIAL> {VARSTRING}  {lexemas.add(new Tokems(yytext(),"VARSTRING", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.VARSTRING, yyline, yychar,yytext());  }
<YYINITIAL> {RIF}  {lexemas.add(new Tokems(yytext(),"RIF", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.RIF, yyline, yychar,yytext());  }
<YYINITIAL> {DESIF}  {lexemas.add(new Tokems(yytext(),"RIF", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.DESIF, yyline, yychar,yytext());  }
<YYINITIAL> {BOOLTRUE}  {lexemas.add(new Tokems(yytext(),"BOOLTRUE", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.BOOLTRUE, yyline, yychar,yytext());  }
<YYINITIAL> {BOOLFAL}  {lexemas.add(new Tokems(yytext(),"BOOLFAL", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.BOOLFAL, yyline, yychar,yytext());  }
<YYINITIAL> {IMPRIMIR} {lexemas.add(new Tokems(yytext(),"IMPRIMIR", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.IMPRIMIR, yyline, yychar,yytext());}
<YYINITIAL> {WRITE}     {lexemas.add(new Tokems(yytext(),"WRITE", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.WRITE, yyline, yychar,yytext());}
<YYINITIAL> {PAR_IZQ}   {lexemas.add(new Tokems(yytext(),"PAR_IZQ", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.PAR_IZQ, yyline, yychar,yytext());  }
<YYINITIAL> {PAR_DER}   {lexemas.add(new Tokems(yytext(),"PAR_DER", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.PAR_DER, yyline, yychar,yytext());  }
<YYINITIAL> {COR_IZQ}   {lexemas.add(new Tokems(yytext(),"COR_IZQ", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.COR_IZQ, yyline, yychar,yytext());  }
<YYINITIAL> {COR_DER}  {lexemas.add(new Tokems(yytext(),"COR_DER" , Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.COR_DER, yyline, yychar,yytext());  }
<YYINITIAL> {PTCOMA}  {lexemas.add(new Tokems(yytext(),"PTCOMA", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.PTCOMA, yyline, yychar ,yytext());}
<YYINITIAL> {OR}  {lexemas.add(new Tokems(yytext(),"OR", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.OR, yyline, yychar ,yytext());}
<YYINITIAL> {AND}  {lexemas.add(new Tokems(yytext(),"PTCOMA", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.AND, yyline, yychar ,yytext());}
<YYINITIAL> {RSWITCH}  {lexemas.add(new Tokems(yytext(),"RSWITCH", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.RSWITCH, yyline, yychar ,yytext());}
<YYINITIAL> {RCASE}  {lexemas.add(new Tokems(yytext(),"RCASE", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.RCASE, yyline, yychar ,yytext());}
<YYINITIAL> {RBREAK}  {lexemas.add(new Tokems(yytext(),"RBREAK", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.RBREAK, yyline, yychar ,yytext());}
<YYINITIAL> {TITLE}  {lexemas.add(new Tokems(yytext(),"TITLE", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.TITLE, yyline, yychar ,yytext());}
<YYINITIAL> {VARDOUBLE}  {lexemas.add(new Tokems(yytext(),"VARDOUBLE", Integer.toString(yyline), Integer.toString(yychar)));  return new Symbol(sym.VARDOUBLE, yyline, yychar ,yytext());}





<YYINITIAL> {MAS}       {lexemas.add(new Tokems(yytext(),"MAS", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.MAS, yyline, yychar ,yytext());  }
<YYINITIAL> {MENOS}     {lexemas.add(new Tokems(yytext(),"MENOS", Integer.toString(yyline), Integer.toString(yychar)));;   return new Symbol(sym.MENOS, yyline, yychar ,yytext());    }
<YYINITIAL> {POR}       {lexemas.add(new Tokems(yytext(),"POR", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.POR, yyline, yychar ,yytext());   }
<YYINITIAL> {DIV}       {lexemas.add(new Tokems(yytext(),"DIV", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.DIV, yyline, yychar ,yytext());   }
<YYINITIAL> {DIFERENTE}       {lexemas.add(new Tokems(yytext(),"DIFERENTE", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.DIFERENTE, yyline, yychar ,yytext());   }
<YYINITIAL> {COMMA}       {lexemas.add(new Tokems(yytext(),"COMMA", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.COMMA, yyline, yychar ,yytext());}
<YYINITIAL> {DOSPT} {lexemas.add(new Tokems(yytext(),"DOSPT", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.DOSPT, yyline, yychar ,yytext());}


<YYINITIAL> {COMENTAR}   {lexemas.add(new Tokems(yytext(),"Comentario", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.COMENTAR, yyline, yychar ,yytext());   }

<YYINITIAL> {ENTERO}    {lexemas.add(new Tokems(yytext(),"ENTERO", Integer.toString(yyline), Integer.toString(yychar)));;   return new Symbol(sym.ENTERO, yyline, yychar ,yytext());   }

<YYINITIAL> {DECIMAL}   {lexemas.add(new Tokems(yytext(),"DECIMAL", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.DECIMAL, yyline, yychar ,yytext());  }

<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }

\n {yychar=1;}

<YYINITIAL> {CADENA}     {lexemas.add(new Tokems(yytext(),"CADENA", Integer.toString(yyline), Integer.toString(yychar)));; return new Symbol(sym.CADENA, yyline, yychar ,yytext());}

"[A-Za-z]+"    {lexemas.add(new Tokems(yytext(),"El caracter : '"+yytext(), Integer.toString(yyline), Integer.toString(yychar)));; return new Symbol(sym.EXPRESION, yyline, yychar ,yytext());}

<YYINITIAL> {PUNTO}     {lexemas.add(new Tokems(yytext(),"PUNTO", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.PUNTO, yyline, yychar ,yytext());}

<YYINITIAL> {VOID}  {lexemas.add(new Tokems(yytext(),"VOID", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.VOID, yyline, yychar ,yytext());  }

<YYINITIAL> {MAIN}     {lexemas.add(new Tokems(yytext(),"MAIN", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.MAIN, yyline, yychar ,yytext());}

<YYINITIAL> {CHR_IZQ}  {lexemas.add(new Tokems(yytext(),"CHR_IZQ", Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.CHR_IZQ, yyline, yychar ,yytext());  }

<YYINITIAL> {CHR_DER}     {lexemas.add(new Tokems(yytext(),"CHR_DER", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.CHR_DER, yyline, yychar ,yytext());}

<YYINITIAL> {ID}     {lexemas.add(new Tokems(yytext(),"ID", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.ID, yyline, yychar ,yytext());}

<YYINITIAL> {IGUAL}     {lexemas.add(new Tokems(yytext(),"IGUAL" , Integer.toString(yyline), Integer.toString(yychar)));   return new Symbol(sym.IGUAL, yyline, yychar ,yytext());}

<YYINITIAL> {IGUALDAD}     {lexemas.add(new Tokems(yytext(),"IGUALDAD", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.IGUALDAD, yyline, yychar ,yytext());}

<YYINITIAL> {MENOR_QUE}     {lexemas.add(new Tokems(yytext(),"MENOR_QUE", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.MENOR_QUE, yyline, yychar ,yytext());}

<YYINITIAL> {MAYOR_QUE}     {lexemas.add(new Tokems(yytext(),"MAYOR_QUE", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.MAYOR_QUE, yyline, yychar ,yytext());}

<YYINITIAL> {MENOR_IGUAL}     {lexemas.add(new Tokems(yytext(),"MENOR_IGUAL", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.MENOR_IGUAL, yyline, yychar ,yytext());}

<YYINITIAL> {MAYOR_IGUAL}     {lexemas.add(new Tokems(yytext(),"MAYOR_IGUAL", Integer.toString(yyline), Integer.toString(yychar))); return new Symbol(sym.MAYOR_IGUAL, yyline, yychar ,yytext());}




<YYINITIAL> . {
        //String errLex = "Error léxico: '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yychar);
        //System.out.println(errLex);
        erroreslexicos.add(new Exception_ ("Léxico","El caracter : '"+yytext(), Integer.toString(yyline), Integer.toString(yychar)));
}
















/*
Definición de Símbolos y Palabras Reservadas:

Has definido una serie de símbolos utilizando nombres significativos como PAR_IZQ, PAR_DER, MAS, MENOS, etc., para representar diferentes operadores y símbolos en tu lenguaje.
También has definido una palabra reservada: REVALUAR.
Expresiones Regulares:

Cada línea que comienza con <YYINITIAL> seguida de una expresión regular y una acción indica cómo reconocer y manejar ciertas secuencias en el texto de entrada.
Por ejemplo, <YYINITIAL> {PAR_IZQ} significa que cuando se encuentre el símbolo ( en el texto de entrada, se generará un símbolo correspondiente utilizando sym.PAR_IZQ.
Acciones:

Las acciones que siguen a las expresiones regulares definen qué hacer cuando se encuentra una coincidencia en el texto de entrada.
Por ejemplo, return new Symbol(sym.PAR_IZQ, yyline, yycolumn,yytext()); crea un objeto Symbol correspondiente al símbolo PAR_IZQ, almacena información sobre la ubicación (línea y columna) y el texto que coincide.
Ignorar Espacios en Blanco y Saltos de Línea:

Las expresiones <YYINITIAL> {SPACE} y <YYINITIAL> {ENTER} indican que los espacios en blanco y los saltos de línea deben ser ignorados y no generarán ningún símbolo.
Palabra Reservada Especial:

<YYINITIAL> {REVALUAR} está diseñado para reconocer la palabra reservada REVALUAR en el texto de entrada. Cuando se encuentra, se crea un símbolo correspondiente utilizando sym.REVALUAR.

*/