package fsmgenerics ;

public interface ITransition<F extends IFsm<F, S, T>, S extends IState<F, S, T>, T extends ITransition<F, S, T>>
{
	String getInput() ;
	void setInput(String s) ;
	
	String getOutput() ;
	void setOutput(String s) ;
	
	S getSource() ;
	void setSource(S s) ;
	
	S getTarget() ;
	void setTarget(S s) ;
}
