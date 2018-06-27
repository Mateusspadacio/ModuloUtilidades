package com.constants;

public class Constants {

	// Caracteres
	public static final String CARACTER_CHAVE_ABERTA = "{";
	public static final String CARACTER_CHAVE_FECHADA = "}";
	public static final String CARACTER_PARENTES_ABERTO = "(";
	public static final String CARACTER_PARENTES_FECHADO = ")";
	public static final String CARACTER_DIFERENCA = "!=";
	public static final String CARACTER_VIRGULA = ",";
	public static final String CARACTER_PONTO_VIRGULA = ";";
	public static final String CARACTER_CONCATENACAO = "\"+";
	public static final String CARACTER_ABRE_COMENTARIO_LINHA = "//";
	public static final String CARACTER_ABRE_COMENTARIO_MULTI_LINHA = "/*";
	public static final String CARACTER_FECHA_COMENTARIO_MULTI_LINHA = "*/";
	public static final String CARACTER_IGUAL = "=";
	public static final String CARACTER_PARENTESES = "\"";
	public static final String CARACTER_PIPE = " | ";
	public static final String CARACTER_TRACO = " - ";
	public static final String CARACTER_VAZIO = "";
	public static final String CARACTER_PONTO_CONCATENADO = "\".";
	public static final String CARACTER_PONTO_CONCATENADO_SIMPLES = "'.";
	public static final String CARACTER_MAIS = "+";
	public static final String CARACTER_MENOS = "-";
	public static final String CARACTER_DOLAR = "$";
	public static final String CARACTER_FLECHA = "->|";
	public static final String CARACTER_MENOR = "<";
	public static final String CARACTER_MAIOR = ">";

	// Palavras reservadas do Java
	public static final String PALAVRA_PUBLIC = "public";
	public static final String PALAVRA_PRIVATE = "private";
	public static final String PALAVRA_PROTECTED = "protected";
	public static final String PALAVRA_STATIC = "static";
	public static final String PALAVRA_IMPORT = "import";
	public static final String PALAVRA_FINAL = "final";
	public static final String PALAVRA_THROWS = "throws";
	public static final String PALAVRA_THROWABLE = "Throwable";
	public static final String PALAVRA_TRY = "try";
	public static final String PALAVRA_CATCH = "catch";
	public static final String PALAVRA_ELSE_IF = "else if";
	public static final String PALAVRA_ELSE = "else";
	public static final String PALAVRA_WHILE = "while";
	public static final String PALAVRA_SWITCH = "switch";
	public static final String PALAVRA_NEW = "new";
	public static final String PALAVRA_SOCKET = "Socket";
	public static final String PALAVRA_SSL = "SSL";
	public static final String PALAVRA_NULL = "null";
	public static final String PALAVRA_IF = "if";
	public static final String PALAVRA_INCLUDE = "include";
	public static final String PALAVRA_UNSIGNED = "unsigned";
	

	// Classes que serão analisadas
	public static final String CLASSE_JPASSWORDFIELD = "JPasswordField";
	public static final String CLASSE_INTEGER = "Integer";
	public static final String CLASSE_FLOAT = "Float";
	public static final String CLASSE_DOUBLE = "Double";
	public static final String CLASSE_BOOLEAN = "Boolean";
	public static final String CLASSE_LONG = "Long";
	public static final String CLASSE_SHORT = "Short";
	public static final String CLASSE_BYTE = "Byte";
	public static final String CLASSE_CHARACTER = "Character";
	
	//Tipos primitivos
	public static final String PRIMITIVO_INT = "int";
	public static final String PRIMITIVO_FLOAT = "float";
	public static final String PRIMITIVO_DOUBLE = "double";
	public static final String PRIMITIVO_LONG = "long";
	public static final String PRIMITIVO_SHORT = "short";
	public static final String PRIMITIVO_BYTE = "byte";
	public static final String PRIMITIVO_CHAR = "char";
	

	// Comandos SQL
	public static final String SQL_SELECT = "select";
	public static final String SQL_UPDATE = "update";
	public static final String SQL_INSERT = "insert";
	public static final String SQL_DELETE = "delete";
	public static final String SQL_BEGIN = "begin";
	public static final String SQL_CALL = "call";
	
	// Metodos
	public static final String METODO_GET_TEXT = ".getText()";
	public static final String METODO_GET_URL_PHP = "$_GET[";
	public static final String METODO_ARRAY_SEARCH = "array_search(";
	public static final String METODO_GETS = "gets(";
	public static final String METODO_VSPRINTF = "vsprintf(";
	public static final String METODO_SPRINTF = "sprintf(";
	
	// Extensões
	public static final String PDF = ".pdf";

	// Splits
	public static final String SPLIT_CLASSES_UNBOXING = getSplitUnboxing();
	public static final String SPLIT_VARIAVEIS_PASSWORDFIELD = getSplitVariaveisPasswordfield();

	private static String getSplitUnboxing() {
		return "Byte|Boolean|Short|Integer|Float|Double|Long|Character"
				+ "|ArrayList<Byte>|ArrayList<Boolean>|ArrayList<Short>|ArrayList<Integer>|ArrayList<Float>|ArrayList<Double>|ArrayList<Long>|ArrayList<Character>"
				+ "|List<Byte>|List<Boolean>|List<Integer>|List<Float>|List<Double>|List<Long>|List<Character>";
	}

	private static String getSplitVariaveisPasswordfield() {
		return CARACTER_IGUAL + CARACTER_PIPE + PALAVRA_NEW + CARACTER_PIPE + 
				PALAVRA_PUBLIC + CARACTER_PIPE + PALAVRA_PROTECTED + CARACTER_PIPE + CLASSE_JPASSWORDFIELD;
	}

}
