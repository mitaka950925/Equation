	package exceptions;

public class IllegalCoeficientException extends IllegalArgumentException {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
IllegalCoeficientException(){
	
}
@Override 
public String getMessage(){
	return "You entered an illegal coefficient";
}
}