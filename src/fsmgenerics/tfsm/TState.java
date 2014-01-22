package fsmgenerics.tfsm ;

import java.util.ArrayList ;
import java.util.List ;

import fsmgenerics.IState ;

public class TState implements IState<TFsm, TState, TTransition>
{
	String name ;
	TFsm owningFsm ;
	List<TTransition> outgoingTransition ;
	List<TTransition> incomingTransition ;
	
	public TState() {
		outgoingTransition = new ArrayList<TTransition>() ;
		incomingTransition = new ArrayList<TTransition>() ;
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
	public TFsm getOwningFsm() {
		return owningFsm ;
	}
	
	@Override
	public void setOwningFsm(TFsm f) {
		owningFsm = f ;
	}

	@Override
	public List<TTransition> getOutgoingTransition() {
		return outgoingTransition ;
	}

	@Override
	public List<TTransition> getIncomingTransition() {
		return incomingTransition ;
	}
}
