package fsmgenerics ;

import java.util.List ;

public interface IFsm<F extends IFsm<F, S, T>, S extends IState<F, S, T>, T extends ITransition<F, S, T>>
{
	S getInitialState() ;
	void setInitialState(S s) ;
	
	List<S> getFinalState() ;
	
	List<S> getOwnedState() ;
}
