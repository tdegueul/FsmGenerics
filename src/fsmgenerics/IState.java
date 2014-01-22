package fsmgenerics ;

import java.util.List ;

public interface IState<F extends IFsm<F, S, T>, S extends IState<F, S, T>, T extends ITransition<F, S, T>>
{
	String getName() ;
	void setName(String s) ;
	
	F getOwningFsm() ;
	void setOwningFsm(F f) ;
	
	List<T> getOutgoingTransition() ;
	
	List<T> getIncomingTransition() ;
}
