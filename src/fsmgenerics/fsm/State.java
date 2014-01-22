package fsmgenerics.fsm ;

import java.util.ArrayList ;
import java.util.List ;

import fsmgenerics.IState ;

public class State implements IState<Fsm, State, Transition>
{
	String name ;
	Fsm owningFsm ;
	List<Transition> outgoingTransition ;
	List<Transition> incomingTransition ;
	
	public State() {
		outgoingTransition = new ArrayList<Transition>() ;
		incomingTransition = new ArrayList<Transition>() ;
	}
	
	@Override
	public String getName() {
		return name ;
	}

	@Override
	public void setName(String s) {
		name = s ;
	}

	@Override
	public Fsm getOwningFsm() {
		return owningFsm ;
	}
	
	@Override
	public void setOwningFsm(Fsm f) {
		owningFsm = f ;
	}

	@Override
	public List<Transition> getOutgoingTransition() {
		return outgoingTransition ;
	}

	@Override
	public List<Transition> getIncomingTransition() {
		return incomingTransition ;
	}
}
