package Analizador;
import java_cup.runtime.Symbol;
import Errores.Exception_;
import java.util.ArrayList;

%%

%{
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

//simbolos
PAR_IZQ   = "("
PAR_DER   = ")"
CHR_IZQ   = "{"
CHR_DER   = "}"
COR_IZQ  = "["
COR_DER  = "]" 
PTCOMA  = ";"
COMILLAS  = "\""
PUNTO = "."
PRUEBA = "Evaluar"


MAS = "+"
MENOS = "-"
POR = "*"
DIV = "/"

//palabras reservadas
REVALUAR = "Evaluar"

//expresiones
ENTERO  = [0-9]+   
DECIMAL = [0-9]+("."[  |0-9]+)?
CADENA = [\"][^\"\n]+[\"]
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]


//RESERVADAS
VOID = "void"
MAIN = "main"
IMPRIMIR = "Console"
WRITE = "Write"



%%

<YYINITIAL> {REVALUAR}  {   return new Symbol(sym.REVALUAR, yyline, yycolumn,yytext());  }

<YYINITIAL> {IMPRIMIR}     { return new Symbol(sym.IMPRIMIR, yyline, yycolumn,yytext());}

<YYINITIAL> {WRITE}     { return new Symbol(sym.WRITE, yyline, yycolumn,yytext());}

<YYINITIAL> {PRUEBA}  {   return new Symbol(sym.PRUEBA, yyline, yycolumn,yytext());  }

<YYINITIAL> {PAR_IZQ}   {   return new Symbol(sym.PAR_IZQ, yyline, yycolumn,yytext());  }

<YYINITIAL> {PAR_DER}   {   return new Symbol(sym.PAR_DER, yyline, yycolumn,yytext());  }

<YYINITIAL> {COR_IZQ}   {   return new Symbol(sym.COR_IZQ, yyline, yycolumn,yytext());  }

<YYINITIAL> {COR_DER}   {   return new Symbol(sym.COR_DER, yyline, yycolumn,yytext());  }

<YYINITIAL> {PTCOMA}    {   return new Symbol(sym.PTCOMA, yyline, yycolumn,yytext());   }

<YYINITIAL> {MAS}       {   return new Symbol(sym.MAS, yyline, yycolumn,yytext());  }

<YYINITIAL> {MENOS}     {   return new Symbol(sym.MENOS, yyline, yycolumn,yytext());    }

<YYINITIAL> {POR}       {   return new Symbol(sym.POR, yyline, yycolumn,yytext());   }

<YYINITIAL> {DIV}       {   return new Symbol(sym.DIV, yyline, yycolumn,yytext());   }

<YYINITIAL> {ENTERO}    {   return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());   }

<YYINITIAL> {DECIMAL}   {   return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());  }

<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }

<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}

<YYINITIAL> {CADENA}     { return new Symbol(sym.CADENA, yyline, yycolumn,yytext());}

<YYINITIAL> {COMILLAS}     { return new Symbol(sym.COMILLAS, yyline, yycolumn,yytext());}

<YYINITIAL> {PUNTO}     { return new Symbol(sym.PUNTO, yyline, yycolumn,yytext());}

<YYINITIAL> {VOID}  {   return new Symbol(sym.VOID, yyline, yycolumn,yytext());  }

<YYINITIAL> {MAIN}     { return new Symbol(sym.MAIN, yyline, yycolumn,yytext());}

<YYINITIAL> {CHR_IZQ}  {   return new Symbol(sym.CHR_IZQ, yyline, yycolumn,yytext());  }

<YYINITIAL> {CHR_DER}     { return new Symbol(sym.CHR_DER, yyline, yycolumn,yytext());}

<YYINITIAL> . {
        //String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        //System.out.println(errLex);
        erroreslexicos.add(new Exception_ ("Léxico","El caracter : '"+yytext()+"' no pertenece al lenguaje StatPy Convertor", Integer.toString(yyline), Integer.toString(yycolumn+1)));
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