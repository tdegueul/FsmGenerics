package fsmgenerics.fsm ;

import fsmgenerics.ITransition ;

public class Transition implements ITransition<Fsm, State, Transition>
{
	String input ;
	String output ;
	State source ;
	State target ;
	
	@Override
	public String getInput() {
		return input ;
	}

	@Override
	public void setInput(String s) {
		input = s ;
	}

	@Override
	public String getOutput() {
		return output ;
	}

	@Override
	public void setOutput(String s) {
		output = s ;
	}

	@Override
	public State getSource() {
		return source ;
	}

	@Override
	public void setSource(State s) {
		source = s ;
	}

	@Override
	public State getTarget() {
		return target ;
	}

	@Override
	public void setTarget(State s) {
		target = s ;
	}
}
