package fsmgenerics ;

public interface Fsm_MT<F extends IFsm<F, S, T>, S extends IState<F, S, T>, T extends ITransition<F, S, T>>
{
	F getRoot() ;
	void setRoot(F f) ;
	
	public void print() ;
}
