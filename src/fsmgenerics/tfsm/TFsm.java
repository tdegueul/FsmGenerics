package fsmgenerics.tfsm ;

import java.util.ArrayList ;
import java.util.List ;

import fsmgenerics.IFsm ;

public class TFsm implements IFsm<TFsm, TState, TTransition>
{
	TState initialState ;
	List<TState> finalState ;
	List<TState> ownedState ;
	
	public TFsm() {
		finalState = new ArrayList<TState>() ;
		ownedState = new ArrayList<TState>() ;
	}
	
	@Override
	public TState getInitialState() {
		return initialState ;
	}

	@Override
	public void setInitialState(TState s) {
		initialState = s ;
	}

	@Override
	public List<TState> getFinalState() {
		return finalState ;
	}

	@Override
	public List<TState> getOwnedState() {
		return ownedState ;
	}
}
