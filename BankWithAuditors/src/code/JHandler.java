/**
 * 
 */
package code;

/**
 * @author oded
 *
 */
public class JHandler extends Handler {

	/* (non-Javadoc)
	 * @see code.Handler#handleRequest(code.Request)
	 */
	@Override
	public Boolean handleRequest(Request request) {
		String requestType = "J";

		if (requestType.equals(request.getRequestType())){
			String instruction = request.getInstruction();
			String instructionField = request.getInstructionField();
			System.out.println(instruction + "   " + instructionField);
			return true;
		} else {
			if(handler != null){
				this.handler.handleRequest(request);
				return false;
			}
		}
		return false;
	}

}
