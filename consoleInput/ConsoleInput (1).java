package ejercicios6_Excepciones;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
    private Scanner keyboard;

    public ConsoleInput(Scanner keyboard) {
        this.keyboard = keyboard;
    }
    
    // Limpiar el teclado
    private void cleanInput() {
        keyboard.nextLine();
    }
    
    
	/*=== VALORES INT ===*/
    		// Retorna un int introducido por el usuario
    		public int readInt() {
    			int value = 0;
    			boolean error;
    		
    			do {
    				try {
    					value = keyboard.nextInt();
    					error = false;
    				} catch (InputMismatchException e) {
    					// En el readIntInRange queda raro, preguntar
    					System.err.printf("¡Error! Eso no es un número entero\n");
    					error = true;
    				} finally {
    					cleanInput();
    				}
    			} while (error);
    		
    			return value;
    		}
    
    		// Retorna un int introducido por el usuario inferior al parámetro
    		public int readIntLessThan(int upperBound) {
    			int value;
    			do {
    				value = readInt();
    				if (value >= upperBound) {
    					System.err.printf("¡Error! El número debe ser menor que %d\n", upperBound);
    				}
    			} while (value >= upperBound);
    			return value;
    		}
    
    		// Retorna un int introducido por el usuario inferior o igual al parámetro
    		public int readIntLessOrEqualThan(int upperBound) {
    			int value;
    			do {
    				value = readInt();
    				if (value > upperBound) {
    					System.err.printf("¡Error! El número debe ser menor o igual que %d\n", upperBound);
    				}
    			} while (value > upperBound);
    			return value;
    		}
    
    		// Retorna un int introducido por el usuario superior al parámetro
    		public int readIntGreaterThan(int lowerBound) {
    			int value;
    			do {
    				value = readInt();
    				if (value <= lowerBound) {
    					System.err.printf("¡Error! El número debe ser mayor que %d\n", lowerBound);
    				}
    			} while (value <= lowerBound);
    			return value;
    		}
    
    		// Retorna un int introducido por el usuario superior o igual al parámetro
    		public int readIntGreaterOrEqualThan(int lowerBound) {
    			int value;
    			do {
    				value = readInt();
    				if (value < lowerBound) {
    					System.err.printf("¡Error! El número debe ser mayor o igual que %d\n", lowerBound);
    				}
    			} while (value < lowerBound);
    			return value;
    		}
    
    		// Retorna un int introducido por el usuario cuyo valor esté en el rango [lowerBound, upperBound], ambos incluidos
    		public int readIntInRange(int lowerBound, int upperBound) {
    			int value;
    			do {
    				value = readInt();
    				if (value < lowerBound || value > upperBound) {
    					System.err.printf("¡Error! El número debe estar entre %d y %d\n", lowerBound, upperBound);
    				}
    			} while (value < lowerBound || value > upperBound);
    			return value;
    		}
    
    		
    	/*=== VALORES BYTE ===*/
    		// Retorna un byte introducido por el usuario 
    		public byte readByte() {
    			byte value = 0;
    			boolean error;
    		
    			do {
    				try {
    					value = keyboard.nextByte();
    					error = false;
    				} catch (InputMismatchException e) {
    					System.err.printf("¡Error! Eso no es un número byte\n");
    					error = true;
    				} finally {
    					cleanInput();
    				}
    			} while (error);
    		
    			return value;
    		}
    
    		// Retorna un byte introducido por el usuario inferior al prámetro
    		public byte readByteLessThan(byte upperBound) {
    			byte value;
    			do {
    				value = readByte();
    				if (value >= upperBound) {
    					System.err.printf("¡Error! El número byte debe ser menor que %d\n", upperBound);
    				}
    			} while (value >= upperBound);
    			return value;
    		}
    
    		// Retorna un byte introducido por el usuario inferior o igual al parámetro
    		public byte readByteLessOrEqualThan(byte upperBound) {
    			byte value;
    			do {
    				value = readByte();
    				if (value > upperBound) {
    					System.err.printf("¡Error! El número byte debe ser menor o igual que %d\n", upperBound);
    				}
    			} while (value > upperBound);
    			return value;
    		}
    
    		// Retorna un byte introducido por el usuario superior al parámetro
    		public byte readByteGreaterThan(byte lowerBound) {
    			byte value;
    			do {
    				value = readByte();
    				if (value <= lowerBound) {
    					System.err.printf("¡Error! El número byte debe ser mayor que %d\n", lowerBound);
    				}
    			} while (value <= lowerBound);
    			return value;
    		}
    
    		// Retorna un byte introducido por el usuario superior o igual al parámetro
    		public byte readByteGreaterOrEqualThan(byte lowerBound) {
    			byte value;
    			do {
    				value = readByte();
    				if (value < lowerBound) {
    					System.err.printf("¡Error! El número byte debe ser mayor o igual que %d\n", lowerBound);
    				}
    			} while (value < lowerBound);
    			return value;
    		}
    
    		// Retorna un byte introducido por el usuario cuyo valor esté en el rango [lowerBound, upperBound], ambos incluidos
    		public byte readByteInRange(byte lowerBound, byte upperBound) {
    			byte value;
    			do {
    				value = readByte();
    				if (value < lowerBound || value > upperBound) {
    					System.err.printf("¡Error! El byte debe estar entre %d y %d\n ", lowerBound, upperBound);
    				}
    			} while (value < lowerBound || value > upperBound);
    			return value;
    		}
    		
    		
        	/*=== VALORES SHORT ===*/
    			// Retorna un short introducido por el usuario 
    			public short readShort() {
    				short value = 0;
    				boolean error;
    		
    				do {
    					try {
    						value = keyboard.nextShort();
    						error = false;
    					} catch (InputMismatchException e) {
    						System.err.printf("¡Error! Eso no es un número short\n");
    						error = true;
    					} finally {
    						cleanInput();
    					}
    				} while (error);
    		
    				return value;
    			}
    
    			// Retorna un short introducido por el usuario inferior al prámetro
    			public short readShortLessThan(short upperBound) {
    				short value;
    				do {
    					value = readShort();
    					if (value >= upperBound) {
    						System.err.printf("¡Error! El número short debe ser menor que %d\n", upperBound);
    					}
    				} while (value >= upperBound);
    				return value;
    			}
    
    			// Retorna un short introducido por el usuario inferior o igual al parámetro
    			public short readShortLessOrEqualThan(short upperBound) {
    				short value;
    				do {
    					value = readShort();
    					if (value > upperBound) {
    						System.err.printf("¡Error! El número short debe ser menor o igual que %d\n", upperBound);
    					}
    				} while (value > upperBound);
    				return value;
    			}
    
    			// Retorna un short introducido por el usuario superior al parámetro
    			public short readShortGreaterThan(short lowerBound) {
    				short value;
    				do {
    					value = readShort();
    					if (value <= lowerBound) {
    						System.err.printf("¡Error! El número short debe ser mayor que %d\n", lowerBound);
    					}
    				} while (value <= lowerBound);
    				return value;
    			}
    
    			// Retorna un short introducido por el usuario superior o igual al parámetro
    			public short readShortGreaterOrEqualThan(short lowerBound) {
    				short value;
    				do {
    					value = readShort();
    					if (value < lowerBound) {
    						System.err.printf("¡Error! El número short debe ser mayor o igual que %d\n", lowerBound);
    					}
    				} while (value < lowerBound);
    				return value;
    			}
    
    			// Retorna un short introducido por el usuario cuyo valor esté en el rango [lowerBound, upperBound], ambos incluidos
    			public short readShortInRange(short lowerBound, short upperBound) {
    				short value;
    				do {
    					value = readShort();
    					if (value < lowerBound || value > upperBound) {
    						System.err.printf("¡Error! El short debe estar entre %d y %d\n ", lowerBound, upperBound);
    					}
    				} while (value < lowerBound || value > upperBound);
    				return value;
    			}
    			
    			
    		/*=== VALORES LONG ===*/
    			// Retorna un long introducido por el usuario 
    			public long readLong() {
    				long value = 0;
    				boolean error;
    		
    				do {
    					try {
    						value = keyboard.nextLong();
    						error = false;
    					} catch (InputMismatchException e) {
    						System.err.printf("¡Error! Eso no es un número long\n");
    						error = true;
    					} finally {
    						cleanInput();
    					}
    				} while (error);
    		
    				return value;
    			}
    
    			// Retorna un long introducido por el usuario inferior al prámetro
    			public long readLongLessThan(long upperBound) {
    				long value;
    				do {
    					value = readLong();
    					if (value >= upperBound) {
    						System.err.printf("¡Error! El número long debe ser menor que %d\n", upperBound);
    					}
    				} while (value >= upperBound);
    				return value;
    			}
    
    			// Retorna un long introducido por el usuario inferior o igual al parámetro
    			public long readLongLessOrEqualThan(long upperBound) {
    				long value;
    				do {
    					value = readLong();
    					if (value > upperBound) {
    						System.err.printf("¡Error! El número long debe ser menor o igual que %d\n", upperBound);
    					}
    				} while (value > upperBound);
    				return value;
    			}
    
    			// Retorna un long introducido por el usuario superior al parámetro
    			public long readLongGreaterThan(long lowerBound) {
    				long value;
    				do {
    					value = readLong();
    					if (value <= lowerBound) {
    						System.err.printf("¡Error! El número long debe ser mayor que %d\n", lowerBound);
    					}
    				} while (value <= lowerBound);
    				return value;
    			}
    
    			// Retorna un long introducido por el usuario superior o igual al parámetro
    			public long readLongGreaterOrEqualThan(long lowerBound) {
    				long value;
    				do {
    					value = readLong();
    					if (value < lowerBound) {
    						System.err.printf("¡Error! El número long debe ser mayor o igual que %d\n", lowerBound);
    					}
    				} while (value < lowerBound);
    				return value;
    			}
    
    			// Retorna un long introducido por el usuario cuyo valor esté en el rango [lowerBound, upperBound], ambos incluidos
    			public long readLongInRange(long lowerBound, long upperBound) {
    				long value;
    				do {
    					value = readLong();
    					if (value < lowerBound || value > upperBound) {
    						System.err.printf("¡Error! El long debe estar entre %d y %d\n ", lowerBound, upperBound);
    					}
    				} while (value < lowerBound || value > upperBound);
    				return value;
    			}    			
    
    			
    /*=== VALORES DOUBLE ===*/
    		// Casi siempre se usa double en vez de float
    		// Retorna un double introducido por el usuario 
    		public double readDouble() {
    			double value = 0;
    			boolean error;
    		
    			do {
    				try {
    					value = keyboard.nextDouble();
    					error = false;
    				} catch (InputMismatchException e) {
    					System.err.printf("¡Error! Eso no es un número decimal\n");
    					error = true;
    				} finally {
    					cleanInput();
    				}
    			} while (error);
    		
    			return value;
    		}
    
    		// Retorna un double introducido por el usuario inferior al prámetro
    		public double readDoubleLessThan(double upperBound) {
    			double value;
    			do {
    				value = readDouble();
    				if (value >= upperBound) {
    					System.err.printf("¡Error! El número decimal debe ser menor que %f\n", upperBound);
    				}
    			} while (value >= upperBound);
    			return value;
    		}
    
    		// Retorna un double introducido por el usuario inferior o igual al parámetro
    		public double readDoubleLessOrEqualThan(double upperBound) {
    			double value;
    			do {
    				value = readDouble();
    				if (value > upperBound) {
    					System.err.printf("¡Error! El número decimal debe ser menor o igual que %f\n", upperBound);
    				}
    			} while (value > upperBound);
    			return value;
    		}
    
    		// Retorna un double introducido por el usuario superior al parámetro
    		public double readDoubleGreaterThan(double lowerBound) {
    			double value;
    			do {
    				value = readDouble();
    				if (value <= lowerBound) {
    					System.err.printf("¡Error! El número decimal debe ser mayor que %f\n", lowerBound);
    				}
    			} while (value <= lowerBound);
    			return value;
    		}
    
    		// Retorna un double introducido por el usuario superior o igual al parámetro
    		public double readDoubleGreaterOrEqualThan(double lowerBound) {
    			double value;
    			do {
    				value = readDouble();
    				if (value < lowerBound) {
    					System.err.printf("¡Error! El número decimal debe ser mayor o igual que %f\n", lowerBound);
    				}
    			} while (value < lowerBound);
    			return value;
    		}
    
    		// Retorna un double introducido por el usuario cuyo valor esté en el rango [lowerBound, upperBound], ambos incluidos
    		public double readDoubleInRange(double lowerBound, double upperBound) {
    			double value;
    			do {
    				value = readDouble();
    				if (value < lowerBound || value > upperBound) {
    					System.err.printf("¡Error! El número debe estar entre %f y %f\n ", lowerBound, upperBound);
    				}
    			} while (value < lowerBound || value > upperBound);
    			return value;
    		}
    		
    		
    	    /*=== VALORES FLOAT ===*/
    			// Retorna un float introducido por el usuario 
    			public float readFloat() {
    				float value = 0;
    				boolean error;
    		
    				do {
    					try {
    						value = keyboard.nextFloat();
    						error = false;
    					} catch (InputMismatchException e) {
    						System.err.printf("¡Error! Eso no es un número float\n");
    						error = true;
    					} finally {
    						cleanInput();
    					}
    				} while (error);
    		
    				return value;
    			}
    
    			// Retorna un float introducido por el usuario inferior al prámetro
    			public float readFloatLessThan(float upperBound) {
    				float value;
    				do {
    					value = readFloat();
    					if (value >= upperBound) {
    						System.err.printf("¡Error! El número float debe ser menor que %f\n", upperBound);
    					}
    				} while (value >= upperBound);
    				return value;
    			}
    
    			// Retorna un double introducido por el usuario inferior o igual al parámetro
    			public float readFloatLessOrEqualThan(float upperBound) {
    				float value;
    				do {
    					value = readFloat();
    					if (value > upperBound) {
    						System.err.printf("¡Error! El número float debe ser menor o igual que %f\n", upperBound);
    					}
    				} while (value > upperBound);
    				return value;
    			}
    
    			// Retorna un float introducido por el usuario superior al parámetro
    			public float readFloatGreaterThan(float lowerBound) {
    				float value;
    				do {
    					value = readFloat();
    					if (value <= lowerBound) {
    						System.err.printf("¡Error! El número float debe ser mayor que %f\n", lowerBound);
    					}
    				} while (value <= lowerBound);
    				return value;
    			}
    
    			// Retorna un float introducido por el usuario superior o igual al parámetro
    			public float readFloatGreaterOrEqualThan(float lowerBound) {
    				float value;
    				do {
    					value = readFloat();
    					if (value < lowerBound) {
    						System.err.printf("¡Error! El número float debe ser mayor o igual que %f\n", lowerBound);
    					}
    				} while (value < lowerBound);
    				return value;
    			}
    
    			// Retorna un float introducido por el usuario cuyo valor esté en el rango [lowerBound, upperBound], ambos incluidos
    			public float readFloatInRange(float lowerBound, float upperBound) {
    				float value;
    				do {
    					value = readFloat();
    					if (value < lowerBound || value > upperBound) {
    						System.err.printf("¡Error! El número debe estar entre %f y %f\n ", lowerBound, upperBound);
    					}
    				} while (value < lowerBound || value > upperBound);
    				return value;
    			}
    	
    	/*=== CHAR ===*/
    		// Retorna un carácter introducido por el usuario. Si éste introduce más de un carácter, se le vuelve a solicitar
    		public char readChar() {
    			while (true) {
    				String input = keyboard.nextLine();
    				if (input.length() == 1) {
    					return input.charAt(0);
    				} else {
    					System.err.println("¡Error! Debes introducir solo un carácter.");
    				}
    			}
    		}
    
    	
    	/*=== STRING ===*/
    		// Retorna una cadena de caracteres introducida por el usuario
    		public String readString() {
    			return keyboard.nextLine();
    		}
    
    		// Retorna una cadena de carácteres de como máximo maxLength caracteres
    		public String readString(int maxLength) {
    			String input;
    			do {
    				input = readString();
    				if (input.length() > maxLength) {
    					System.err.printf("¡Error! La cadena no puede tener más de %d caracteres. ", maxLength);
    				}
    			} while (input.length() > maxLength);
    			return input;
    		}
    
    		// Retorna una cadena que no puede ser vacia
    		public String readStringNonEmpty() {
    			String input;
    			do {
    				input = readString().trim();
    				if (input.isEmpty()) {
    					System.err.printf("¡Error! No puedes dejarlo vacío.");
    				}
    			} while (input.isEmpty());
    			return input;
    		}
    
    		/* Retorna un booleano a partir de un carácter introducido por el usuario, de manera que si coincide con affirmativeValue 
    		(en mayúsculas o minúsculas) retornará true y si coincide con negativeValue (en mayúsculas o minúsculas), retornará false */
    		public boolean readBooleanUsingChar (char affirmativeValue, char negativeValue) {
    			while (true) {
    				char c = readChar();
    				if (Character.toLowerCase(c) == Character.toLowerCase(affirmativeValue)) {
    					return true;
    				} else if (Character.toLowerCase(c) == Character.toLowerCase(negativeValue)) {
    					return false;
    				} else {
    					System.err.printf("¡Error! Introduce un carácter válido.\n\"%c\" para sí o \"%c\" para no: ", affirmativeValue, negativeValue);
    				}
    			}
    		}
    
    		// Introduzca un caracter de un conjunto permitido (usando arrays)
    		public char readCharInOptions(char... options) {
    			while (true) {
    				char c = readChar();
    				for (char option : options) {
    					if (Character.toLowerCase(c) == Character.toLowerCase(option)) {
    						return c;
    					}	
    				}
            System.err.printf("¡Error! Introduce uno de los siguientes caracteres válidos: %s", Arrays.toString(options));
    			}
    		}


}
