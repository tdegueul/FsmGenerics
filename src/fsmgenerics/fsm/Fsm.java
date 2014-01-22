package fsmgenerics.fsm ;

import java.util.ArrayList ;
import java.util.List ;

import fsmgenerics.IFsm ;

public class Fsm implements IFsm<Fsm, State, Transition>
{
	State initialState ;
	List<State> finalState ;
	List<State> ownedState ;
	
	public Fsm() {
		finalState = new ArrayList<State>() ;
		ownedState = new ArrayList<State>() ;
	}
	
	@Override
	public State getInitialState() {
		return initialState ;
	}

	@Override
	public void setInitialState(State s) {
		initialState = s ;
	}

	@Override
	public List<State> getFinalState() {
		return finalState ;
	}

	@Override
	public List<State> getOwnedState() {
		return ownedState ;
	}
}
